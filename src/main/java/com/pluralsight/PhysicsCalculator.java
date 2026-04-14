package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;

public class PhysicsCalculator {

    // Shared scanner used across all methods
    static Scanner userInput = new Scanner(in);

    // User option labels — easy to update in one place
    static String userOption1            = "Calculations";
    static String userOption2            = "Physics equations";
    static String userOption3            = "Physics constants";
    static String userOption4            = "General Knowledge";
    static String userOptionToExit       = "Exit the program";
    static String userOptionBackToMainMenu = "Main Menu";
    static int option;
    static int constantChoice;
    static int choice;

    public static void main(String[] args) {

        //int option;

        out.println("\n======Hello Young Einstein!======");
        out.println("Welcome to the physics calculator!\n");

        // Outer loop — keeps the program running until the user selects Exit
        do {
            option = 0; // reset so the prompt always shows on return

            displayMainMenu();
            option = getValidatedInput(5);

            switch (option) {
                case 1 -> handleCalculations();
                case 2 -> handleEquations();
                case 3 -> handleConstants();
                case 4 -> handleGeneralKnowledge();
                case 5 -> handleExit();
            }

        } while (option != 5);

        userInput.close();
    }


    // Menu display — keeps the main method clean and focused on flow control
    static void displayMainMenu() {
        out.println("What would you like to do?");
        out.println("""
                1. Calculations.
                2. Physics equations.
                3. Physics constants.
                4. General Knowledge.
                5. Exit.
                """);
    }


    // Reusable validated input — handles out-of-range and noninteger input
    static int getValidatedInput(int max) {

        choice = 0;

        do {
            out.print("Please enter your choice: ");
            try {
                choice = userInput.nextInt();
                if (choice < 1 || choice > max) {
                    out.println("Invalid option. Please select a number between " + 1 + " and " + max + ".");
                }
            } catch (InputMismatchException e) {
                out.println("Invalid input. Please enter a number.");
                userInput.next(); // clear the bad token
            }
        } while (choice < 1 || choice > max);
        return choice;
    }

    // Eats the newline from the nextInt() call and lets the user read the intended data and gives them an option to Enter to continue

    static void pressEnterToContinue() {
        out.println("\nPress Enter to return to the main menu...");
        userInput.nextLine(); // consume leftover newline from nextInt
        userInput.nextLine(); // wait for user to press Enter
    }

    // Case 1 — Calculations
    static void handleCalculations() {
        out.println("\nYou have selected: 1 for " + userOption1 + "\n");
        out.println("(Calculation features coming soon!)");
        pressEnterToContinue();
    }

    // Case 2 — Physics Equations
    static void handleEquations() {
        out.println("\nYou have selected: 2 for " + userOption2 + "\n");
        out.println("""
                1. Newton's laws of motion.
                2. Einstein's theory of relativity.
                3. Schrödinger's equation.
                4. Coulomb's law.
                5. Heisenberg's uncertainty principle.
                6. Maxwell's equations.
                7. Stefan-Boltzmann law.
                """);

        int equationChoice = getValidatedInput(7);

        switch (equationChoice) {
            case 1 -> showNewtonsLaws();
            case 2 -> showEinsteinRelativity();
            case 3 -> showSchrodingerEquation();
            case 4 -> showCoulombsLaw();
            case 5 -> showHeisenbergPrinciple();
            case 6 -> showMaxwellsEquations();
            case 7 -> showStefanBoltzmann();
        }

        pressEnterToContinue();
    }

    static void showNewtonsLaws() {
        out.println("\nYou have selected: Newton's laws of motion.\n");
        out.println("""
                            ***Newton's First Law of motion: The law of inertia***
           
                a) A body in motion will stay in its state of motion unless
                   acted upon by an equal or unbalanced force.
                b) A body at rest will stay at rest unless acted upon by an equal or unbalanced force.
           
                            ***Newton's Second Law of motion: The law of acceleration***
           
                a) The acceleration of an object is directly proportional to the net force acting on
                   it and inversely proportional to its mass.
                b) Formula: F = ma
           
                            ***Newton's Third Law of motion: The law of action and reaction***
           
                a) For every action, there is an equal and opposite reaction.
                b) If object A exerts a force on object B, object B simultaneously exerts an equal
                   and opposite force on object A.
                """);
    }

