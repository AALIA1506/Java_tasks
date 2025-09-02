package tasks.com;

public class Palindromenum 
{
	    public static boolean isPalindrome(int num) {
	        int original = num;
	        int rev = 0;

	        while (num > 0) {
	            int digit = num % 10;       // Get last digit
	            rev = rev * 10 + digit;     // Build reversed number
	            num = num / 10;             // Remove last digit
	        }

	        return original == rev;  // Compare original with reversed
	    }
	    

	    public static void main(String[] args) {
	        int num = 12321;  // Example input

	        if (isPalindrome(num)) {
	            System.out.println(num + " is a palindrome.");
	        } else {
	            System.out.println(num + " is not a palindrome.");
	        }
	    }
	}

