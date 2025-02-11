/*
 * Class: CMSC203 
 * Instructor:
 * Description: The program asks the user to select one option on a menu and display the name of colors gotten 
 * from a text file, and ask him to guess the color, then at the end display his score.
 * Due: 2/10/2025
 * Platform/compiler: eclipse/javac
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Armel Daryl Kelodjoue Nguetchouang
 */

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        
        String answer, words = ""; // answer is used to hold the response to 
                                    // continue the game and words to hold the number of colors selected from the file written in words
        
        int score = 0; // score for each round
        int colorsnumber = 0; // used to select the exact line to scan for the random colors
        Scanner input = new Scanner(System.in);
        
        System.out.println("CMSC203 Assignment1: Text your ESP skills!");
        System.out.println("Welcome to ESP-extrasensory perception!");
        
        do {
            System.out.println("Would you please choose one of the 4 options from the menu: \n");
            System.out.println("  1-  read and display on the screen first 16 names of colors from a file colors.txt, "
                    + "so the player can\n      select one of them names of colors.");
            System.out.println("  2-  read and display on the screen first 10 names of colors from a file colors.txt, "
                    + "so the player can\n      select one of them names of colors.");
            System.out.println("  3-  read and display on the screen first 5 names of colors from a file colors.txt, "
                    + "so the player can\n      select one of them names of colors.");
            System.out.println("  4- Exit from a program");
            
            System.out.print("Enter the option: ");
            int option = input.nextInt();
            while (option < 1 || option > 4) {
                System.out.println("Please enter a valid option!!");
                option = input.nextInt();
            }
            
            switch (option) {
                case 1:
                    colorsnumber = 16;
                    words = "sixteen";
                    break;
                case 2:
                    colorsnumber = 10;
                    words = "ten";
                    break;
                case 3:
                    colorsnumber = 5;
                    words = "five";
                    break;
                case 4:
                    break;
            }
            
            if (option == 1 || option == 2 || option == 3) {
                System.out.print("Enter the filename: ");
                String filename = input.next();
                input.nextLine();
                
                try {
                    File file = new File(filename);
                    Scanner scanner = new Scanner(file);
                    
                    System.out.println("There are " + words + " colors from the file:");
                    int i = 1;
                    while (scanner.hasNext() && i <= colorsnumber) {
                        System.out.println(i + " " + scanner.next());
                        i++;
                    }
                    scanner.close();
                    System.out.println();
                    score = 0;
                    
                    for (i = 1; i <= 3; i++) {
                        Random random = new Random();
                        int random_number = 1 + random.nextInt(colorsnumber);
                        
                        System.out.println("Round " + i);
                        System.out.println("\nI am thinking of a color.");
                        System.out.println("Is it one of the list of colors above?");
                        System.out.println("Enter your guess: ");
                        String userguess = input.next();
                        System.out.print("\n");
                        
                        scanner = new Scanner(file);
                        for (int j = 1; j < random_number; j++) {
                            scanner.nextLine();
                        }
                        
                        String ColorFromFile = scanner.nextLine();
                        
                        System.out.println("I was thinking of " + ColorFromFile);
                        if (ColorFromFile.equalsIgnoreCase(userguess)) {
                            score++;
                        }
                        scanner.close();
                    }
                    System.out.println("Game Over\n");
                    System.out.println("You guessed " + score + " out of 3 colors correctly.\n");
                    
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + e.getMessage());
                }
                
                System.out.println("Would you like to continue the game? Type Yes/No");
                answer = input.next();
            } else {
                break;
            }
            
        } while (answer.equalsIgnoreCase("yes"));
        
        System.out.println();
        input.nextLine();
        System.out.print("Enter your name: ");
        String username = input.nextLine();
        System.out.print("Describe yourself: ");
        String description = input.nextLine();
        System.out.print("Due Date: ");
        String DUE_DATE = input.nextLine();
        System.out.println("Username: " + username);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + DUE_DATE);
        
        // This section of the code writes to the file 
        try {
            PrintWriter writer = new PrintWriter("EspGameResults.txt");
            writer.println("Game Over");
            writer.println("You guessed " + score + " out of 3 colors correctly");
            writer.println("Due Date: " + DUE_DATE);
            writer.println("Username: " + username);
            writer.println("User Description: " + description);
            writer.println("Date: " + DUE_DATE);
            
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File could not be created!");
        }
        
        input.close();
    }
}
