/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentquestion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ksomp
 */
public class DealershipManagment {
    //declarations
    //arraylists to hold the the vehiclas information
    private ArrayList<String> VehicleDetails=new ArrayList<>();
    private ArrayList<Double> VehiclePrice=new ArrayList<>();
    private ArrayList<String> CarOrTruck=new ArrayList<>();
    private ArrayList<String> VehicleId=new ArrayList<>();

    //getters and setters 
    public void setVehicleId(ArrayList<String> VehicleId) {
        this.VehicleId = VehicleId;
    }

    public ArrayList<String> getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(String VehicleId) {
        this.VehicleId.add(VehicleId);
    }

    public void setVehicleDetails(ArrayList<String> VehicleDetails) {
        this.VehicleDetails = VehicleDetails;
    }

    public void setVehiclePrice(ArrayList<Double> VehiclePrice) {
        this.VehiclePrice = VehiclePrice;
    }

    public void setCarOrTruck(ArrayList<String> CarOrTruck) {
        this.CarOrTruck = CarOrTruck;
    }

    public ArrayList<String> getCarOrTruck() {
        return CarOrTruck;
    }

    public void setCarOrTruck(String CarOrTruck) {
        this.CarOrTruck.add(CarOrTruck);
    }
    
    public ArrayList<Double> getVehiclePrice() {
        return VehiclePrice;
    }

    public void setVehiclePrice(Double VehiclePrice) {
        this.VehiclePrice.add(VehiclePrice);
    }
    public void setVehicleDetails(String VehicleDetails) {
        this.VehicleDetails.add(VehicleDetails);
    }

    public ArrayList<String> getVehicleDetails() {
        return VehicleDetails;
    }
    
