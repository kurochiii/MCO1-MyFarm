import java.util.ArrayList;

public class Farmer {
    private int level;
    private FarmerType typeOfFarmer;
    private int objectCoin;

    public Farmer(int level, FarmerType typeOfFarmer, int objectCoin){
        this.level = level;
        this.typeOfFarmer = typeOfFarmer;
        this.objectCoin = objectCoin;
    }

    public void setObjectCoin(int objectCoin){
        this.objectCoin = 100; // Sets the starting object Coin amount to 100
    }
    public void setLevel(int level){
        this.level = 0; // Sets the starting level to 0
    }

    public boolean plantCrop(String nameOfSeed, int objectCoin,  ArrayList<Seed> seedList){
        boolean value = false; 
        
        for(Seed s : seedList){
            if(nameOfSeed.equals(s.getName())){ // If nameOfSeed is equal to any of the instances of seedList.getName
                if(objectCoin >= s.getSeedCost()){ // If you have enough objectCoin
                    objectCoin - s.getSeedCost();  // Minus cost to farmers object Coin
                    value = true; 
                }
                else{
                    System.out.println("Invalid amount of object coins");
                }
            }
            else{
                System.out.println("Seed does not exist");
            }
        }

        return value;
    }
    public boolean usePlow(String nameOfTool, int objectCoin, ArrayList<Tool> toolList){
        boolean value = false;
        
        for(Tool t : toolList){
            if(nameOfTool.equals(t.getName())){ // If nameOfTool is equal to any of the instances of toolList.getName
                if(objectCoin >= t.getCostofUsage()){ // If you have enough objectCoin
                    objectCoin - t.getCostofUsage(); // Minus cost to farmers object Coin
                    value = true;
                }
                else{
                    System.out.println("Invalid amount of object coins");
                }
            }
            else{
                System.out.println("Tool does not exist");
            }
        }

        return value;
    }

    public int getLevel(){
        return this.level;
    }
    /* 
    // Commented for the time being because not used for MCO1
    public FarmerType getTypeOfFarmer(){
        return this.typeOfFarmer;
    }
    */
    public int getObjectCoin(){
        return this.objectCoin;
    }
}