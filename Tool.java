public class Tool 
{
    private String Name; 
    private int CostofUsage; 
    private int ExpGained;

    private Tool(String Name, int CostOfUsage, int ExpGained)
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

    public int getExpGained()
    {
        return ExpGained; 
    }
}
