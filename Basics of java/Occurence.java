import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n= 45676636;
        int c=0;
        while (n>0) {
            int rem = n%10;
            if(rem == 6){
                c++;
            }
            n=n/10;
            
        }
        System.out.println(c);

    }
    
}
