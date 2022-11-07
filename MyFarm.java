import java.util.ArrayList;

public class MyFarm 
{
  private String Name;
  private Lot[][] farm = new Lot[1][1]; // side of board

  MyFarm(String Name)
  {
    this.Name = Name;
  }

  private int TotalDays = 1; 

  private ArrayList<Seed> SeedList = new ArrayList<Seed>();
  private ArrayList<Tool> ToolList = new ArrayList<Tool>();
  private ArrayList<FarmerType> FarmerTypes = new ArrayList<FarmerType>();

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

  public int getTotalDays()
  {
    return TotalDays;
  }

  public ArrayList<FarmerType> getFarmerTypes()
  {
    return FarmerTypes;
  }

  public Lot[][] getFarm()
  {
    return farm;
  }

  public ArrayList<Seed> getSeedList()
  {
    return SeedList;
  }

  public ArrayList<Tool> getToolList()
  {
    return ToolList;
  }
}
