package Functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // take input of 2 num and find sum
           sum();

    }
    static void sum(){
        Scanner in = new Scanner(System.in)
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();

         int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }


        /*
         return_type name(){
            body
            return statement
         }
         */

    
}
