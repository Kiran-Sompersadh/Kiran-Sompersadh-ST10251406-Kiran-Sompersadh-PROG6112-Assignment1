/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ksomp
 */
public class Student {
    
    //declared privat array list to hold student information 
    private ArrayList<String> StudentID;
    private ArrayList<String> StudentName;
    private ArrayList<Integer> StudentAge;
    private ArrayList<String> StudentEmail;
    private ArrayList<String> StudentCourse;
    
    //constructor to initialize the array lists 
    public Student() {
        this.StudentID = new ArrayList<String>();
        this.StudentName = new ArrayList<String>();
        this.StudentAge = new ArrayList<Integer>();
        this.StudentEmail = new ArrayList<String>();
        this.StudentCourse =new ArrayList<String>();
    }
    
    //student method sets the values to the protected array lists 
    public void student(ArrayList<String> StudentID, ArrayList<String> StudentName, ArrayList<Integer> StudentAge, ArrayList<String> StudentEmail, ArrayList<String> StudentCourse) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.StudentEmail = StudentEmail;
        this.StudentCourse = StudentCourse;
    }

    //get methods to retrive the values in protected array lists 
    public ArrayList<String> getStudentID() {
        return StudentID;
    }

    public ArrayList<String> getStudentName() {
        return StudentName;
    }

    public ArrayList<Integer> getStudentAge() {
        return StudentAge;
    }

    public ArrayList<String> getStudentEmail() {
        return StudentEmail;
    }

    public ArrayList<String> getStudentCourse() {
        return StudentCourse;
    }
    
    //welcome messege and initial exit 
    public void DisplayWelcome()
    {   
        Scanner kb = new Scanner(System.in);
        
        System.out.println("""
                           STUDENT MANAGEMENT APPLICATION
                           *****************************************************
                           Enter (1) to launch menu or any other key to exit""");
        if (kb.next().equals("1"))
        {
            Menue(kb);    
        }else
        {
            System.exit(0);
        }
    }
    
    // menue displays the options a user has to elect from 
    public void Menue(Scanner kb)
    {
        
        System.out.println("""
                           Please select one of the following menu items:
                           (1) Capture a new student.
                           (2) Search for a student.
                           (3) Delete a student.
                           (4) Print student report.
                           (5) Exit Application.""");
        //switch statment to call the various methods depending on user choice 
        switch (kb.next()) {
            case "1" -> {
                System.out.println(SaveStudent(kb,getStudentID(),getStudentName(),getStudentAge(),getStudentEmail(),getStudentCourse()));
                exitchoice(kb);
            }
            case "2" -> {
                System.out.println(SearchStudent(kb, getStudentID(),getStudentName(),getStudentAge(),getStudentEmail(),getStudentCourse()));
                exitchoice(kb);
            }
            case "3" -> {
                System.out.println(DeleteStudent(kb, getStudentID(),getStudentName(),getStudentAge(),getStudentEmail(),getStudentCourse()));
                exitchoice(kb);
            }
            case "4" -> {
                StudentReport(kb, getStudentID(),getStudentName(),getStudentAge(),getStudentEmail(),getStudentCourse());
                exitchoice(kb);
            }
            case "5" -> ExitStudentApplication();
            default -> defaultchoice(kb);
        }
    }
    
    // this method adds a student to the list 
    public String SaveStudent (Scanner kb, ArrayList<String> ID ,ArrayList<String> Name, ArrayList<Integer> Age, ArrayList<String> Email, ArrayList<String> Course)
    {
        //declaration
        String Output;
        String EnteredAge;  
        
        System.out.println("""
                           CAPTURE A NEW STUDENT
                           **************************
                           Enter the student id: """);
        ID.add(kb.next());
        
        System.out.println("Enter the student name: ");
        Name.add(kb.next());
        
        System.out.println("Enter the student age: ");
        do {            
            EnteredAge=StudentAgeCheck(kb);//calling the student age checking method to validate age 
        } while (EnteredAge.equals("Incorect"));
        Age.add(Integer.valueOf(EnteredAge));
        
        System.out.println("Enter the student email: ");
        Email.add(kb.next());
        
        System.out.println("Enter the student course: ");
        Course.add(kb.next());
        
        student(ID, Name, Age, Email, Course);//setting the value to the global array list 
        Output="The student details have been successfully saved.";//confermation
        return Output;
    }
    
    //age checking method 
    public String StudentAgeCheck(Scanner kb){
        //declarations 
        String AgeToCheck;
        String Output;   
        
        AgeToCheck=kb.next();//input age 
        
        if (AgeToCheck.matches("[0-9]+")&&Integer.parseInt(AgeToCheck)>=16) //check entered age meets the requirments 
        {
           Output=AgeToCheck;//returning the age if requirments are met 
        }else{
            System.out.println("""
                    You have entered a incorrect student age!!! 
                    Please re-enter the student age >> """);
            Output="Incorect";//returning the incorect if requirments are not met
             }
        return Output;
    }
    
    //searching for a student using their student id 
    public String SearchStudent (Scanner kb, ArrayList<String> ID ,ArrayList<String> Name, ArrayList<Integer> Age, ArrayList<String> Email, ArrayList<String> Course)
    {
        //declaration
        String IDToSearchFor;
        boolean StudentIdNotFound=true;
        String Output=""; 
        
        System.out.println("Enter the student id to search: ");
        IDToSearchFor=kb.next();
        
        //looping throgh the array list to check each value induvidually 
        for (int i = 0; i < ID.size(); i++) 
        {
            if (ID.get(i).equals(IDToSearchFor))//checking if an element matches the entered id to search for  
            {
                Output=           ("-------------------------------------------------------"
                                  +"\nSTUDENT ID: "+ID.get(i)
                                  +"\nSTUDENT NAME: "+Name.get(i)
                                  +"\nSTUDENT AGE: "+Age.get(i)
                                  +"\nSTUDENT EMAIL: "+Email.get(i)
                                  +"\nSTUDENT COURSE: "+Course.get(i)
                                  +"\n-------------------------------------------------------");//result if an id matches 
                StudentIdNotFound=false;
            }
        }
        if (StudentIdNotFound==true) //checking id a student id did match 
        {
            Output=           ("--------------------------------------------------------"
                              +"\nStudent with Student id: "+IDToSearchFor+" was not be found!"
                              +"\n--------------------------------------------------------");//returning messege if no id matched 
        }
        
        return Output;
    }
    
    public String DeleteStudent (Scanner kb, ArrayList<String> ID ,ArrayList<String> Name, ArrayList<Integer> Age, ArrayList<String> Email, ArrayList<String> Course)
    {
        
        //declaration
        String IDToDelete;
        boolean StudentIdNotFound=true;
        String Output="";
        
        System.out.println("Enter the student id to delete: ");
        IDToDelete=kb.next();
        
        //looping through array list
        for (int i = 0; i < ID.size(); i++) 
        {
            if (ID.get(i).equals(IDToDelete))//checking if id matches  
            {
                StudentIdNotFound=false;
                //printing out the student details if the id matches 
                System.out.println("-------------------------------------------------------"
                                  +"\nSTUDENT ID: "+ID.get(i)
                                  +"\nSTUDENT NAME: "+Name.get(i)
                                  +"\nSTUDENT AGE: "+Age.get(i)
                                  +"\nSTUDENT EMAIL: "+Email.get(i)
                                  +"\nSTUDENT COURSE: "+Course.get(i)
                                  +"\n-------------------------------------------------------"
                                  +"\nAre you sure you want to delete student "+IDToDelete+" from the system? Yes (y) to delete");
                if (kb.next().equals("y")) //confirming delete 
                {
                   ID.remove(i);
                   Name.remove(i);
                   Age.remove(i);
                   Email.remove(i);
                   Course.remove(i);//removint the elements that the student details ocupy
                   student(ID, Name, Age, Email, Course);//setting it to global array 
                   Output=("-------------------------------------------------------"
                                     +"\nStudent with id "+IDToDelete+" WAS deleted!"
                                     +"\n-------------------------------------------------------");  
                }
            }    
            
        }
        
        if (StudentIdNotFound==true) // checking if no id matches 
        {
            Output=("--------------------------------------------------------"
                              +"\nStudent with Student id: "+IDToDelete+" was not be found!"
                              +"\n--------------------------------------------------------");
        }
        return Output;
    }
    
    //displaying a full report of all students 
    public void StudentReport(Scanner kb, ArrayList<String> ID ,ArrayList<String> Name, ArrayList<Integer> Age, ArrayList<String> Email, ArrayList<String> Course)
    {
        
        for (int i = 0; i < ID.size(); i++) 
        {
                System.out.println("student "+ (i+1)
                                  +"\n-------------------------------------------------------"
                                  +"\nSTUDENT ID: "+ID.get(i)
                                  +"\nSTUDENT NAME: "+Name.get(i)
                                  +"\nSTUDENT AGE: "+Age.get(i)
                                  +"\nSTUDENT EMAIL: "+Email.get(i)
                                  +"\nSTUDENT COURSE: "+Course.get(i)
                                  +"\n-------------------------------------------------------");   
        }        
    }
    
    //closes the application
    public void ExitStudentApplication()
    {
        System.exit(0);
    }
    
    //if the user does not select a valid choice 
    public void defaultchoice(Scanner kb)
    {
        System.out.println("""
                           That is an invalid choice.
                           Select from the options provided.""");
        Menue(kb); 
    }
    
    //exit choice given after each action is peformed 
    public void exitchoice (Scanner kb){
        System.out.println("Enter (1) to launch menu or any other key to exit");
        if (kb.next().equals("1")) {
            Menue(kb);
        }
    }
    
}