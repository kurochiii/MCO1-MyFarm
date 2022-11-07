import java.util.ArrayList;

public class MyFarm 
{
  private String Name;
  private Lot[][] farm = new Lot[1][1]; // side of board

  /**
   * This constructor sets the attribute stated in MyFarm class
   * @param Name
   */
  public MyFarm(String Name)
  {
    this.Name = Name;
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
    SeedList.add(turnip);

    Tool plow = new Tool("Plow", 0, 0.5);
    Tool wateringcan = new Tool("Watering Can", 0, 0.5);
    Tool fertilizer = new Tool("Fertilizer", 10, 4);
    ToolList.add(plow);
    ToolList.add(wateringcan);
    ToolList.add(fertilizer);
 
    FarmerType farmer = new FarmerType(0, 0, 0, 0, 0, 0);
    FarmerTypes.add(farmer);

    for (int row = 0; row < farm.length; row++) 
    { 
      for (int col = 0; col < farm[row].length; col++) 
        { 
          farm[row][col] = new Lot(row, col); // need to add randomizer for rocks 
        }
    }
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
