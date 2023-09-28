/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentquestion2;

/**
 *
 * @author ksomp
 */
public class Vehicle { //parent class 
    enum Fule {PETROL, DIESEL, ELECTRIC}
    
    //declarations 
    private String Make;
    private String Model;
    private Double Pricce;
    private String Colour;
    private Fule FuleType;
    private String VehicleId;
    
    //constructor 
    public Vehicle(String VehicleId, String Make, String Model, Double Pricce, String Colour, Vehicle.Fule FuleType) {
        this.Make = Make;
        this.Model = Model;
        this.Pricce = Pricce;
        this.Colour = Colour;
        this.FuleType = FuleType;
        this.VehicleId = VehicleId;
    }

    //get methods 
    public String getVehicleId() {
        return VehicleId;
    }

    public Fule getFuleType() {
        return FuleType;
    }
    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public Double getPricce() {
        return Pricce;
    }

    public String getColour() {
        return Colour;
    }
    
   //display method to return details of the vehicle
    public String Display(){
     //declaration
     String Output="";
     
     System.out.println
     ("****************************************************************************"
     +"\nthe vehicle ID is: "+getVehicleId()
     +"\nthe make of the vehicle is: "+getMake()
     +"\nthe model is: "+getModel()
     +"\nthe price is: R"+String.valueOf(getPricce())
     +"\nthe colour is: "+getColour()
     +"\nthe fule type is: "+String.valueOf(getFuleType())
     +"\n****************************************************************************");//sample output 
     
     Output=
     ("*****************************************************"
     +"\nthe vehicle ID is: "+getVehicleId()
     +"\nthe make of the vehicle is: "+getMake()
     +"\nthe model is: "+getModel()
     +"\nthe price is: R"+String.valueOf(getPricce())
     +"\nthe colour is: "+getColour()
     +"\nthe fule type is: "+String.valueOf(getFuleType())
     +"\n*****************************************************");//output of the method 
     return Output;
 }
   
    

    

    
}
