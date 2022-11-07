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

    public boolean plantCrop(String nameOfSeed, int objectCoin,  ArrayList<Seed> seedList, Lot lot)
    {
        boolean value = false; 
        int index = 0;
        
        for(Seed s : seedList)
        {
            if(nameOfSeed.equals(s.getName()))  // If nameOfSeed is equal to any of the instances of seedList.getName
            { 
                if(objectCoin >= s.getSeedCost())  // If you have enough objectCoin
                {
                    objectCoin -= s.getSeedCost();  // Minus cost to farmers object Coin
                    value = true; 
                    lot.AddCrop(new Crop(s));
                }
                else
                {
                    System.out.println("Invalid amount of object coins");
                }
            }

            else
            {
                System.out.println("Seed does not exist");
            }

            index ++;
        }

        return value;
    }

    public boolean usePlow(String nameOfTool, int objectCoin, ArrayList<Tool> toolList, Lot lot)
    {
        boolean value = false;
        
        for(Tool t : toolList)
        {
            if(nameOfTool.equals(t.getName()))  // If nameOfTool is equal to any of the instances of toolList.getName
            {
                if(objectCoin >= t.getCostofUsage()) // If you have enough objectCoin
                { 
                    objectCoin -= t.getCostofUsage(); // Minus cost to farmers object Coin
                    value = true;
                    lot.PlowTile();
                }
                else
                {
                    System.out.println("Invalid amount of object coins");
                }
            }

            else
            {
                System.out.println("Tool does not exist");
            }
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