import java.util.Scanner; 
 
public class Fibonacci { 
 
       static void Fibo(int n) { 
        int num1 = 0, num2 = 1; 
        System.out.println("Fibonacci Series up to " + n + " terms:"); 
        for (int i = 1; i <= n; ++i) { 
            System.out.print(num1 + " "); 
            int sum = num1 + num2; 
            num1 = num2; 
            num2 = sum; 
        } 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the limit "); 
        int n = scanner.nextInt(); 
 
        Fibo(n); 
    }
}