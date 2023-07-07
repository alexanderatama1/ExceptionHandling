/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse1iox.exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class ExceptionHandlingFirst {

    public static void main(String[] args) {
        // task 1: Read in two integers from the keyboard and print the quotient from the division
        
        // Read in the first integer
        Scanner sc =new Scanner(System.in);
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
        int quotient = first/second;
        System.out.println("The quotient is " + quotient);
    }
}
