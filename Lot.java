public class Lot 
{
    private Crop crop; 
    private boolean rock = true; 
    private boolean plowed = false; 
    private int xLocation; 
    private int yLocation;
    
    /**
     * This constructor sets the different attributes stated in Lot class
     * @param xLocation This parameter represents the x coordinate location of the lot
     * @param yLocation This parameter represents the y coordinate location of the lot
     */
    public Lot(int xLocation, int yLocation) // need to add randomizer for rocks 
    {
        this.plowed = false; 
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    /**
     * PlowLot is a method that makes plowed boolean value to true
     */
    public void PlowLot()
    {
        plowed = true;
    }

    /**
     * UnPlowLot is a method that makes plowed boolean value to false
     */
    public void UnPlowLot()
    {
        plowed = false;
    }

    /**
     * RemoveRock is a method that makes the rock boolean value to false
     */
    public void RemoveRock()
    {
        rock = false;
    }

    /**
     * AddCrop is a method that add a new crop
     * @param newCrop This parameter is the new crop that the farmer wants to add
     */
    public void AddCrop(Crop newCrop)
    {
        crop = newCrop;
    }

    /**
     * getxLocation is a method that gets/returns the x coordinate location of the lot
     * @return x coordinate location of the lot
     */
    public int getxLocation()
    {
        return xLocation;
    }

    /**
     * getyLocation is a method that gets/returns the y coordinate location of the lot
     * @return y coordinate location of the lot
     */
    public int getyLocation()
    {
        return yLocation;
    }

    /**
     * getCrop is a method that gets/returns the crop
     * @return the crop
     */
    public Crop getCrop()
    {
        return crop;
    }

    /**
     * getPlowed is the method that gets/returns the value of plowed
     * @return the value of plowed
     */
    public boolean getPlowed()
    {
        return plowed;
    }

    /**
     * HarvestCrop is a method that makes crop null since it is harvested
     */
    public void HarvestCrop()
    {
        crop = null;
    }
}
