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
public class ThrowExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read name and age for registration
        try {
            // Read name
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            sc.nextLine();               // used after read int
            System.out.println();        // new line for readability

            // Read age
            System.out.println("Please enter your age:");
            int age = sc.nextInt();
            sc.nextLine();              // used after read int
            System.out.println();       // new line for readability

            // Validate age
            if (age < 16) {
                // Validate data and throw exception if data is not valid
                throw new Exception("You are too young for lisence registration!");
            }
        }    
        catch (Exception e){
            System.out.println(e.getMessage());
            }
        }

    }
