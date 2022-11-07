import java.util.Scanner;

public class Driver 
{
    public static void main(String args[])
    {
        boolean play = true;
        boolean lose = false; 

        Scanner sc = new Scanner(System.in);

        while (play == true)
        {
            MyFarm newFarm = new MyFarm("Name of Farm");
            newFarm.setGame();

            Farmer myFarmer = new Farmer("Name", newFarm.getFarmerTypes());

            // intro 
            while (lose == false)
            {
                System.out.println("Day" + newFarm.getTotalDays());
                
                System.out.println("Current Lots");

                for (int row = 0; row < newFarm.getFarm().length; row++) 
                { 
                    for (int col = 0; col < newFarm.getFarm()[row].length; col++) 
                    { 
                        System.out.println("(" + newFarm.getFarm()[row][col].getxLocation() + " , " + newFarm.getFarm()[row][col].getyLocation() + ")");
                    }
                }

                System.out.println("Select a Lot:");
                System.out.print("X:");
                int X = sc.nextInt();
                System.out.print("Y:");
                int Y = sc.nextInt();

                System.out.println("Selected Lot (" + X + " , " + Y + ")");
                System.out.println("Lot Details: ");

                if(newFarm.getFarm()[X][Y].getPlowed()) // if its true 
                {
                    System.out.println("Plowed");
                    
                    if(newFarm.getFarm()[X][Y].getCrop() == null)
                    {
                        System.out.println("No Crop");
                    }
                    else 
                    {
                        System.out.println(newFarm.getFarm()[X][Y].getCrop().getName());
                    }
                
                }
                else
                {
                    System.out.println("Unplowed");
                }

                System.out.println("Possible Actions");
                int PlantNum = 1; 
                int PlowNum = 2; 
                int None = 0;
                int WaterNum = 3; 
                int FertilizeNum = 4; 
                int HarvestNum = 5; 
                int RemoveCropNum = 6;
                int Action = 10;

                while (Action != 0)
                {
                    if(newFarm.getFarm()[X][Y].getPlowed())
                    {
                        
                        if(newFarm.getFarm()[X][Y].getCrop() == null)
                        {
                            System.out.println("[" + PlantNum + "]" + "Plant Crop");
                        }
                        else 
                        {   
                            if (newFarm.getFarm()[X][Y].getCrop().getPlantedDays() < newFarm.getFarm()[X][Y].getCrop().getHarvestTime())
                            {
                                System.out.println("[" + WaterNum + "]" + "Water Crop");
                                System.out.println("[" + FertilizeNum + "]" + "Fertilize Crop");
        
                                if(newFarm.getFarm()[X][Y].getCrop().CheckforHarvest())
                                {
                                    System.out.println("[" + HarvestNum + "]" + "Harvest Crop"); // ADD STUFF
                                }
                            }
                            else 
                            {
                                System.out.println("[" + RemoveCropNum + "]" + "Remove Withered Crop");
                            }
                            
                        }

                    }
                    else 
                    {
                        System.out.println("[" + PlowNum + "]" + "Plow Lot");
                    }

                    System.out.println("[" + None + "]" + "Proceed to Next Day");

                    System.out.print("Select an action:");
                    Action = sc.nextInt();

                    switch (Action)
                    {
                        case 1: 
                            int choice; 
                            for(int i = 0; i < newFarm.getSeedList().size(); i++)
                            {
                                System.out.println("[" + i + "]" + newFarm.getSeedList().get(i).getName());
                            }
                            System.out.println("Which seed would you like to Plant?");
                            choice = sc.nextInt();

                            myFarmer.plantCrop(choice, myFarmer.getObjectCoin(), newFarm.getSeedList(), newFarm.getFarm()[X][Y]);

                        case 2:
                            if (myFarmer.useTool(0, myFarmer.getObjectCoin(), newFarm.getToolList(), newFarm.getFarm()[X][Y])) // index 0 is plow
                            {
                                System.out.println("Sucessfully Plowed Lot");
                            }

                        //case 3:
                        //case 4:
                        //case 5:
                    }
                }
                
            }

        } 

    }
}