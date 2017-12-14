/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct11_2017_inheritance;

import java.util.ArrayList;


public class Student extends Person{
    private String schoolName;
    private String program;
    ArrayList<Double> grades=new ArrayList<>();
    public double bonus()
    {
        return calculateAverage() *1000;
    }

    public Student(String schoolName, String program, String name, int age, String address) {
        super(name, age, address);
        this.schoolName = schoolName;
        this.program = program;
    }
    public void addGrade(double grade)
    {
        grades.add(grade);
    }
    public double calculateAverage()
    {
        int numberOfElements=grades.size();
        double sum=0;
        for (Double grade : grades) {
            sum+=grade;
        }
        return (sum/numberOfElements);
        }
    }
    
