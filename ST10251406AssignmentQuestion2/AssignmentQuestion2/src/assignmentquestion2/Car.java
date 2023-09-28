/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentquestion2;

/**
 *
 * @author ksomp
 */
public class Car extends Vehicle{//child class 
    
    //declarations 
    private Double HorsePower;
    private String IsConvertable;
    
    //constructor 
    public Car(String VehicleId, Double HorsePower, String IsConvertable, String Make, String Model, Double Pricce, String Colour, Fule FuleType) {
        super(VehicleId, Make, Model, Pricce, Colour, FuleType);
        this.HorsePower = HorsePower;
        this.IsConvertable = IsConvertable;
    }
    
    //get methods 
    public Double getHorsePower() {
        return HorsePower;
    }

    public String getIsConvertable() {
        return IsConvertable;
    }
    

    // display method to return details of a car 
    @Override
    public String Display(){
     //declaration
     String Output="";
     
     System.out.println
     ("****************************************************************************"
     +"\nThe vehicle Id is: "+getVehicleId()
     +"\nThe make of the car is: "+getMake()
     +"\nThe model is: "+getModel()
     +"\nThe price is: R"+String.valueOf(getPricce())
     +"\nThe colour is: "+getColour()
     +"\nThe fule type is: "+String.valueOf(getFuleType())
     +"\nThe car has "+String.valueOf(getHorsePower())+" horsepower"
     +"\nThe car is "+getIsConvertable()+"a convertable"
     +"\n****************************************************************************");//sample output 
     
     Output=
     ("******************************************************"
     +"\nThe vehicle Id is: "+getVehicleId()
     +"\nThe make of the car is: "+getMake()
     +"\nThe model is: "+getModel()
     +"\nThe price is: R"+String.valueOf(getPricce())
     +"\nThe colour is: "+getColour()
     +"\nThe fule type is: "+String.valueOf(getFuleType())
     +"\nThe car has "+String.valueOf(getHorsePower())+" horsepower"
     +"\nThe car is "+getIsConvertable()+"a convertable"
     +"\n******************************************************");
     return Output;
 }

    
   

}
