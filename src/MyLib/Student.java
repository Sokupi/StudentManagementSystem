/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MyLib;
import java.util.Scanner;

/**
 *
 * @author david
 */

public class Student {
    // CLASS VARIABLES
    private String name;
    private int age;
    private double[] grades;
    public static int studentCount = 0;
    
    // CONSTRUCTOR
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        
        studentCount++; // Increments by 1 per student
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double[] getGrades() {
        return grades;
    }
    
    public double calculateAverage() {
        // LOCAL VARIABLES
        double sum = 0;
        
        // CONDITION (SUM)
        for (double g : grades) {
            sum += g; // Adds all the values of sum
        }
        
        return sum / grades.length; // ".length" is the amount of elements available to the array
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Average: %.2f\n", calculateAverage());
        System.out.println();
    }
}
