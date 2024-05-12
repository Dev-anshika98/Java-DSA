package Array;

import java.util.Scanner;

public class arrayCC {
    public static void update(int marks[]) {
        for(int i =0; i<marks.length; i++){
            marks[i] =marks[i] + 1;
        }

        
    }
    public static void main(String[] args) {
     int marks[] = {97,99,99};
     update(marks);
     
     for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);

     }
     System.out.println();














     
    //  Scanner sc = new Scanner(System.in);

    //  marks[0]= sc.nextInt();
    //  marks[1]= sc.nextInt();
    //  marks[2]= sc.nextInt();
    //  marks[3]= sc.nextInt();

    //  System.out.println(marks[0]);
    //  System.out.println(marks[1]);
    //  System.out.println(marks[2]);


    //  marks[3] =100;
    //  System.out.println(marks[3]);
    //  int per = (marks[0] + marks[1] +marks[2])/3;

    //  System.out.println("percentage "  + per + "%");


        
        
    }
    
}
