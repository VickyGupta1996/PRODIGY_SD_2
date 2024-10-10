import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0; 
        int userGuess = 0; 

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        
       
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++; 

           
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }
        }

        
        System.out.println("It took you " + attempts + " attempts to guess the number " + randomNumber + ".");
        
        scanner.close(); 
    }
}
