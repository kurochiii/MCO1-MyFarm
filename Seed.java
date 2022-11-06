public class Seed
{
    protected String Name;
    protected String CropType;
    protected int HarvestTime;
    protected int WaterNeeds;
    protected int WaterBonus;
    protected int FertilizerNeeds;
    protected int FertilizerBonus;
    protected int ProductStart;
    protected int ProductEnd;
    protected int SeedCost;
    protected int BasePrice;
    protected int ExpYield;
    protected FarmerType FarmerChange; // I added this for setters we can discuss tom if this is needed

    public Seed(String Name, String CropType, int HarvesTime, int WaterNeeds,
                int WaterBonus, int FertilizerNeeds, int FertilizerBonus, int ProductStart,
                int ProductEnd, int SeedCost, int FasePrice, int ExpYield, FarmerType FarmerChange)
    {
        this.Name = Name;
        this.CropType = CropType;
        this.HarvestTime = HarvestTime;
        this.WaterNeeds = WaterNeeds;
        this.WaterBonus = WaterBonus;
        this.FertilizerNeeds = FertilizerNeeds;
        this.FertilizerBonus = FertilizerBonus;
        this.ProductStart = ProductStart;
        this.ProductEnd =  ProductEnd;
        this.SeedCost = SeedCost;
        this.BasePrice = BasePrice;
        this.ExpYield = ExpYield;
        this.FarmerChange = FarmerChange;
    }

    public int setBasePrice(FarmerType FarmerChange, int BasePrice)
    {
        int addedPrice = this.FarmerChange.getBonusPro();

        BasePrice = BasePrice + addedPrice;

        return BasePrice;
    }

    public int setSeedCost(FarmerType FarmerChange, int SeedCost)
    {
        int reductedCost = this.FarmerChange.getSeedReduc();

        SeedCost = SeedCost - reductedCost;

        return SeedCost;
    }

    public int setWaterBonus(FarmerType farmerChange, int WaterBonus)
    {
        int addedWBonus = this.FarmerChange.getSeedReduc();

        WaterBonus = WaterBonus + addedWBonus;

        return WaterBonus;
    }

    public int setFertilizerBonus(FarmerType farmerChange, int FertilizerBonus)
    {
        int addedFBonus = this.FarmerChange.getSeedReduc();

        FertilizerBonus = FertilizerBonus + addedFBonus;

        return FertilizerBonus;
    }

    public String getName()
    {
        return Name;
    }

    public String getCropType()
    {
        return CropType; 
    }

    public int getHarvestTime()
    {
        return HarvestTime;
    }
    
    public int getWaterNeeds()
    {
        return WaterNeeds;
    }

    public int getWaterBonus()
    {
        return WaterBonus;
    }

    public int getFertilizerNeeds()
    {
        return FertilizerNeeds;
    }

    public int getFertilizerBonus()
    {
        return FertilizerBonus;
    }

    public int getProductStart()
    {
        return ProductStart;
    }

    public int getProductEnd()
    {
        return ProductEnd;
    }

    public int getSeedCost()
    {
        return SeedCost;
    }

    public int getBasePrice()
    {
        return BasePrice; 
    }

    public int getExpYield()
    {
        return ExpYield;
    }
}