    static void showEinsteinRelativity() {
        out.println("\nYou have selected: Einstein's theory of relativity.\n");
        out.println("""
                            ***Einstein's Special Theory of Relativity***
           
                a) The laws of physics are the same for all observers in uniform motion.
                b) The speed of light in a vacuum is the same for all observers.
                c) Famous formula: E = mc²
                   Where E is energy, m is mass, and c is the speed of light.
                """);
    }

    static void showSchrodingerEquation() {
        out.println("\nYou have selected: Schrödinger's equation.\n");
        out.println("""
                            ***Schrödinger's Equation***
           
                a) Describes how the quantum state of a physical system changes over time.
                b) It is a key equation in quantum mechanics.
                c) Time-dependent form: iℏ(∂ψ/∂t) = Ĥψ
                   Where ψ is the wave function and Ĥ is the Hamiltonian operator.
                """);
    }

    static void showCoulombsLaw() {
        out.println("\nYou have selected: Coulomb's law.\n");
        out.println("""
                            ***Coulomb's Law***
           
                a) Describes the force between two charged particles.
                b) Formula: F = k(q₁q₂)/r²
                   Where F is force, k is Coulomb's constant, q₁ and q₂ are charges,
                   and r is the distance between them.
                """);
    }

    static void showHeisenbergPrinciple() {
        out.println("\nYou have selected: Heisenberg's uncertainty principle.\n");
        out.println("""
                            ***Heisenberg's Uncertainty Principle***
           
                a) It is impossible to simultaneously know both the exact position
                   and exact momentum of a particle.
                b) Formula: Δx · Δp ≥ ℏ/2
                   Where Δx is the uncertainty in position and Δp is the uncertainty in momentum.
                """);
    }

    static void showMaxwellsEquations() {
        out.println("\nYou have selected: Maxwell's equations.\n");
        out.println("""
                            ***Maxwell's Equations***
           
                a) A set of four equations that describe the behavior of electric and magnetic fields.
                b) They form the foundation of classical electrodynamics and optics.
                   1. Gauss's law for electricity: ∇·E = ρ/ε₀
                   2. Gauss's law for magnetism:   ∇·B = 0
                   3. Faraday's law:               ∇×E = -∂B/∂t
                   4. Ampère-Maxwell law:           ∇×B = μ₀J + μ₀ε₀(∂E/∂t)
                """);
    }

    static void showStefanBoltzmann() {
        out.println("\nYou have selected: Stefan-Boltzmann law.\n");
        out.println("""
                            ***Stefan-Boltzmann Law***
           
                a) Describes the power radiated from a black body in terms of its temperature.
                b) Formula: P = σT⁴
                   Where P is power radiated per unit area, σ is the Stefan-Boltzmann constant,
                   and T is the absolute temperature in Kelvin.
                """);
    }


    // Case 3 — Physics Constants
    static void handleConstants() {
        constantChoice = 0;

        out.println("\nYou have selected: 3 for " + userOption3);
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

        constantChoice = getValidatedInput(8);

        switch (constantChoice) {
            case 1 -> out.println("Planck's constant is: "          + 6.626070040813e-34  + " J s");
            case 2 -> out.println("Boltzmann's constant is: "       + 1.38064852e-23      + " J K^-1");
            case 3 -> out.println("Avogadro's number is: "          + 6.022140857e23      + " mol^-1");
            case 4 -> out.println("Speed of light is: "             + 299792458           + " m/s");
            case 5 -> out.println("Gravitational constant is: "     + 6.67430e-11         + " m^3 kg^-1 s^-2");
            case 6 -> out.println("Elementary charge is: "          + 1.602176634e-19     + " C");
            case 7 -> out.println("Reduced Planck constant is: "    + 1.054571817e-34     + " J s");
            case 8 -> out.println("Returning to " + userOptionBackToMainMenu + "...");
        }

        if (constantChoice != 8) {
            pressEnterToContinue();
        }
    }


    // Case 4 — General Knowledge
    static void handleGeneralKnowledge() {
        out.println("\nYou have selected: 4 for " + userOption4 + "\n");
        out.println("(General Knowledge features coming soon!)");
        pressEnterToContinue();
    }

    // Case 5 — Exit
    static void handleExit() {
        out.println("\nYou have selected: 5 to " + userOptionToExit);
        out.println("""
                
                               Please Come Again
                ************** Goodbye for now! ****************
                
                """);
    }
}