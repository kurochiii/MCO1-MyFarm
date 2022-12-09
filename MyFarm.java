import java.util.ArrayList;

public class MyFarm 
{
  private Lot[][] farm = new Lot[5][10]; // side of board

  /**
   * This constructor sets the attribute stated in MyFarm class
   * @param Name
   */
  public MyFarm()
  {

  }

  private int TotalDays = 1; 

  private ArrayList<Seed> SeedList = new ArrayList<Seed>();
  private ArrayList<Tool> ToolList = new ArrayList<Tool>();
  private ArrayList<FarmerType> FarmerTypes = new ArrayList<FarmerType>();

  /**
   * setGame is a method that sets the different seeds, tools, and farmerType that is needed to be initialized in the
   * different array lists
   */
  public void setGame()
  {
    Seed turnip = new Seed("Turnip", "Root Crop", 2, 1, 2, 0, 1, 1, 2, 5, 6, 5);
    Seed carrot = new Seed("Carot","Root Crop",3,1,2,0,1,1,2,10,9,7.5);
    Seed potato = new Seed("Potato", "Root Crop", 5, 3, 4, 1, 2, 1, 10, 20, 3, 12.5);
    Seed rose = new Seed("Rose", "Flower", 1, 1, 2, 0, 1, 1, 1, 5, 5, 2.5);
    Seed tulips = new Seed("Tulips", "Flower", 2, 2, 3, 0, 1, 1, 1, 10, 9, 5);
    Seed sunflower = new Seed("Sunflower", "Flower", 3, 2, 3, 1, 2, 1, 1, 20, 19, 5);
    Seed mango = new Seed("Mango", "Fruit Tree", 10, 7, 7, 4, 4, 5, 15, 100, 8, 25);
    Seed apple = new Seed("Apple", "Fruit Tree", 10, 7, 7, 5, 5, 10, 15, 200, 5, 25);
    
    SeedList.add(turnip);
    SeedList.add(carrot);
    SeedList.add(potato);
    SeedList.add(rose);
    SeedList.add(tulips);
    SeedList.add(sunflower);
    SeedList.add(mango);
    SeedList.add(apple);

    Tool plow = new Tool("Plow", 0, 0.5); // CHANGE
    Tool wateringcan = new Tool("Watering Can", 0, 0.5);
    Tool fertilizer = new Tool("Fertilizer", 10, 4);
    Tool pickaxe = new Tool("Pickaxe", 50, 15);
    Tool shovel = new Tool("Shovel", 7, 2);

    ToolList.add(plow);
    ToolList.add(wateringcan);
    ToolList.add(fertilizer);
    ToolList.add(pickaxe);
    ToolList.add(shovel);
 
    FarmerType farmer = new FarmerType("Farmer", 0, 0, 0, 0, 0, 0);
    FarmerType Rfarmer = new FarmerType("Registered Farmer", 5, 1, 1, 0, 0, 200);
    FarmerType Dfarmer = new FarmerType("Distinguished Farmer", 10, 2, 2, 1, 0, 300);
    FarmerType Lfarmer = new FarmerType("Legendary Farmer", 15, 4, 3, 2, 1, 400);

    FarmerTypes.add(farmer);
    FarmerTypes.add(Rfarmer);
    FarmerTypes.add(Dfarmer);
    FarmerTypes.add(Lfarmer);

    for (int row = 0; row < farm.length; row++) 
    { 
      for (int col = 0; col < farm[row].length; col++) 
        { 
          farm[row][col] = new Lot(row, col); // need to add randomizer for rocks 
        }
    }
    
    int rocknum = (int)Math.floor(Math.random()*(30-10+1)+10);
    int i = 0; 
    do 
    {
      int j = (int)Math.floor(Math.random()*(4-0+1)+0);
      int k = (int)Math.floor(Math.random()*(9-0+1)+0);
      if(farm[j][k].getRock() == false)
      {
        farm[j][k].AddRock();
        i++;
      } 
    } while (i < rocknum);
    
  }

  /**
   * NewDay is a method that adds a new day, and to the TotalDays
   */
  public void NewDay()
  {
    TotalDays++;

    for (int row = 0; row < farm.length; row++) 
    { 
      for (int col = 0; col < farm[row].length; col++) 
        { 
          if (farm[row][col].getCrop() != null)
          {
            farm[row][col].getCrop().nextDay();
          }
        }
    }
  }

  /**
   * getTotalDays is a method that gets/returns the total amount of days
   * @return the total amount of days
   */
  public int getTotalDays()
  {
    return TotalDays;
  }

  /**
   * getFarmerTypes is a method that gets/returns the array list of farmer types
   * @return the array list of farmer types
   */
  public ArrayList<FarmerType> getFarmerTypes()
  {
    return FarmerTypes;
  }

  /**
   * getFarm is a method that gets/returns the whole lot/farm
   * @return the whole lot/farm
   */
  public Lot[][] getFarm()
  {
    return farm;
  }

  /**
   * getSeedList is a method that gets/returns the array list of Seed
   * @return the array list of seeds
   */
  public ArrayList<Seed> getSeedList()
  {
    return SeedList;
  }

  /**
   * getToolList is a method that gets/returns the array list of Tool
   * @return the array list of Tool
   */
  public ArrayList<Tool> getToolList()
  {
    return ToolList;
  }

}
