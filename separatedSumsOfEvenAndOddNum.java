package PositiveAndNegative;
import java.util.Scanner;

public class separatedSumsOfEvenAndOddNum {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner user = new Scanner(System.in);
        
        // Declare variables to store the numbers and their sum
        float ENumbers = 0, ONumbers = 0;
        
        // Create an array to store 10 numbers
        float numbers[] = new float[10];
        
        // Prompt the user to enter 10 numbers and store them in the array
        for(int i = 0; i < 10; i++) {
            System.out.println("Please enter number " + (i + 1) + ":");
            numbers[i] = user.nextInt();
        }        
        
        // Calculate the sum of even and odd numbers separately
        for(int i = 0; i < 10; i++) {
            if(numbers[i] % 2 == 0) {
                ENumbers += numbers[i];
            } else {
                ONumbers += numbers[i];
            }
        }
        
        // Print the sum of even and odd numbers
        System.out.println("The sum of even numbers = " + ENumbers);
        System.out.println("The sum of odd numbers = " + ONumbers);

        user.close();
    }
}


