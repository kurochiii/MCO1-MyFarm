public class Seed
{
    private String name;
    private String cropType;
    private int harvesTime;
    private int waterNeeds;
    private int waterBonus;
    private int fertilizerNeeds;
    private int fertilizerBonus;
    private int productStart;
    private int productEnd;
    private int seedCost;
    private int basePrice;
    private int expYield;
    private FarmerType farmerChange; // I added this for setters we can discuss tom if this is needed

    public Seed(String name, String cropType, int harvesTime, int waterNeeds,
                int waterBonus, int fertilizerNeeds, int fertilizerBonus, int productStart,
                int productEnd, int seedCost, int basePrice, int expYield, FarmerType farmerChange)
    {
        this.name = name;
        this.cropType = cropType;
        this.harvesTime = harvesTime;
        this.waterNeeds = waterNeeds;
        this.waterBonus = waterBonus;
        this.fertilizerNeeds = fertilizerNeeds;
        this.fertilizerBonus = fertilizerBonus;
        this.productStart = productStart;
        this.productEnd =  productEnd;
        this.seedCost = seedCost;
        this.basePrice = basePrice;
        this.expYield = expYield;
        this.farmerChange = farmerChange;
    }

    public int setBasePrice(FarmerType farmerChange, int basePrice)
    {
        int addedPrice = this.farmerChange.getBonusPro();

        basePrice = basePrice + addedPrice;

        return basePrice;
    }

    public int setSeedCost(FarmerType farmerChange, int seedCost)
    {
        int reductedCost = this.farmerChange.getSeedReduc();

        seedCost = seedCost - reductedCost;

        return seedCost;
    }

    public int setWaterBonus(FarmerType farmerChange, int WaterBonus)
    {
        int addedWBonus = this.farmerChange.getSeedReduc();

        WaterBonus = WaterBonus + addedWBonus;

        return WaterBonus;
    }

    public int setFertilizerBonus(FarmerType farmerChange, int FertilizerBonus)
    {
        int addedFBonus = this.farmerChange.getSeedReduc();

        FertilizerBonus = FertilizerBonus + addedFBonus;

        return FertilizerBonus;
    }


}