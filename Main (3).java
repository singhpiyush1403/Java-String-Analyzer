import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        int vowels = 0, consonants = 0;
        for (char c : cleaned.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        String reversed = new StringBuilder(input).reverse().toString();

        String reversedCleaned = new StringBuilder(cleaned).reverse().toString();
        boolean isPalindrome = cleaned.equals(reversedCleaned);

        System.out.println("\n--- String Analysis ---");
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));
    }
}
