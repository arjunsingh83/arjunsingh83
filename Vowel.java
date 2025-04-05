import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Step 1: Read the string from the user
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            // Step 2: Initialize the vowel counter
            int vowelCount = 0;
            
            // Step 3: Iterate through the string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                
                // Step 4: Check if the character is a vowel
                if (isVowel(ch)) {
                    vowelCount++;
                }
            }
            
            // Step 5: Display the vowel count
            System.out.println("Number of vowels: " + vowelCount);
        }
    }
    
    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
