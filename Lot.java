public class Lot 
{
    private Crop crop; 
    private boolean rock = true; 
    private boolean plowed = false; 
    private int xLocation; 
    private int yLocation;
    
    Lot(int xLocation, int yLocation) // need to add randomizer for rocks 
    {
        this.plowed = false; 
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public void PlowTile()
    {
        plowed = true;
    }

    public void RemoveRock()
    {
        rock = false;
    }

    public void AddCrop(Crop newCrop)
    {
        crop = newCrop;
    }

    public int getxLocation()
    {
        return xLocation;
    }

    public int getyLocation()
    {
        return yLocation;
    }

    public Crop getCrop()
    {
        return crop;
    }

}
