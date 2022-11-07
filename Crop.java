public class Crop extends Seed
{
    private int TimesWatered; 
    private int TimesFertilized; 
    private int PlantedDays; 
    private int Products; 
    private int FinalHarvestPrice;

    public Crop(Seed seed)
    {
        super(seed.getName(), seed.getCropType(), seed.getHarvestTime(), seed.getWaterNeeds(), seed.getWaterBonus(), 
        seed.getFertilizerNeeds(), seed.getFertilizerBonus(), seed.getProductStart(), seed.getProductEnd(), seed.getSeedCost(),
        seed.getBasePrice(), seed.getExpYield());  

        this.TimesFertilized = 0;
        this.TimesWatered = 0;
        this.PlantedDays = 0 ;

    }

    public void addWater()
    {
        this.TimesWatered++;
    }

    public void addFertilizer()
    {
        this.TimesFertilized++;
    }

    public void nextDay()
    {
        this.PlantedDays++;
    }

    public boolean CheckforHarvest()
    {
        boolean ok = false; 

        if (PlantedDays == HarvestTime)
        {
            if (TimesFertilized >= FertilizerNeeds && TimesWatered >= WaterNeeds)
            {
                ok = true;
            }
        }

        return ok; 
    }

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

        FinalHarvestPrice = (int)finaldoubleprice;
    }

    public int getPlantedDays()
    {
        return PlantedDays;
    }

    public int getProducts()
    {
        return Products;
    }

    public int getFinalHarvestPrice()
    {
        return FinalHarvestPrice;
    }
}
