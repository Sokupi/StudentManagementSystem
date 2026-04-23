/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MyApp;
import MyLib.Student;
import java.util.Scanner;

/**
 *
 * @author david
 */

public class Main {
    public static void main(String[] args) {
        // CONSTRUCTOR (SCANNER)
        Scanner sc = new Scanner(System.in);
        
        // INPUT (NUMBER OF STUDENTS)
        System.out.println("Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        // CONSTUCTOR (STUDENT ARRAY)
        Student[] students = new Student[n];
        
        // ITERATIVE (COUNTS THE NUMBER OF STUDENTS)
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i+1) + " ---");
            
            // INPUT (STUDENT DETAILS
            System.out.println("Enter Name: "); // For NAME
            String name = sc.nextLine();
            
            System.out.println("Enter Age: "); // For AGE
            int age = sc.nextInt();
            
            // CONSTRUCTOR (GRADES)
            double[] grades = new double[3];
            
            // INPUT and ITERATIVE (GRADES)
            System.out.println("Enter 3 Grades (00.00): ");
            for (int j = 0; j < 3; j++) { // Make sures there are only 3 inputs
                System.out.print("Grades " + (j + 1) + ": "); // Format Display (Grade #: )
                
                grades[j] = sc.nextDouble();
            }
            
            sc.nextLine();
            
            // CONSTRUCTOR (PUTTING STUDENT DETAILS TO STUDENT CLASS)
            students[i] = new Student(name, age, grades);
        }
        
        // DISPLAY and ITERATION (RECORDS)
        System.out.println("\n--- STUDENT RECORDS ---");
        for (Student s : students) { // Per Student
            s.displayInfo();
        }
        
        System.out.println("Total Students: " + Student.studentCount);
    }
}
