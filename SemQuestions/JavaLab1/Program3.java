import java.util.Scanner; 
 
public class Program3 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter coefficient"); 
        System.out.print("a: "); 
        double a = scanner.nextDouble(); 
        System.out.print("b: "); 
        double b = scanner.nextDouble(); 
        System.out.print("c: "); 
        double c = scanner.nextDouble(); 
 
        double discriminant = b * b - 4 * a * c; 
 
        if (discriminant > 0) { 
 
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); 
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); 
            System.out.println("Two distinct real roots:"); 
            System.out.println("Root 1 = " + root1); 
            System.out.println("Root 2 = " + root2); 
        } else if (discriminant == 0) { 
 
            double root = -b / (2 * a); 
            System.out.println("One repeated real root:"); 
            System.out.println("Root = " + root); 
        } else { 
 
            double realPart = -b / (2 * a); 
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a); 
            System.out.println("Two complex (imaginary) roots:"); 
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart 
+ "i"); 
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart 
+ "i"); 
        } 
 
    }
}