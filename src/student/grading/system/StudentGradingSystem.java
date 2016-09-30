/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grading.system;

import java.util.Scanner;

/**
 *
 * @author fahmee
 */
public class StudentGradingSystem {

    /**
     * @param args the command line arguments
     */
    final static Scanner inputValue = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic he
    
        
      menu();
        
        
        
        
        
    }
    
    final public static void gradeCenter(){
    
    System.out.println("Welcome to the Student Grade Center");
    System.out.println();
    System.out.println("[1]- Enter a grade");
    System.out.println("[2]- Remove Student ");
    System.out.println("[3]- Student average grades");
    System.out.println("[4]- Exit");
    
    System.out.println("What would you like to do today (Enter a number)");
    
    
    
    }
    
    final public static void removeStudent(){
    System.out.println(" What student to remove: ");
    String inputString = inputValue.nextLine();
    
    }
    final public static void addGrade(){
    System.out.println("Input the grade : ");
    String gradeInput = inputValue.nextLine();
    
    }
    final public static void gradeAvg(){
    
    }
    
    final public static void menu(){
        gradeCenter();
        int inputNumber = inputValue.nextInt();
        
        while (inputNumber !=4){
            switch(inputNumber){
                case 1: addGrade();
                    break;
                case 2: removeStudent();
                    break;
                case 3: gradeAvg();
                    break;
                default:System.out.println("Incorrect, please try again");
                    break;
            
            
            
            }
            inputNumber = inputValue.nextInt();
        
        
        
        }
    
    
    }
    
}
