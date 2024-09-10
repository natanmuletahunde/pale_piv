import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        // Convert the string to lowercase to ensure case insensitivity
        String lowerCaseString = original.toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(lowerCaseString).reverse().toString();
        
        // Check if the original and reversed strings are the same
        if (lowerCaseString.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
