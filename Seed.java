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
    protected double ExpYield;

    /**
     * The constructor sets the different attributes stated in Seed class
     * @param Name This parameter is the name of the seed
     * @param CropType This parameter is the cropType or seedType
     * @param HarvestTime This parameter is the harvest time
     * @param WaterNeeds This parameter is the amount of water needed to be harvested
     * @param WaterBonus This parameter is the amount of water that can be taken into account
     * @param FertilizerNeeds This parameter is the amount of fertilizer needed to be harvested
     * @param FertilizerBonus This parameter is the amount of fertilizer actions that can be taken into account
     * @param ProductStart This parameter is the starting range of the possible number of products
     * @param ProductEnd This parameter is the ending range of the possible number of products
     * @param SeedCost This parameter is the cost of the seed/crop depending on the farmers type
     * @param BasePrice This parameter is the Base Price depending on the farmers type
     * @param ExpYield This parameter is the amount of experience yielded from harvesting the crop
     */
    public Seed(String Name, String CropType, int HarvestTime, int WaterNeeds,
                int WaterBonus, int FertilizerNeeds, int FertilizerBonus, int ProductStart,
                int ProductEnd, int SeedCost, int BasePrice, double ExpYield)
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

    /**
     * updateSeed is a method where it updates the different parameters that a farmerType has an effect on
     * @param FarmerChange This parameter changes the different parameters in seed that the farmerType affects
     */
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

    /**
     * getName is a method that gets/returns the name
     * @return the name
     */
    public String getName()
    {
        return Name;
    }

    /**
     * getCropType is a method that gets/returns the crop/seed type
     * @return the crop/seed type
     */
    public String getCropType()
    {
        return CropType; 
    }

    /**
     * getHarvesTime is a method that gets/returns the harvest time
     * @return the harvest time
     */
    public int getHarvestTime()
    {
        return HarvestTime;
    }
    
    /**
     * getWaterNeeds is a method that gets/returns that the amount of water needed to be harvested
     * @return the amount of water needed to be harvested
     */
    public int getWaterNeeds()
    {
        return WaterNeeds;
    }

    /**
     * getWaterBonus is the method that gets/returns the amount of water that can be taken into account
     * @return the amount of water that can be taken into account
     */
    public int getWaterBonus()
    {
        return WaterBonus;
    }

    /**
     * getFertilizerNeeds is a method that gets/returns the amount of fertilizer needed to be harvested
     * @return the amount of fertilizer needed to be harvested
     */
    public int getFertilizerNeeds()
    {
        return FertilizerNeeds;
    }

    /**
     * getFertilizerBonus is the method that gets/returns the amount of fertilizer actions that can be taken into account
     * @return the amount of fertilizer actions that can be taken into account
     */
    public int getFertilizerBonus()
    {
        return FertilizerBonus;
    }

    /**
     * getProductStart is the method that gets/returns the starting range of the possible number of products
     * @return the starting range of the possible number of products
     */
    public int getProductStart()
    {
        return ProductStart;
    }

    /**
     * getProductEnd is the method that gets/returns the ending range of the possible number of products
     * @return the ending range of the possible number of products
     */
    public int getProductEnd()
    {
        return ProductEnd;
    }

    /**
     * getSeedCost is the method that gets/returns the cost of the seed/crop depending on the farmers type
     * @return the cost of the seed/crop depending on the farmers type
     */
    public int getSeedCost()
    {
        return SeedCost;
    }

    /**
     * getBasePrice is the method gets/returns the Base Price depending on the farmers type
     * @return the Base Price depending on the farmers type
     */
    public int getBasePrice()
    {
        return BasePrice; 
    }

    /**
     * getExpYield is the method that gets/returns the amount of experience yielded from harvesting the crop
     * @return the amount of experience yielded from harvesting the crop
     */
    public double getExpYield()
    {
        return ExpYield;
    }
}
