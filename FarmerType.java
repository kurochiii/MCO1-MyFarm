public class FarmerType{
    private int levelReq;
    private int bonusPro;
    private int seedReduc;
    private int waterBLI;
    private int fertilizerBLI;
    private int regFee;

    public FarmerType(int levelReq, int bonusPro, int seedReduc,
                    int waterBLI, int fertilizerBLI, int regFee)
    {
        this.levelReq = levelReq;
        this.bonusPro = bonusPro;
        this.seedReduc = seedReduc;
        this.waterBLI = waterBLI;
        this.fertilizerBLI = fertilizerBLI;
        this.regFee = regFee;
    }

    public int getLevelReq()
    {
        return this.levelReq;
    }

    public int getBonusPro()
    {
        return this.bonusPro;
    }

    public int getSeedReduc()
    {
        return this.seedReduc;
    }

    public int getWaterBLI()
    {
        return this.waterBLI;
    }

    public int getFertilizerBLI()
    {
        return this.fertilizerBLI;
    }

    public int getRegFee()
    {
        return this.regFee;
    }
}