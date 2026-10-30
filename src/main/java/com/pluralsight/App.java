package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class App {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();
    }

    private static void runHomeScreen() {
        String userChoice;

        System.out.println("WELCOME TO WORKOUT TRACKER");

        do {

            System.out.println("""
                    (N) Add a new workout
                    (W) View Workouts
                    (X) Exit
                    
                    Enter your selection: 
                    """);

            userChoice = scanner.nextLine().trim().toLowerCase();

            switch (userChoice) {
                case "n" -> addNewWorkout();
                case "w" -> runWorkoutScreen();
                case "x" -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid input. Please choose from one of the options listed above.");
            }

        } while (!userChoice.equals("x"));
    }

    private static void addNewWorkout() {

        System.out.println("Enter the name of the workout: ");
        String workoutName = scanner.nextLine().trim();

        System.out.println("Enter the workout type: ");
        String workoutType = scanner.nextLine().trim();

        System.out.println("Enter the duration in minutes: ");
        String durationInMinutes = scanner.nextLine().trim();

        System.out.printf("Workout information:%n - Name: %s%n - Type: %s%n - Duration: %s minutes", workoutName, workoutType, durationInMinutes);

        pressEnterToContinue();
    }

    private static void runWorkoutScreen() {
        String userChoice;

        do {

            System.out.println("""
                    VIEW WORKOUTS
                    (A) View All Workouts
                    (Q) View Workouts Under 30 Minutes
                    (F) View Favorite Workouts
                    (S) Search Workouts
                    (H) Return to Home Screen
                    
                    Enter your selection: 
                    """);
            userChoice = scanner.nextLine().trim().toLowerCase();

            switch (userChoice) {
                case "a" -> System.out.println("TODO: viewAllWorkouts()");
                case "q" -> System.out.println("TODO: viewQuickWOrkouts()");
                case "f" -> System.out.println("TODO: viewFavoriteWorkouts()");
                case "s" -> runSearchScreen();
                case "h" -> System.out.println("Returning to home screen...");
                default -> System.out.println("Invalid input. Please make a selection from the options listed above.");
            }

        } while (!userChoice.equals("h"));
    }

    private static void runSearchScreen() {
        String userChoice;

        do {

            System.out.println("""
                    SEARCH WORKOUTS
                    (1) Search by Name
                    (2) Search by Type
                    (3) Search by Duration
                    (0) Return to View Workouts
                    
                    Enter your selection: 
                    """);

            userChoice = scanner.nextLine().trim().toLowerCase();

            switch (userChoice) {
                case "1" -> System.out.println("TODO: searchByName(String name)");
                case "2" -> System.out.println("TODO: searchByType(type)");
                case "3" -> System.out.println("TODO: searchByDuration(duration)");
                case "0" -> System.out.println("Returning to View Workouts...");
            }
        } while (!userChoice.equals("0"));
    }

    private static void pressEnterToContinue() {
        System.out.println();
        System.out.println("Press enter to return to the menu...");
        scanner.nextLine();
    }

}
