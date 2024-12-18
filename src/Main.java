import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(reverseString("Hello"));

        String[] words = {"Hello", "world", "Java"};
        System.out.println(joinWords(words));

        System.out.println(countVowels("Programming"));

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Java"));

        System.out.println(capitalizeFirstLetters("hello world java programming"));

        System.out.println(countWords("This is a test sentence."));


        System.out.println(convertToAscii("Hello"));


        System.out.println(removeSpaces("Hello world Java"));

    }
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static String joinWords(String[] words) {
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static String capitalizeFirstLetters(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    public static String convertToAscii(String sentence) {
        StringBuilder result = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            result.append((int) c).append(" ");
        }
        return result.toString().trim();
    }
    public static String removeSpaces(String sentence) {
        return new StringBuilder(sentence).toString().replace(" ", "");
    }



}