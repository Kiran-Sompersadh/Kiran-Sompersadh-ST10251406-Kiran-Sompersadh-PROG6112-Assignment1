/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentquestion2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ksomp
 */
public class TruckTest {
   
    
    public TruckTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testdisplay(){
        //declarations 
        String Id="123truck";
        Double Load = 22.1;
        String Cab ="doubl cab";
        String Make = "asd";
        String Model = "ert";
        Double Cost = 12345.33;
        String Colour = "black";//sample inputs 
        String Expect;
        String Actual;
        
        Truck tr = new Truck(Id, Load, Cab, Make, Model, Cost, Colour,Vehicle.Fule.PETROL);
        Actual=tr.Display();//calling display 
        
        Expect=
     ("*****************************************************"
     +"\nThe vehicle Id is: "+"123truck"
     +"\nThe make of the van is: "+"asd"
     +"\nThe model is: "+"ert"
     +"\nThe price is: R"+"12345.33"
     +"\nThe colour is: "+"black"
     +"\nThe fule type is: "+"PETROL"
     +"\nThe load capacity of the van is: "+"22.1"+" tons"
     +"\nthe van is a: "+"doubl cab"
     +"\n******************************************************");
        
        assertEquals(Expect, Actual);//test 
    }
    
}
