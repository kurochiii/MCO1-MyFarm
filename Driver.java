import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class Driver 
{
    public static void main(String args[])
    {
        boolean play = true;
        boolean lose = false; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Our Farming Simultor's First Prototype!");
        System.out.println("");
        System.out.println("This code was done in partial fulfillment for CCPROG3 ");  // Brief Introduction
        System.out.println("and was created by Matthew Escober and Julianne Ong");
        System.out.println("");
        System.out.println("Would you like to begin the simulation?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.println("");
        System.out.print("Answer:");
        int start = sc.nextInt();
        System.out.println("");
        System.out.println("");
        
        if (start == 1)
        {
            while (play == true) // Start of the Game 
            {
                System.out.println("--------------------------------------------");
                System.out.println("");
                System.out.println("Welcome to Farm Simulator!");
                System.out.println("");
                System.out.println("");

                System.out.println("Before you working on your virtual farm...");
                System.out.println("What would you like to name your new farm?");    // Name and generate new Farm
                sc.nextLine();
                String FarmName = sc.nextLine();

                MyFarm newFarm = new MyFarm(FarmName);
                newFarm.setGame();

                System.out.println("");
                System.out.println("Congatulations! Your you firtual farm is now named " + FarmName);
                System.out.println("");

                System.out.println("Time to register as a farmer!");
                System.out.println("What is your name?");                           // Name and generate new Farmer
                String FarmerName = sc.nextLine();

                Farmer myFarmer = new Farmer(FarmerName, newFarm.getFarmerTypes());

                System.out.println("");
                System.out.println("Welcome Farmer " + FarmerName + "!");
                System.out.println("You may now begin working on your farm");
                System.out.println("");

                // Completed Intro 
                while (lose == false)
                {
                    System.out.println("--------------------------------------------");
                    System.out.println("");
                    System.out.println("Day " + newFarm.getTotalDays());            // Prints Number of Day 
                    System.out.println("");         
                    
                    System.out.println("Current Lots: ");

                    for (int row = 0; row < newFarm.getFarm().length; row++) 
                    { 
                        for (int col = 0; col < newFarm.getFarm()[row].length; col++) 
                        { 
                            System.out.println("(" + newFarm.getFarm()[row][col].getxLocation() + " , " + newFarm.getFarm()[row][col].getyLocation() + ")");   // Prints coordinates of the different lots in the Farm
                        }
                    }
                    System.out.println("");

                    System.out.println("Select a Lot:");        //Select a Lot to view and work on
                    System.out.print("X:");
                    int X = sc.nextInt();
                    System.out.print("Y:");
                    int Y = sc.nextInt();

                    System.out.println("");
                    System.out.println("Selected Lot (" + X + " , " + Y + ")");
                    System.out.println("");
                    System.out.println("--------------------------------------------");
                    System.out.println("");
                    System.out.println("Lot Details: ");
                    System.out.println("");

                    if(newFarm.getFarm()[X][Y].getPlowed()) // Checks if the Lot has been plowed
                    {
                        System.out.println("Plowed");
                        
                        if(newFarm.getFarm()[X][Y].getCrop() == null)  // Checks if the Lot has a Crop
                        {
                            System.out.println("No Crop");
                        }
                        else // Lot has a Crop
                        {
                            if (newFarm.getFarm()[X][Y].getCrop().getPlantedDays() <= newFarm.getFarm()[X][Y].getCrop().getHarvestTime())
                            {
                                System.out.println(newFarm.getFarm()[X][Y].getCrop().getName()); // Prints the Type of Crop Planted
                            }
                            else 
                            {
                                System.out.println("Withered " + newFarm.getFarm()[X][Y].getCrop().getName()); // Prints the Type of Crop Planted); // Prints the Type of Crop Planted
                            }
                        }
                    
                    }
                    else // Lot is Unplowed
                    {
                        System.out.println("Unplowed");
                    }
                    System.out.println("");


                    int PlantNum = 1; 
                    int PlowNum = 2; 
                    int None = 0;
                    int WaterNum = 3; 
                    int FertilizeNum = 4; 
                    int HarvestNum = 5; 
                    int RemoveCropNum = 6;
                    int Action = 99;            // Random Place Holder

                    while (Action != 0)
                    {   
                        System.out.println("--------------------------------------------");
                        System.out.println("");
                        System.out.println("Possible Actions: "); // Prints Possible Actions
                        System.out.println("");

                        if(newFarm.getFarm()[X][Y].getPlowed())  // Checks if the Lot has been plowed 
                        {
                            
                            if(newFarm.getFarm()[X][Y].getCrop() == null)
                            {
                                System.out.println("[" + PlantNum + "] " + "Plant Crop");
                                System.out.println("");
                            }
                            else // Lot has a Crop
                            {   
                                if (newFarm.getFarm()[X][Y].getCrop().getPlantedDays() <= newFarm.getFarm()[X][Y].getCrop().getHarvestTime()) // Checks if the Crop has exceeded its HarvestTime
                                {
                                    System.out.println("[" + WaterNum + "] " + "Water Crop");
                                    System.out.println("[" + FertilizeNum + "] " + "Fertilize Crop");
                                    System.out.println("");
            
                                    if(newFarm.getFarm()[X][Y].getCrop().CheckforHarvest()) // Checks if the Crop is ready to be harvested
                                    {
                                        System.out.println("[" + HarvestNum + "] " + "Harvest Crop"); 
                                        System.out.println("");
                                    }
                                }
                                else // Lot has exceeded it's HarvestTime and is now withered
                                {
                                    System.out.println("[" + RemoveCropNum + "] " + "Remove Withered Crop");
                                    System.out.println("");
                                }
                                
                            }

                        }
                        else // Lot is Unplowed
                        {
                            System.out.println("[" + PlowNum + "] " + "Plow Lot");
                            System.out.println("");
                        }
                        

                        System.out.println("[" + None + "] " + "Proceed to Next Day");       // Option to Proceed to the Next Day
                        System.out.println("");

                        System.out.println(FarmerName + "'s ObjectCoin: " + myFarmer.getObjectCoin()); // Prints Farmer's ObjectCoin
                        System.out.println("");
                        System.out.println("");

                        System.out.print("Select an action:"); // Asks User to Select an Option 
                        System.out.println("");
                        Action = sc.nextInt();


                        switch (Action)
                        {
                            case 1: 
                                int choice; 
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("Possible Seeds to Plant: ");
                                for(int i = 0; i < newFarm.getSeedList().size(); i++) // Prints all the possibe Seed Types
                                {
                                    System.out.println("[" + i + "] " + newFarm.getSeedList().get(i).getName());
                                }
                                System.out.println("");
                                System.out.println("Which seed would you like to Plant?"); // Asks User to Pick a Seed Type
                                choice = sc.nextInt();

                                System.out.println("");
                                myFarmer.plantCrop(choice, newFarm.getSeedList(), newFarm.getFarm()[X][Y]); // Plants Crop with the Seed Type
                                System.out.println(newFarm.getFarm()[X][Y].getCrop().getName() + "Succesfully Planted"); // Notifies User that planting the crop was successful
                                System.out.println("");

                                break; 

                            case 2:
                                if (myFarmer.useTool(0, newFarm.getToolList(), newFarm.getFarm()[X][Y])) // index 0 is plow, Lot is plowed
                                {
                                    System.out.println("");
                                    System.out.println("--------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Sucessfully Plowed Lot");   // Notifies User that plowing the Lot was successful
                                    System.out.println("");
                                }
                                break; 

                            case 3:
                                if (myFarmer.useTool(1, newFarm.getToolList(), newFarm.getFarm()[X][Y])) // index 1 is watering can, Crop is Watered
                                {
                                    System.out.println("");
                                    System.out.println("--------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Sucessfully Watered Plant");  // Notifies User that watering the crop was successful
                                    System.out.println("");
                                }
                                break; 

                            case 4:
                                if (myFarmer.useTool(2, newFarm.getToolList(), newFarm.getFarm()[X][Y])) // index 2 is fertilizer, Crop is Fertilized
                                {
                                    System.out.println("");
                                    System.out.println("--------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Sucessfully Fertilized Plant");   // Notifies User that fertilizing the crop was successful
                                    System.out.println("");
                                }
                                break; 

                            case 5:
                                if (myFarmer.harvestCrop(newFarm.getFarm()[X][Y]))
                                {
                                    System.out.println("");
                                    System.out.println("--------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Sucessfully Harvested Plant");    // Notifies User that harvesting the crop was successful
                                    System.out.println("");
                                    System.out.println(newFarm.getFarm()[X][Y].getCrop().getName() + "s Harvested: " + newFarm.getFarm()[X][Y].getCrop().getProducts());     // Notifies User of the number of Crop Harvested
                                    System.out.println("ObjectCoins Gained: " + newFarm.getFarm()[X][Y].getCrop().getFinalHarvestPrice());     // Notifies User of the amount of Object Coins Gainec
                                    System.out.println("");

                                    newFarm.getFarm()[X][Y].HarvestCrop(); // Removes crop from the lot
                                    break;
                                }
                        }
                    }

                    System.out.println("");
                    System.out.println("--------------------------------------------");
                    System.out.println("");
                    System.out.println("Proceeding to the next Day...");
                    newFarm.NewDay();       // Farm Proceeds to the next day
                    System.out.println("");
                }

            } 
            sc.close(); 
        }
        else if (start == 2)
        {
            System.out.println("Simulation Exited");
            System.out.println("");                                     // Closing the Simulation 
            System.out.println("Good Luck and Have a Great Day!");
        }
    }
}