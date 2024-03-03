import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);

        //typecasting
        int num1 = (int)(67.43f);
        System.out.println(num1);


        //automatic type promotion in expression

        int a = 257;
        byte b = (byte)(a); //257%256 ==1
        System.out.println(b);

        byte e = 40;
        byte f = 50;
        byte c = 100;
        int  d = (e*f)/c;
        System.out.println(d);
        
        int num = 'Z'; 
        System.out.println(num); //sky value of Z
        //Java is a unicode language --- it can be print any of the language

        // float*int = float
        // int*int=int

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i =50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c)-(d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        //flaot + int -double = double
        System.out.println(result);



    }
    
}
