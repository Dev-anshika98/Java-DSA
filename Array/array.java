package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array {



public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];

    arr[0] = 9;
    arr[1] = 4;
    arr[2] = 3;
    arr[3] = 5;
    arr[4] = 8;
    
    System.out.println(arr[3]);


    //input using loop
    // for(int i = 0; i<arr.length;i++){
    //     arr[i] = input.nextInt();
    // }


    // for(int i = 0; i<arr.length;i++){
    //     System.out.print(arr[i] + " ");
    // }

    // for (int num : arr){ // for every element in the array print the element
    //    System.out.print( num + " "); // here num represent element of the array
    // }


    // System.out.println(arr[6]); // error index bound


    // for(int i = 0; i<arr.length;i++){
    //     arr[i] = input.nextInt();
    // }
    // System.out.println(Arrays.toString(arr));









    
}


    // public static String toString(int[] a) {
    //     if(a==null)
    //     return "null";
    //     int iMax = a.length -1;
    //     if(iMax ==-1)
    //     return "[]";


    //     StringBuilder b = new StringBuilder();
    //     b.append('[');
    //     for(int i=0 ; ;i++){
    //         b.append(a[i]);
    //         if(i == iMax)
    //         return b.append(']').toString();
    //         b.append(", ");
    //     }        
    // }



    // array of objects
    String[] str = new String[4];
    for(int i =0; i<str.length ;  i++){
        str[i] = input.next();
    }
    System.out.prinln(Arrays.toString(str));
    
}
