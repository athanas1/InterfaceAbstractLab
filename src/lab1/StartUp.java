/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Alex
 */
public class StartUp {
    public static void main(String[] args) {
        // all subclasses being called to make objects
        ProgrammingCourse[] courses = {
          new AdvancedJavaCourse("Woah!HardJava","513-11153"), new IntroJavaCourse("Woah!EasyJava","513-11153"), new IntroToProgrammingCourse("Woah!Easy","513-11153")  
        };
        for(ProgrammingCourse pc : courses) {
            System.out.println(pc.getCourseName());
        }
        
        
        ProgrammingCourse course = new AdvancedJavaCourse("Woah!Java","513-11153");
        System.out.println(course.getCourseName());
        
        //I think Liskov Substitution Principal is useful when you only have a few subclasses, However the more subclasses you get if could get a bit more hectic and not work.
        
        IntroToProgrammingCourse course3 = new IntroToProgrammingCourse("Woah!Programming","5122-413234");
        System.out.println(course3.getCourseNumber() + " " + course3.getCourseName());
        
        ProgrammingCourse course51 = new IntroJavaCourse("Woah!EasierJava!","123-456789");
        System.out.println(course51.getCourseName());
        
        
    }
}
