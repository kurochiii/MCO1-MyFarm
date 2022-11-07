import java.util.ArrayList;

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

    public boolean CheckforHarvest(Seed seed, int PlantedDays)
    {
        boolean ok = false; 

        if (PlantedDays == seed.HarvestTime)
        {
            if (TimesFertilized >= seed.getFertilizerNeeds() && TimesWatered >= seed.getWaterNeeds())
            {
                ok = true;
            }
        }

        return ok; 
    }

    public int getProducts(Seed seed)
    {   
        int products;
        if (seed.getProductStart() == seed.getProductEnd())
        {
            products = seed.getProductStart();
        }
        else
        {
            products = 21; // random placeholder
        }

        return products;
    }

    public int getFinalHarvestPrice(int Products, int TimesWatered, int TimesFertilized, Seed seed)
    {
        double finaldoubleprice; 
        double HarvestTotal, WaterBonus, FertilizerBonus;

        if (TimesWatered > seed.WaterNeeds + seed.WaterBonus)
        {
            TimesWatered = seed.WaterNeeds + seed.WaterBonus;
        }
        
        if (TimesFertilized > seed.FertilizerNeeds + seed.FertilizerBonus)
        {
            TimesFertilized = seed.FertilizerNeeds + seed.FertilizerBonus;
        }
        
        HarvestTotal = Products * (seed.getBasePrice());
        WaterBonus = HarvestTotal * 0.2 * (TimesWatered - 1);
        FertilizerBonus = HarvestTotal * 0.2 * (TimesFertilized -1);

        finaldoubleprice = HarvestTotal + WaterBonus + FertilizerBonus;

        return (int)finaldoubleprice;
    }
}
