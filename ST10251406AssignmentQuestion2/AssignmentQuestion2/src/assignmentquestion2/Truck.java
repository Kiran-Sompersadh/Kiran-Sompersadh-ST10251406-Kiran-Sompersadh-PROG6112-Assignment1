/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentquestion2;

/**
 *
 * @author ksomp
 */
public class Truck extends Vehicle{//child class
    
    //declarations 
    private Double LoadCapacity;
    private String CabType;

    //constructor 
    public Truck(String VehicleId,Double LoadCapacity, String CabType, String Make, String Model, Double Pricce, String Colour, Fule FuleType) {
        super(VehicleId, Make, Model, Pricce, Colour, FuleType);
        this.LoadCapacity = LoadCapacity;
        this.CabType = CabType;
    }
    
    //get methods 
    public Double getLoadCapacity() {
        return LoadCapacity;
    }

    public String getCabType() {
        return CabType;
    }
    
    //display method to return details od a van 
    @Override
    public String Display(){
        //declaration
     String Output="";
     
     System.out.println
     ("****************************************************************************"
     +"\nThe vehicle Id is: "+getVehicleId()
     +"\nThe make of the van is: "+getMake()
     +"\nThe model is: "+getModel()
     +"\nThe price is: R"+String.valueOf(getPricce())
     +"\nThe colour is: "+getColour()
     +"\nThe fule type is: "+String.valueOf(getFuleType())
     +"\nThe load capacity of the van is: "+String.valueOf(getLoadCapacity())+" tons"
     +"\nThe van is a: "+getCabType()
     +"\n****************************************************************************");//sample 
     
     Output=
     ("*****************************************************"
     +"\nThe vehicle Id is: "+getVehicleId()
     +"\nThe make of the van is: "+getMake()
     +"\nThe model is: "+getModel()
     +"\nThe price is: R"+String.valueOf(getPricce())
     +"\nThe colour is: "+getColour()
     +"\nThe fule type is: "+String.valueOf(getFuleType())
     +"\nThe load capacity of the van is: "+String.valueOf(getLoadCapacity())+" tons"
     +"\nthe van is a: "+getCabType()
     +"\n******************************************************");
     return Output;
 }
      
                
    
   
}
    

