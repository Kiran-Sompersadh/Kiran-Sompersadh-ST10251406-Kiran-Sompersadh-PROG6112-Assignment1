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
public class CarTest {
    
    public CarTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testdisplay(){
        //declarations 
        String Id="123car";
        Double Power = 2222.1;
        String Convertable ="not ";
        String Make = "res";
        String Model = "eed";
        Double Cost = 12345.33;
        String Colour = "black";//sample inputs 
        String Expect;
        String Actual;
        
        Car ca = new Car(Id, Power, Convertable, Make, Model, Cost, Colour, Vehicle.Fule.PETROL);
        Actual = ca.Display();//salling display 
        
        Expect = 
     ("******************************************************"
     +"\nThe vehicle Id is: "+"123car"
     +"\nThe make of the car is: "+"res"
     +"\nThe model is: "+"eed"
     +"\nThe price is: R"+"12345.33"
     +"\nThe colour is: "+"black"
     +"\nThe fule type is: "+"PETROL"
     +"\nThe car has "+"2222.1"+" horsepower"
     +"\nThe car is "+"not "+"a convertable"
     +"\n******************************************************");
        
        assertEquals(Expect, Actual);//test 
    }
}
