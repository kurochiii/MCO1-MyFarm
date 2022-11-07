public class Seed
{
    protected String Name;
    protected String CropType;
    protected int numberCT; // crop type into integer
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

    public Seed(String Name, String CropType, int HarvestTime, int WaterNeeds,
                int WaterBonus, int FertilizerNeeds, int FertilizerBonus, int ProductStart,
                int ProductEnd, int SeedCost, int BasePrice, int ExpYield)
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
        
        //if (CropType = smth ) then number CT = 1,2, or 3
    }

    public void updateSeed(FarmerType FarmerChange)
    {
        int addedPrice = FarmerChange.getBonusPro();

        BasePrice = BasePrice + addedPrice;
    
        int reductedCost = FarmerChange.getSeedReduc();

        SeedCost = SeedCost - reductedCost;

        int addedWBonus = FarmerChange.getSeedReduc();

        WaterBonus = WaterBonus + addedWBonus;
    
        int addedFBonus = FarmerChange.getSeedReduc();

        FertilizerBonus = FertilizerBonus + addedFBonus;
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
