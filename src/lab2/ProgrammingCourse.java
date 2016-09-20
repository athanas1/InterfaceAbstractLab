/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Alex
 */
public interface ProgrammingCourse {
    
    // Abstract classes are ment to be inherited by sub classes and changed by them, so no Final class here.
    
    public abstract String getCourseName();
    
    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(Double credits);
    
    
    
}
