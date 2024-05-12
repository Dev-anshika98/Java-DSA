import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxAttempts = 3;
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        boolean loggedIn = false;
        
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loggedIn = true;
                break;
            } else {
                System.out.println("Incorrect username or password. Attempts left: " + (maxAttempts - attempt));
            }
        }
        
        if (loggedIn) {
            System.out.println("Welcome, " + correctUsername + "!");
        } else {
            System.out.println("Maximum login attempts reached. Program will terminate.");
        }
        
        scanner.close();
    }
}