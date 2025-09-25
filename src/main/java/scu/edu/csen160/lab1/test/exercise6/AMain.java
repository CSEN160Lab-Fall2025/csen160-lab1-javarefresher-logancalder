package scu.edu.csen160.lab1.test.exercise6;

public class AMain {
    public static void main (String [] args){
        System.out.println(Exercise6.fullName("Robert", "James", "Clark"));

        System.out.println("Is palindrome: " + Exercise6.palindrome("A man, a plan, a canal, Panama"));
        System.out.println("Is palindrome: " + Exercise6.palindrome("desserts"));
        System.out.println("Is palindrome: " + Exercise6.palindrome("radar"));
        System.out.println("Is palindrome: " + Exercise6.palindrome("Madam"));
        // Test fullName with the following data
        // robert (first), james (middle), CLARK (last)
        // Test with data of your choice.

        // Test palindrome() with the following data
        // A man, a plan, a canal, Panama
        // desserts
        // radar
        // Madam
    }
}