    //displaying the main menu 
    public void MainMenue (){
        Scanner kb = new Scanner(System.in );
        
        //printing out menue
        System.out.println("""
                           Main MENUE
                           *************************************
                           (1) Display all trucks
                           (2) Display all Cars 
                           (3) Search for a vhecal price range 
                           (4) Sell a vhecal 
                           (5) Buy a vhecal
                           (6) display full report
                           Enter any leter to exit
                           *************************************""");
        // geting user input and calling apropriat method 
        switch (kb.next()) {
            case "1": SearchAllTrucks(getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      MainMenue();break;
            case "2": SearchAllCars(getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      MainMenue();break;
            case "3": SearchInPriceRange(kb, getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      MainMenue();break;
            case "4": SellAVehicle(kb, getVehicleId(), getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      Sort(getVehicleId(), getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      MainMenue();break;
            case "5": BuyAVehicle(kb);
                      Sort(getVehicleId(), getVehicleDetails(), getVehiclePrice(), getCarOrTruck());
                      MainMenue();break;
            case "6": DisplayReport(getVehicleDetails(), getCarOrTruck());
                      MainMenue();break;
            default:System.exit(0);break;
        }
    }
    public void AddingInventoryTruck(Scanner kb){
        //declarations
    String Make;
    String VehicleId;
    String Model;
    Double Price;
    String Colour;
    Double LoadCapacity;
    String CabType="";
    Vehicle.Fule FuleType = null;
    Boolean ChoseFule=false;
    Boolean ChoseCab=false;
        
    //printing and reciving input
        System.out.println("ADDING A VAN\n********************************");
        System.out.println("Enter the VehicleId");
        VehicleId=kb.next();
        System.out.println("Enter the make of the vehicle");
        Make=kb.next();
        System.out.println("Enter the model of the vehicle");
        Model=kb.next();
        System.out.println("Enter the price of the vehicle (0,00)");
        Price=kb.nextDouble();
        System.out.println("Enter the colour of the vehicle");
        Colour=kb.next();
        System.out.println("Enter the load capacity in tons (0,00)");
        LoadCapacity=kb.nextDouble();
        do {//loop to ensure a value is entered
        System.out.println("""
                           Select a caburn type 
                           (1) Single cab
                           (2) Doubl cab
                           (3) Crew cab""");
        switch (kb.next()) {
            case "1" -> {
                CabType="single cab";ChoseCab=true;
            }
            case "2" -> {
                CabType="doubl cab";ChoseCab=true;
            }
            case "3" -> {
                CabType="crew cab";ChoseCab=true;
            }
            default -> {
                System.out.println("That is not a valid choice");ChoseCab=false;
            }
           }
        } while (ChoseCab==false);
        
        do {            
        System.out.println("""
                           Select a fule type 
                           (1) PETROL
                           (2) DIESEL
                           (3) ELECTRIC""");
        switch (kb.next()) {
            case "1" -> {
                FuleType=Vehicle.Fule.PETROL;ChoseFule=true;
            }
            case "2" -> {
                FuleType=Vehicle.Fule.DIESEL;ChoseFule=true;
            }
            case "3" -> {
                FuleType=Vehicle.Fule.ELECTRIC;ChoseFule=true;
            }
            default -> {
                System.out.println("That is not a valid choice");ChoseFule=false;
            }
           }
        } while (ChoseFule==false);
       
       Truck tr = new Truck(VehicleId,LoadCapacity, CabType, Make, Model, Price, Colour, FuleType);//calling child class to acces methods
       setVehicleDetails(tr.Display());
        setCarOrTruck("VAN");
        setVehiclePrice(tr.getPricce());
        setVehicleId(tr.getVehicleId());//setting values to arrays
            }
    
    
    public void AddingInventoryCar(Scanner kb){
        //declarations
    String Make;
    String Model;
    Double Price;
    String VehicleId;
    String Colour;
    Double HorsePower;
    String IsConvertable="";
    Vehicle.Fule FuleType = null;
    Boolean ChoseFule=false;
    Boolean ChoseConvertable=false;
    
    // geting user input and calling apropriat method 
        System.out.println("ADDING A CAR\n********************************");
        System.out.println("Enter the VehicleId");
        VehicleId=kb.next();
        System.out.println("Enter the make of the vehicle");
        Make=kb.next();
        System.out.println("Enter the model of the vehicle");
        Model=kb.next();
        System.out.println("Enter the price of the vehicle (0,00)");
        Price=kb.nextDouble();
        System.out.println("Enter the colour of the vehicle");
        Colour=kb.next();
        System.out.println("Enter how much hoursepower the vehicle has (0,00)");
        HorsePower=kb.nextDouble();
        
        do {//loop to ensure a value is entered
        System.out.println("""
                           Is the car a convertable
                           (1) Yes
                           (2) No""");
        switch (kb.next()) {
            case "1" -> {
                IsConvertable="";ChoseConvertable=true;
            }
            case "2" -> {
                IsConvertable="not ";ChoseConvertable=true;
            }
            default -> {
                System.out.println("That is not a valid choice");ChoseConvertable=false;
            }
           }
        } while (ChoseConvertable==false);

        
        do {            
        System.out.println("""
                           Select a fule type 
                           (1) PETROL
                           (2) DIESEL
                           (3) ELECTRIC""");
        switch (kb.next()) {
            case "1" -> {
                FuleType=Vehicle.Fule.PETROL;ChoseFule=true;
            }
            case "2" -> {
                FuleType=Vehicle.Fule.DIESEL;ChoseFule=true;
            }
            case "3" -> {
                FuleType=Vehicle.Fule.ELECTRIC;ChoseFule=true;
            }
            default -> {
                System.out.println("that is not a valid choice ");ChoseFule=false;
            }
           }
        } while (ChoseFule==false);
       
       Car ca = new Car(VehicleId,HorsePower, IsConvertable, Make, Model, Price, Colour, FuleType);//calling child class to acces methods
       setVehicleDetails(ca.Display());
        setCarOrTruck("CAR");
        setVehiclePrice(ca.getPricce());
        setVehicleId(ca.getVehicleId());//setting values to arrays
        
    }
    
    public void DisplayReport(ArrayList<String> VehicleDetails, ArrayList<String> CarOrTruck){
        //declarations
        int LoopMax = VehicleDetails.size();
        
        //printing out every element in the array
        for (int i = 0; i < LoopMax; i++) {
            System.out.println(CarOrTruck.get(i)+VehicleDetails.get(i));    
        }
        
    }
    
    //sorting the arrays using the price 
    public void Sort(ArrayList<String> VehicleId, ArrayList<String> VehicleDetails, ArrayList<Double> VehiclePrice, ArrayList<String> CarOrTruck){
        //declarations
        String tempVehicleDetails;
        Double tempVehiclePrice;
        String tempVehicleId;
        String tempCarOrTruck;
        int Steps = VehiclePrice.size()-1;//loop limit
        int a=0;
        
            while (a<Steps) {//bubble sort
                //declaration
            int b = 0 ;
                 while (b<(Steps)){
                       if(VehiclePrice.get(b) > VehiclePrice.get(b + 1))
                            {
                              tempVehiclePrice = VehiclePrice.get(b);
                              VehiclePrice.set(b, VehiclePrice.get(b+1));
                              VehiclePrice.set((b+1), tempVehiclePrice);
                              
                              tempVehicleDetails = VehicleDetails.get(b);
                              VehicleDetails.set(b, VehicleDetails.get(b+1));
                              VehicleDetails.set((b+1), tempVehicleDetails);
                              
                              tempCarOrTruck = CarOrTruck.get(b);
                              CarOrTruck.set(b, CarOrTruck.get(b+1));
                              CarOrTruck.set((b+1), tempCarOrTruck);
                              
                              tempVehicleId = VehicleId.get(b);
                              VehicleId.set(b, VehicleId.get(b+1));
                              VehicleId.set((b+1), tempVehicleId);
                            }
               b++;
                 }
            a++;
            }
        setCarOrTruck(CarOrTruck);
        setVehicleDetails(VehicleDetails);
        setVehiclePrice(VehiclePrice);    
        setVehicleId(VehicleId);//setting sorted arrays
    }      
    
    
    public void SearchAllCars (ArrayList<String> VehicleDetails, ArrayList<Double> VehiclePrice, ArrayList<String> CarOrTruck){
        //declaration
        boolean Check=false;
        int LoopMax = CarOrTruck.size();//loop limit
        
        //displaying records of cars
        for (int i = 0; i < LoopMax; i++) {
            if (CarOrTruck.get(i).equals("CAR")) {
                            System.out.println(VehicleDetails.get(i));
                            Check = true;
            }
        }
        if (Check==false) {System.out.println("No cars were found");        }
    }
    
    public void SearchAllTrucks (ArrayList<String> VehicleDetails, ArrayList<Double> VehiclePrice, ArrayList<String> CarOrTruck){
        //declarations
        boolean Check=false;
        int LoopMax = CarOrTruck.size();//looplimit
        
        //displaying all records of vans
        for (int i = 0; i < LoopMax; i++) {
            if (CarOrTruck.get(i).equals("VAN")) {
                            System.out.println(VehicleDetails.get(i));
                            Check = true;
            }
        }
        if (Check==false) {System.out.println("No vans were found");        }
    }
    
    // searching based on price 
    public void SearchInPriceRange (Scanner kb, ArrayList<String> VehicleDetails, ArrayList<Double> VehiclePrice, ArrayList<String> CarOrTruck)
    {
        //declarations
        boolean Check=false;
        int Count=0;
        int LoopMax = VehiclePrice.size();
        Double Price;
        
        System.out.println("Enter the price range you want to search in (0,00)"); 
        Price=kb.nextDouble();
        
        //looping through and displaying vhicals belos a impute price
        while (Count<LoopMax) {            
            if (VehiclePrice.get(Count)<=Price) {
                System.out.println(VehicleDetails.get(Count)); 
                Check = true;
            }
            Count++; 
        }
        
        if (Check==false) {System.out.println("No vehicles were found");        
        }
    }
    
    //removing a vhical from the database
    public void SellAVehicle(Scanner kb,ArrayList<String> VehicleId, ArrayList<String> VehicleDetails, ArrayList<Double> VehiclePrice, ArrayList<String> CarOrTruck){
       //declaration
       String IdToSell;
       boolean Check=false;
       
        System.out.println("Enter the vehicle id you want to sell");
        IdToSell=kb.next();
        
        //looping through the array elements 
        for (int i = 0; i < VehicleId.size(); i++) {
            if (IdToSell.equals(VehicleId.get(i))) {//checking if there is a match 
                VehicleId.remove(i);
                VehicleDetails.remove(i);
                VehiclePrice.remove(i);
                CarOrTruck.remove(i);//removint the elenent
                Check = true;
            }
        }
        setCarOrTruck(CarOrTruck);
        setVehicleId(VehicleId);
        setVehicleDetails(VehicleDetails);
        setVehiclePrice(VehiclePrice);//setting to global  arrays 
        
                if (Check==false) {System.out.println("No vehicle was found");        
                }else{System.out.println("Vehicle sold");}

    }

    //adding a vehicle to the invantory 
    public void BuyAVehicle(Scanner kb){
        //declarations
        int NumberOfVehicles=0;
        Boolean CorectChoice;
        
        System.out.println("How many vehicles do you want to enter: ");
        NumberOfVehicles =kb.nextInt();
        
        for (int i = 0; i < NumberOfVehicles; i++) {
            CorectChoice=false;
            do {                
                 System.out.println("(1) Enter a car \n(2) Enter a van ");
            switch (kb.next()) { // calling the correct add method 
            case "1" -> { AddingInventoryCar(kb);
                          CorectChoice=true;}    
            case "2" -> {AddingInventoryTruck(kb);
                         CorectChoice=true;}
            default -> {System.out.println("Invalid choice");
                        CorectChoice=false;}
            }  
            } while (CorectChoice==false);
                    
        }
    }
}
    

