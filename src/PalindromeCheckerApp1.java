//USE CASE 11

import java.util.Scanner;

class PalindromeChecker {
    public boolean checkPalindrome(String input){
        if(input == null){
            return false;
        }
        String normalized = input.replaceAll("\\s+","").toLowerCase();

        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while(start<end){
            if(chars[start]!=chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class PalindromeCheckerApp1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome?: "+result);

        scanner.close();
    }
}