import java.util.ArrayList;

public class Farmer 
{
    private double experience;
    private int level;
    private FarmerType typeofFarmer;
    private int objectCoin;
    private String name;

    /**
     * This constructor sets the different attributes in the Farmer class
     * @param name This parameter is the name of the Farmer
     * @param FarmerTypes This parameter is an arraylist of FarmerType
     */
    public Farmer(ArrayList<FarmerType> FarmerTypes)
    {
        this.experience = 0;
        this.level = 0; //Set starting level to 0
        this.objectCoin = 100; //Set starting object coin to 100
        this.typeofFarmer = FarmerTypes.get(0);
    }

    /**
     * plantCrop is a method that allows a farmer to plant a crop if it has enough object coins for the crop
     * @param index This parameter is the index of the specific seed in the seedList
     * @param seedList This parameter is an ArrayList of seed
     * @param lot This parameter the location of where the method would take place
     * @return a boolean value that shows if the action was successful
     */
    public boolean plantCrop(int index, ArrayList<Seed> seedList, Lot lot)
    {
        boolean value = false;

        if(objectCoin >= seedList.get(index).getSeedCost())  // If you have enough objectCoin
        {
            objectCoin =  objectCoin - seedList.get(index).getSeedCost();  // Minus cost to farmers object Coin
            lot.AddCrop(new Crop(seedList.get(index)));
            value = true; 
        }
        return value;
    }

    /**
     * useTool is a method that allows the farmer to use a tool if it has enough object coins for the tool
     * @param index This parameter represents the index of the specific tool asked for in the tool list
     * @param toolList This parameter is a array list of Tool
     * @param lot This parameter is the location of where the method would take place
     * @return a boolean value representing if the action was successful
     */
    public boolean useTool(int index, ArrayList<Tool> toolList, Lot lot)
    {
        boolean value = false;
        
        if(objectCoin >= toolList.get(index).getCostofUsage()) // If you have enough objectCoin
        { 
            objectCoin = objectCoin - toolList.get(index).getCostofUsage(); // Minus cost to farmers object Coin
            switch(index)
            {
                case 0: 
                    lot.PlowLot();
                    value = true; 
                    break;
                case 1:
                    lot.getCrop().addWater();
                    value = true; 
                    break;
                case 2: 
                    lot.getCrop().addFertilizer();
                    value = true; 
                    break;
                case 3: 
                    lot.RemoveRock();
                    value = true;
                    break;
                case 4:
                    lot.RemoveCrop();
                    lot.UnPlowLot();
                    value = true;
            }
            value = true;
            experience = experience + toolList.get(index).getExpGained();
            convertexp();
        }
               
        return value;
    }

    /**
     * harvestCrop is a method that allows the farmer to harvestcrop and adds the resulting 
     * harvest price to the farmers object coins
     * @param lot This parameter is the location of where the method is taking place
     * @return a boolean value signaling if the method was successful
     */
    public boolean harvestCrop(Lot lot)
    {
        boolean value = false;

        lot.getCrop().calcProducts();
        lot.getCrop().calcFinalHarvestPrice();

        objectCoin = objectCoin + lot.getCrop().getFinalHarvestPrice();

        lot.UnPlowLot();
        lot.RemoveCrop();

        value = true;
        return value;
    }
    
    public void convertexp()
    {
        if (experience >= 100 && experience < 1000)
        {
            level = (int)experience / 100;
        }
    }

    /**
     * getLevel is a method that gets/returns the farmers level
     * @return the farmers level
     */
    public int getLevel()
    {
        return this.level;
    }

    /* 
    // Commented for the time being because not used for MCO1
    public FarmerType getTypeOfFarmer(){
        return this.typeOfFarmer;
    }
    */

    /**
     * getObjectCoin is a method that gets/returns the farmers object coins
     * @return the farmers object coins
     */
    public int getObjectCoin()
    {
        return this.objectCoin;
    }

    public double getExp()
    {
        return this.experience;
    }

    public boolean checkRegFarmer()
    {
        boolean result = false; 
        
        if (level >= typeofFarmer.getLevelReq()+ 5 && typeofFarmer.getLevelReq() != 15)
        {
            result = true;
        }

        return result; 
    }

    public void upgradeFarmer(ArrayList<FarmerType> FarmerTypes)
    {
        this.typeofFarmer = FarmerTypes.get((typeofFarmer.getLevelReq() + 5)/5);
        objectCoin = objectCoin - typeofFarmer.getRegFee();
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public FarmerType getType()
    {
        return typeofFarmer;
    }

}