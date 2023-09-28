/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentquestion2;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ksomp
 */
public class DealershipManagmentTest {
    
    public DealershipManagmentTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testsort(){
        //declarations 
        ArrayList<String> VehicleId =  new ArrayList<>();
        ArrayList<String> VehicleDetails =  new ArrayList<>();
        ArrayList<Double> VehiclePrice =  new ArrayList<>();
        ArrayList<String> CarOrTruck =  new ArrayList<>();
        
        ArrayList<String> VehicleIdSorted=  new ArrayList<>();
        ArrayList<String> VehicleDetailsSorted =  new ArrayList<>();
        ArrayList<Double> VehiclePriceSorted =  new ArrayList<>();
        ArrayList<String> CarOrTruckSorted =  new ArrayList<>();//sorted arrays to compair to 
        
        //adding elements 
        VehicleId.add("123qwe");
        VehicleId.add("frt");
        VehicleId.add("acgt");
        
        VehicleDetails.add("good");
        VehicleDetails.add("lalat");
        VehicleDetails.add("verts");
        
        VehiclePrice.add(33.55);
        VehiclePrice.add(99.3);
        VehiclePrice.add(12.4);
        
        CarOrTruck.add("car");
        CarOrTruck.add("truck");
        CarOrTruck.add("car");
        
        VehicleIdSorted.add("acgt");
        VehicleIdSorted.add("123qwe");
        VehicleIdSorted.add("frt");
        
        VehicleDetailsSorted.add("verts");
        VehicleDetailsSorted.add("good");
        VehicleDetailsSorted.add("lalat");
        
        VehiclePriceSorted.add(12.4);
        VehiclePriceSorted.add(33.55);
        VehiclePriceSorted.add(99.3);
        
        CarOrTruckSorted.add("car");
        CarOrTruckSorted.add("car");
        CarOrTruckSorted.add("truck");
        
        
        DealershipManagment dm = new DealershipManagment();
        dm.Sort(VehicleId, VehicleDetails, VehiclePrice, CarOrTruck);//calling soort method 
        
        assertEquals(VehicleIdSorted, dm.getVehicleId());
        assertEquals(VehicleDetailsSorted, dm.getVehicleDetails());
        assertEquals(VehiclePriceSorted, dm.getVehiclePrice());
        assertEquals(CarOrTruckSorted, dm.getCarOrTruck());//tests
    }
    
    @Test
    public void testsell(){
        //simulating user input 
        Scanner kb = new Scanner("frt\n");
        //declarations 
        ArrayList<String> VehicleId =  new ArrayList<>();
        ArrayList<String> VehicleDetails =  new ArrayList<>();
        ArrayList<Double> VehiclePrice =  new ArrayList<>();
        ArrayList<String> CarOrTruck =  new ArrayList<>();
        
        ArrayList<String> VehicleIdSold=  new ArrayList<>();
        ArrayList<String> VehicleDetailsSold =  new ArrayList<>();
        ArrayList<Double> VehiclePriceSold =  new ArrayList<>();
        ArrayList<String> CarOrTruckSold =  new ArrayList<>();
        
        //adding elements 
        VehicleId.add("123qwe");
        VehicleId.add("frt");
        VehicleId.add("acgt");
        
        VehicleDetails.add("good");
        VehicleDetails.add("lalat");
        VehicleDetails.add("verts");
        
        VehiclePrice.add(33.55);
        VehiclePrice.add(99.3);
        VehiclePrice.add(12.4);
        
        CarOrTruck.add("car");
        CarOrTruck.add("truck");
        CarOrTruck.add("car");
        
        VehicleIdSold.add("123qwe");
        VehicleIdSold.add("acgt");
      
        VehicleDetailsSold.add("good");
        VehicleDetailsSold.add("verts");
        
        VehiclePriceSold.add(33.55);
        VehiclePriceSold.add(12.4);
        
        CarOrTruckSold.add("car");
        CarOrTruckSold.add("car");
        
        DealershipManagment dm = new DealershipManagment();
        dm.SellAVehicle(kb, VehicleId, VehicleDetails, VehiclePrice, CarOrTruck);//calling sell method 
        
        assertEquals(VehicleIdSold, dm.getVehicleId());
        assertEquals(VehicleDetailsSold, dm.getVehicleDetails());
        assertEquals(VehiclePriceSold, dm.getVehiclePrice());
        assertEquals(CarOrTruckSold, dm.getCarOrTruck());//test 
        
    }
}
