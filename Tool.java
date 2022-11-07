public class Tool 
{
    private String Name; 
    private int CostofUsage; 
    private double ExpGained;

    /**
     * This constructor sets the different attributes in the Tool class
     * @param Name This parameter is the name of the tool
     * @param CostOfUsage This parameter is the cost of using a tool
     * @param ExpGained This parameter is the experienced gained after using a tool
     */
    public Tool(String Name, int CostOfUsage, double ExpGained)
    {
        this.Name = Name;
        this.CostofUsage = CostOfUsage; 
        this.ExpGained = ExpGained; 
    }

    /**
     * getName is the method that gets/returns the name of the tool
     * @return the name of the tool
     */
    public String getName()
    {
        return Name; 
    }

    /**
     * getCostofUsage is the method that gets/returns the cost of using a tool
     * @return the cost of using a tool
     */
    public int getCostofUsage()
    {
        return CostofUsage; 
    }

    /**
     * getExpGained is the method that gets/returns the experienced gained after using a tool
     * @return the experienced gained after using a tool
     */
    public double getExpGained()
    {
        return ExpGained; 
    }
}
