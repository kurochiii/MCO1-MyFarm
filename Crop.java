public class Crop extends Seed
{
    private int TimesWatered; 
    private int TimesFertilized; 
    private int PlantedDays; 
    private int Products; 
    private int FinalHarvestPrice;
    private int status; 

    /**
     * This contructor allows the Crop class to instantiate the Seed class
     * @param seed This parameter is an object of the seed class
     */
    public Crop(Seed seed)
    {
        super(seed.getName(), seed.getCropType(), seed.getHarvestTime(), seed.getWaterNeeds(), seed.getWaterBonus(), 
        seed.getFertilizerNeeds(), seed.getFertilizerBonus(), seed.getProductStart(), seed.getProductEnd(), seed.getSeedCost(),
        seed.getBasePrice(), seed.getExpYield());  

        this.status = 0; 
        this.TimesFertilized = 0;
        this.TimesWatered = 0;
        this.PlantedDays = 0 ;

    }

    /**
     * addWater is a method that adds the times this. was watered
     */
    public void addWater()
    {
        this.TimesWatered++;
    }

    /**
     * addFertilizer is a method that adds the times this. was fertilized
     */
    public void addFertilizer()
    {
        this.TimesFertilized++;
    }

    /**
     * nextDay is a method that adds to the amount of planted days
     */
    public void nextDay()
    {
        this.PlantedDays++;
    }

    /**
     * CheckforHarvest is a method if a crop meets the requirements of being harvested
     * @return a boolean value that shows if crop can be harvested
     */
    public int CheckStatus()
    {
        if (PlantedDays == HarvestTime)
        {
            if (TimesFertilized >= FertilizerNeeds && TimesWatered >= WaterNeeds)
            {
                status = 1;
            }
        }
        else if(PlantedDays > HarvestTime)
        {
            status = 2;
        }
        else 
        {
            status = 0;
        }

        return status; 
    }

    /**
     * calcProducts is a method that calculates the products
     */
    public void calcProducts()
    {   
        int products;
        if (getProductStart() == getProductEnd())
        {
            products = getProductStart();
        }
        else
        {
            products = (int)Math.floor(Math.random() * (ProductEnd - ProductStart + 1) + ProductStart);
        }

        Products = products;
    }

    /**
     * calcFinalHarvestPrice is a method that calculates the final harvest price once a crop is harvested
     */
    public void calcFinalHarvestPrice()
    {
        double finaldoubleprice; 
        double HarvestTotal, WBonus, FBonus;

        if (TimesWatered > WaterNeeds + WaterBonus)
        {
            TimesWatered = WaterNeeds + WaterBonus;
        }
        
        if (TimesFertilized > FertilizerNeeds + FertilizerBonus);
        {
            TimesFertilized = FertilizerNeeds + FertilizerBonus;
        }
        
        HarvestTotal = Products * (getBasePrice());
        WBonus = HarvestTotal * 0.2 * (TimesWatered - 1);
        FBonus = HarvestTotal * 0.2 * (TimesFertilized -1);

        finaldoubleprice = HarvestTotal + WBonus + FBonus;

        if(CropType.equals("Flower"))
            finaldoubleprice = finaldoubleprice * 1.1;

        FinalHarvestPrice = (int)finaldoubleprice;
    }

    /**
     * getPlantedDays is a method that gets/returns the planted days
     * @return the planted days
     */
    public int getPlantedDays()
    {
        return PlantedDays;
    }

    /**
     * getProducts is a method that gets/returns the products
     * @return the products
     */
    public int getProducts()
    {
        return Products;
    }

    /**
     * getFinalHarvestPrice is a method that gets/returns the final harvest price
     * @return the final harvest price
     */
    public int getFinalHarvestPrice()
    {
        return FinalHarvestPrice;
    }

    
    /** 
     * getTimesWater is a method that gets/returns the times a crop was watered
     * @return Times crop has been watered
     */
    public int getTimesWatered()
    {
        return TimesWatered;
    }

    
    /** 
     * getTimesFertilized is a method that gets/returns the times a crop was fertilized
     * @return Times crop has been fertilized
     */
    public int getTimesFertilized()
    {
        return TimesFertilized;
    }
}
