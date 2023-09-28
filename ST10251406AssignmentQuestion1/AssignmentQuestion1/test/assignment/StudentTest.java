/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ksomp
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @Test
    public void TestSaveStudent(){
        
        Student st = new Student();
        Scanner kb;
       
        //array lists to check that the save saves corectlly
        ArrayList<String> ID = new ArrayList<>();
        ID.add("s12345");
        ID.add("st36912");
        ID.add("d44563");
        
        ArrayList<String> Name = new ArrayList<>();
        Name.add("mark");
        Name.add("Denver");
        Name.add("albert");
        
        ArrayList<Integer> Age = new ArrayList<>();
        Age.add(44);
        Age.add(33);
        Age.add(55);
        
        ArrayList<String> Email = new ArrayList<>();
        Email.add("qwertyu");
        Email.add("zulu");
        Email.add("tilly");
        
        ArrayList<String> Course = new ArrayList<>();
        Course.add("yhn");
        Course.add("bcad");
        Course.add("dingdong");
        
        
        kb = new Scanner("s12345\nmark\n44\nqwertyu\nyhn\na");//simulating input
        //calling save student method
        st.SaveStudent(kb,st.getStudentID(),st.getStudentName(),st.getStudentAge(),st.getStudentEmail(),st.getStudentCourse());
        
        kb = new Scanner("st36912\nDenver\n12\n14\n3\nacd\n33\nzulu\nbcad\na");
        st.SaveStudent(kb,st.getStudentID(),st.getStudentName(),st.getStudentAge(),st.getStudentEmail(),st.getStudentCourse());
        
        kb = new Scanner("d44563\nalbert\n55\ntilly\ndingdong\na");
        st.SaveStudent(kb,st.getStudentID(),st.getStudentName(),st.getStudentAge(),st.getStudentEmail(),st.getStudentCourse());
        
        //peforming checks
        assertEquals(3, st.getStudentID().size());
        assertEquals(3, st.getStudentName().size());
        assertEquals(3, st.getStudentAge().size());
        assertEquals(3, st.getStudentEmail().size());
        assertEquals(3, st.getStudentCourse().size());
        
        assertEquals(ID,st.getStudentID() );
        assertEquals(Name,st.getStudentName());
        assertEquals(Age,st.getStudentAge());
        assertEquals(Email,st.getStudentEmail());
        assertEquals(Course,st.getStudentCourse());  
    }
    
    @Test
    public void TestSearchStudent() {
        //declarations
        String expect;
        String actual;
        
        Student st = new Student();

        // arraylists to provide examples to search through 
        ArrayList<String> ID = new ArrayList<>();
        ID.add("s12345");
        ID.add("st36912");
        ID.add("d44563");

        ArrayList<String> Name = new ArrayList<>();
        Name.add("mark");
        Name.add("Denver");
        Name.add("albert");

        ArrayList<Integer> Age = new ArrayList<>();
        Age.add(44);
        Age.add(33);
        Age.add(55);

        ArrayList<String> Email = new ArrayList<>();
        Email.add("qwertyu");
        Email.add("zulu");
        Email.add("tilly");

        ArrayList<String> Course = new ArrayList<>();
        Course.add("yhn");
        Course.add("bcad");
        Course.add("dingdong");

        //calling search method
        st.student(ID, Name, Age, Email, Course);

        Scanner kb = new Scanner("s12345\na");//simulating input
        
        expect=                       ("-------------------------------------------------------"
                                      +"\nSTUDENT ID: "+"s12345"
                                      +"\nSTUDENT NAME: "+"mark"
                                      +"\nSTUDENT AGE: "+44
                                      +"\nSTUDENT EMAIL: "+"qwertyu"
                                      +"\nSTUDENT COURSE: "+"yhn"
                                      +"\n-------------------------------------------------------");//expected return from method
        
        actual=st.SearchStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        assertEquals(expect, actual);//peforming checks

        kb = new Scanner("st36912\na");
        
        expect=                       ("-------------------------------------------------------"
                                      +"\nSTUDENT ID: "+"st36912"
                                      +"\nSTUDENT NAME: "+"Denver"
                                      +"\nSTUDENT AGE: "+33
                                      +"\nSTUDENT EMAIL: "+"zulu"
                                      +"\nSTUDENT COURSE: "+"bcad"
                                      +"\n-------------------------------------------------------");
        
        actual=st.SearchStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        assertEquals(expect, actual);//peforming checks

    }  
    
    @Test
    public void TestSearchStudent_StudentNotFound(){
        //declarations
        String expect;
        String actual; 
        
       Student st = new Student();

       // arraylists to provide examples to search through
        ArrayList<String> ID = new ArrayList<>();
        ID.add("s12345");
        ID.add("st36912");
        ID.add("d44563");

        ArrayList<String> Name = new ArrayList<>();
        Name.add("mark");
        Name.add("Denver");
        Name.add("albert");

        ArrayList<Integer> Age = new ArrayList<>();
        Age.add(44);
        Age.add(33);
        Age.add(55);

        ArrayList<String> Email = new ArrayList<>();
        Email.add("qwertyu");
        Email.add("zulu");
        Email.add("tilly");

        ArrayList<String> Course = new ArrayList<>();
        Course.add("yhn");
        Course.add("bcad");
        Course.add("dingdong");

        st.student(ID, Name, Age, Email, Course);
        
        Scanner kb = new Scanner("0000000\na");//simulating input
        
        expect=                       ("--------------------------------------------------------"
                                  +"\nStudent with Student id: "+"0000000"+" was not be found!"
                                  +"\n--------------------------------------------------------");//expected return from method
        
        actual=st.SearchStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        assertEquals(expect, actual);//peforming checks
    }

    @Test
    public void TestDeleteStudent(){
      Student st = new Student();

        //arraylist examples to delete from
        ArrayList<String> ID = new ArrayList<>();
        ID.add("s12345");
        ID.add("6666");
        ID.add("d44563");

        ArrayList<String> Name = new ArrayList<>();
        Name.add("mark");
        Name.add("Denver");
        Name.add("albert");

        ArrayList<Integer> Age = new ArrayList<>();
        Age.add(44);
        Age.add(33);
        Age.add(55);

        ArrayList<String> Email = new ArrayList<>();
        Email.add("qwertyu");
        Email.add("zulu");
        Email.add("tilly");

        ArrayList<String> Course = new ArrayList<>();
        Course.add("yhn");
        Course.add("bcad");
        Course.add("dingdong");
        
        //array lists to compair to 
        ArrayList<String> ID2 = new ArrayList<>();
        ID2.add("s12345");
        ID2.add("6666");
        ID2.add("d44563");

        ArrayList<String> Name2 = new ArrayList<>();
        Name2.add("mark");
        Name2.add("Denver");
        Name2.add("albert");

        ArrayList<Integer> Age2 = new ArrayList<>();
        Age2.add(44);
        Age2.add(33);
        Age2.add(55);

        ArrayList<String> Email2 = new ArrayList<>();
        Email2.add("qwertyu");
        Email2.add("zulu");
        Email2.add("tilly");

        ArrayList<String> Course2 = new ArrayList<>();
        Course2.add("yhn");
        Course2.add("bcad");
        Course2.add("dingdong");
        
        
        st.student(ID, Name, Age, Email, Course);//saving to class
        Scanner kb = new Scanner("s12345\ny");//simulating input
        //calling delete
        st.DeleteStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        
        ID2.remove(0);
        Name2.remove(0);
        Age2.remove(0);
        Email2.remove(0);
        Course2.remove(0);//removing apropriat element from check arraylists
        
        assertEquals(ID2, st.getStudentID());
        assertEquals(Name2, st.getStudentName());
        assertEquals(Age2, st.getStudentAge());
        assertEquals(Email2, st.getStudentEmail());
        assertEquals(Course2, st.getStudentCourse());//peforming checks
        
        kb = new Scanner("d44563\ny");
        st.DeleteStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        
        ID2.remove(1);
        Name2.remove(1);
        Age2.remove(1);
        Email2.remove(1);
        Course2.remove(1);
        
        assertEquals(ID, st.getStudentID());
        assertEquals(Name, st.getStudentName());
        assertEquals(Age, st.getStudentAge());
        assertEquals(Email, st.getStudentEmail());
        assertEquals(Course, st.getStudentCourse());
   }
    
    @Test
    public void TestDeleteStudent_StudentNotFound(){
        //declarations
        String expect;
        String actual; 
        
        Student st = new Student();
        
        Scanner kb = new Scanner("s12345");//simulating user input
        
        actual= st.DeleteStudent(kb, st.getStudentID(), st.getStudentName(), st.getStudentAge(), st.getStudentEmail(), st.getStudentCourse());
        
        expect = ("--------------------------------------------------------"
                              +"\nStudent with Student id: "+"s12345"+" was not be found!"
                              +"\n--------------------------------------------------------");//expected result
        assertEquals(expect, actual);//check
    }
    
    @Test
    public void TestStudentAge_StudentAgeValid(){
        //declarations
        String expect;
        String actual;
        
        Student st = new Student();
        
        Scanner kb = new Scanner("21");//simulating user input 
        expect="21";
        actual=st.StudentAgeCheck(kb);
        assertEquals(expect, actual);//check
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalid(){
        //declarations
        String expect;
        String actual;
        
        Student st = new Student();
        
        Scanner kb = new Scanner("12"); //simulating input
        expect="Incorect";
        actual=st.StudentAgeCheck(kb);
        assertEquals(expect, actual);//peforming checks
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter(){
     //declarations
     String expect;
        String actual; 
        
        Student st = new Student();
        
        Scanner kb = new Scanner("abc");//simulating input
        expect="Incorect";
        actual=st.StudentAgeCheck(kb);
        assertEquals(expect, actual); //peforming checks 
    }
}

    

    
        
    
    

    
    

