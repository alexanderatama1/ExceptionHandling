/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse1iox.exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class ExceptionHandlingThird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { // enclose statements in try block if we think they can throw exception
            // task 1: Read in two integers from the keyboard and print the quotient from the division

            // Read in the first integer
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first number: ");
            int first = sc.nextInt();
            sc.nextLine();          //used after read int
            System.out.println();  // new line for readability

            // Read in the first integer
            System.out.println("Please enter second number: ");
            int second = sc.nextInt();
            sc.nextLine();           // used after read int
            System.out.println();    // new line for readability

            // Integer division, getting quotient
            int quotient = first / second;
            System.out.println("The quotient is " + quotient);
            
            // task 2: array assinment
            System.out.println("Enter the size of your array: ");
            int size = sc.nextInt();
            sc.nextLine();          // used after read int
            
            int[] array = new int[size];
            for (int i =0; i < array.length; i++){
                System.out.println("Enter a number: ");
                int element = sc.nextInt();// used after read int 
                sc.nextLine();
                array[i] = element;
            }
            System.out.println("The last element in array is " + array[array.length]);
        }
        // A catch block is where you handle ArithmeticException
        catch(ArithmeticException e) {
            System.out.println("You should not divide a number by zero");
            System.out.println(); // new line for readability
            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of index!");
        }
        catch(Exception e) {
            System.out.println("There is an error here. The error is as below. Please fix it!");
            System.out.println(e.getMessage());
        }
        
        System.out.println();  // new line for readability
        System.out.println("We are  out of try-catch block.\n"
                            + "The program ends here.\n "
                            + "Thanks and see ya later!");
    }
    
}
