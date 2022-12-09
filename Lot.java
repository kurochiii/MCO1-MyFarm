public class Lot 
{
    private Crop crop = null; 
    private boolean rock = false; 
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

    public void AddRock()
    {
        rock = true;
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

    public boolean getRock()
    {
        return rock;
    }

    /**
     * HarvestCrop is a method that makes crop null since it is harvested
     */
    public void RemoveCrop()
    {
        crop = null;
    }
    
    public boolean plantable(MyFarm myfarm, Seed seed)
    {
      boolean result = false; 
      if (crop == null && plowed == true && rock == false)
      {
        if (seed.CropType.equals("Fruit Tree"))
        {
            if(xLocation != 0 && xLocation != 4 && yLocation != 0 && yLocation != 9)
            {
                if(myfarm.getFarm()[xLocation - 1][yLocation - 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation][yLocation - 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation + 1][yLocation - 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation - 1][yLocation].getCrop() == null &&
                   myfarm.getFarm()[xLocation - 1][yLocation - 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation + 1][yLocation].getCrop() == null &&
                   myfarm.getFarm()[xLocation - 1][yLocation + 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation][yLocation + 1].getCrop() == null &&
                   myfarm.getFarm()[xLocation + 1][yLocation + 1].getCrop() == null
                )
                {
                    result = true; 
                }
            }
        }
        else 
        {
            result = true; 
        }
      }
      return result;
    }
}
