public class FarmerType{
    private String name;
    private int levelReq;
    private int bonusPro;
    private int seedReduc;
    private int waterBLI;
    private int fertilizerBLI;
    private int regFee;

    /**
     * The Constructor sets the different attributes stated in FarmerType class
     * @param name This parameter is the name of the farmer type
     * @param levelReq This parameter is the level requirment of the farmer type
     * @param bonusPro This parameter is the bonus earnings per produce of the farmer type
     * @param seedReduc This parameter is the seed cost reduction of the farmer type
     * @param waterBLI This parameter is the water bonus limit increase of the farmer type
     * @param fertilizerBLI This parameter is the fertilizer bonus limit increase of the farmer type
     * @param regFee This parameter is the registration fee of the farmer type
     */
    public FarmerType(String name, int levelReq, int bonusPro, int seedReduc,
                    int waterBLI, int fertilizerBLI, int regFee)
    {
        this.name = name;
        this.levelReq = levelReq;
        this.bonusPro = bonusPro;
        this.seedReduc = seedReduc;
        this.waterBLI = waterBLI;
        this.fertilizerBLI = fertilizerBLI;
        this.regFee = regFee;
    }
    
    /**
     * getLevelReq is the method that gets/returns the level requirment
     * @return the level Requirment
     */
    public int getLevelReq()
    {
        return this.levelReq;
    }
    
    /**
     * getBonusPro is the method that gets/returns the bonus earnings per produce
     * @return the bonus earnings per produce
     */
    public int getBonusPro()
    {
        return this.bonusPro;
    }

    /**
     * getSeedReduc is the method that gets/returns the seed cost reduction
     * @return the seed cost reduction
     */
    public int getSeedReduc()
    {
        return this.seedReduc;
    }

    /**
     * getWaterBLI is the method that gets/returns the water bonus limit increase
     * @return the water bonus limit increase
     */
    public int getWaterBLI()
    {
        return this.waterBLI;
    }

    /**
     * getFertilizerBLI is the method that gets/returns the fertilizer bonus limit increase
     * @return the fertilizer bonus limit increase
     */
    public int getFertilizerBLI()
    {
        return this.fertilizerBLI;
    }

    /**
     * getRegFee is the method that gets/returns the registration fee
     * @return the registration fee
     */
    public int getRegFee()
    {
        return this.regFee;
    }

    public String getName()
    {
        return this.name;
    }

}