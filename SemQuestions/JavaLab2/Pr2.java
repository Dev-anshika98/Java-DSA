package JavaLab2;

public class Pr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Count number of characters
        int charCount = inputString.length();
        System.out.println("Number of characters in the string: " + charCount);
        
        // Reverse the string
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
        
        // Check if it's a palindrome
        boolean isPalindrome = isPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

    

