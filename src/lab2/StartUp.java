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
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse course3 = new IntroJavaCourse("WOWJAVAAGAIN!","412412313-15413");
        
        AdvancedJavaCourse coursehard = new AdvancedJavaCourse("Barney's Sing Along Songs", "123-456789");
        
        ProgrammingCourse courseintro =  new IntroToProgrammingCourse("My First Steps","098123-1231541");
    }
}
