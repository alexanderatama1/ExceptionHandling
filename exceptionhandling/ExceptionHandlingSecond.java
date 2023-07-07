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
public class ExceptionHandlingSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
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
        } catch (Exception e) {
            System.out.println("There is an error here. The error type is as below. Please fix it!");
            System.out.println(e.getMessage());
        }
        
        System.out.println(); // new line for readability
        System.out.println("We are out of try-catch block.\n"
                            + "The program ends here.\n"
                            + "Thanks and see ya later!");
    }

}
