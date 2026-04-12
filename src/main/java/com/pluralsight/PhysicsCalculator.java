package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;



public class PhysicsCalculator {
    public static void main(String[]args){


        //Declared my variables here at the top.
        Scanner userInput = new Scanner(in);
        int option = 0;
        int constantChoice = 0;

        //Declared my user options here to make it easy to change later if I have to update the options.
        String userOption1 = "Calculations";
        String userOption2 = "Physics equations";
        String userOption3 = "Physics constants";
        String userOption4 = "General Knowledge";
        String userOptionToExit = "Exit the program";
        String userOptionBackToMainMenu = "Main Menu";

        //A nice welcome message to the user.
        out.println("Hello Young Einstein! Welcome to the physics calculator!\n");

        do {
        //Introduction to the program which displays the user options.

        out.println("What would you like to calculate?");
        out.println("""
                1. Calculations.
                2. Physics equations.
                3. Physics constants.
                4. General Knowledge.
                5. Exit.
                """);

        // This do-while loop validates the user input for the main menu options.
        do {
            out.print("Please enter your choice: ");
            try {
                option = userInput.nextInt();  // if this throws, catch handles it
                if (option < 1 || option > 5) {
                    out.println("Invalid option. Please select a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                out.println("Invalid input. Please enter a number.");
                userInput.next(); // clear the bad token — don't comment this out!
            }
        } while (option < 1 || option > 5);




        switch(option) {
            case 1:

                out.println("You have selected: " + option + " for " + userOption1);

                break;
            case 2:

                out.println("You have selected: " + option + " for " + userOption2);
                out.println("""
                        1. Newton's laws of motion.
                        2. Einstein's theory of relativity.
                        3. Schrödinger's equation.
                        4. Coulomb's law.
                        5. Heisenberg's uncertainty principle.
                        6. Maxwell's equations.
                        7. Stefan-Boltzmann law.
                        """);
                break;

            case 3:

                out.println("You have selected: " + option + " for " + userOption3);
                out.println("""
                        1. Planck's constant.
                        2. Boltzmann's constant.
                        3. Avogadro's number.
                        4. Speed of light.
                        5. Gravitational constant.
                        6. Elementary charge.
                        7. Reduced Planck constant.
                        8. Back to Main Menu.
                        """);

                do {
                    out.print("Please enter your choice: ");
                    try {
                        constantChoice = userInput.nextInt();  // if this throws, catch handles it
                        if (constantChoice < 1 || constantChoice > 8) {
                            out.println("Invalid option. Please select a number between 1 and 8.");
                        }
                    } catch (InputMismatchException e) {
                        out.println("Invalid input. Please enter a number.");
                        userInput.next(); // clear the bad token — don't comment this out!
                    }
                } while (constantChoice < 1 || constantChoice > 8);


                switch (constantChoice) {
                    case 1:

                        out.println("You have selected: " + constantChoice + " for Planck's constant.");

                        out.println("Planck's constant is: " + 6.626070040813e-34 + " J s");

                        break;
                    case 2:

                        out.println("You have selected: " + constantChoice + " for Boltzmann's constant.");
                        out.println("Boltzmann's constant is: " + 1.38064852e-23 + " J K^-1");

                        break;
                    case 3:

                        out.println("You have selected: " + constantChoice + " for Avogadro's number.");
                        out.println("Avogadro's number is: " + 6.022140857e23 + " mol^-1");

                        break;
                    case 4:

                        out.println("You have selected: " + constantChoice + " for Speed of light.");
                        out.println("Speed of light is: " + 299792458 + " m/s");

                        break;
                    case 5:

                        out.println("You have selected: " + constantChoice + " for Gravitational constant.");
                        out.println("Gravitational constant is: " + 6.67430e-11 + " m^3 kg^-1 s^-2");

                        break;
                    case 6:

                        out.println("You have selected: " + constantChoice + " for Elementary charge.");
                        out.println("Elementary charge is: " + 1.602176634e-19 + " C");

                        break;
                    case 7:

                        out.println("You have selected: " + constantChoice + " for Reduced Planck constant.");
                        out.println("Reduced Planck constant is: " + 1.054571817e-34 + " J s");
                        break;


                    case 8:

                        out.println("You have selected: " + constantChoice + " for " + userOptionBackToMainMenu);
                        out.println("\nBack to Main Menu");
                        break;
                }

                    if (constantChoice != 8) {
                        out.println("\nPress Enter to return to the main menu...");
                        userInput.nextLine(); // consume leftover newline from nextInt
                        userInput.nextLine(); // wait for user to press Enter
                    }

                    break; // ends case 3

            case 4:

                out.println("You have selected: " + option + " for " + userOption4);

                break;


            case 5:

                userInput.close();
                out.println("You have selected: " + option + " to " + userOptionToExit);
                out.println("Goodbye!");

                break;

        }
        }while (option != 5);
    }
}
