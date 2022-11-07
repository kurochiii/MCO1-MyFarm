public class Tool 
{
    private String Name; 
    private int CostofUsage; 
    private double ExpGained;

    public Tool(String Name, int CostOfUsage, double ExpGained)
    {
        this.Name = Name;
        this.CostofUsage = CostOfUsage; 
        this.ExpGained = ExpGained; 
    }

    public String getName()
    {
        return Name; 
    }

    public int getCostofUsage()
    {
        return CostofUsage; 
    }

    public double getExpGained()
    {
        return ExpGained; 
    }
}
