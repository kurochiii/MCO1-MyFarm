import java.util.ArrayList;

public class Farmer 
{
    private int level;
    private FarmerType typeofFarmer;
    private int objectCoin;
    private String name;

    public Farmer(String name, ArrayList<FarmerType> FarmerTypes)
    {
        this.name = name;
        this.level = 0;
        this.objectCoin = 100;
        this.typeofFarmer = FarmerTypes.get(0);
    }

    public boolean plantCrop(int index, int objectCoin,  ArrayList<Seed> seedList, Lot lot)
    {
        boolean value = false;

        if(objectCoin >= seedList.get(index).getSeedCost())  // If you have enough objectCoin
        {
            objectCoin -= seedList.get(index).getSeedCost();  // Minus cost to farmers object Coin
            lot.AddCrop(new Crop(seedList.get(index)));
            value = true; 
        }

        return value;
    }

    public boolean useTool(int index, int objectCoin, ArrayList<Tool> toolList, Lot lot)
    {
        boolean value = false;
        
        if(objectCoin >= toolList.get(index).getCostofUsage()) // If you have enough objectCoin
        { 
            objectCoin -= toolList.get(index).getCostofUsage(); // Minus cost to farmers object Coin
            switch(index)
            {
                case 0: 
                    lot.PlowLot();
                    break;
                case 1:
                    lot.getCrop().addWater();
                    break;
            }
            value = true;
        }
               
        return value;
    }

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
    public int getObjectCoin()
    {
        return this.objectCoin;
    }
}