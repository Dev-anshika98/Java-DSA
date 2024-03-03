import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        System.out.println("enter the operator");
        while(true){
         
            char op = in.next().trim().charAt(0);
         
            if(op =='+' || op == '-'|| op == '*' || op == '%'|| op == '/'){
                //input nums
                System.out.println("enter the nums");
                int a = in.nextInt();
                int b = in.nextInt();
          
                if(op=='+'){
                    ans= a+b; 
                }
                if(op=='-'){
                    ans= a-b; 
                }

                if(op=='*'){
                    ans= a*b; 
                }

                if(op=='%'){
                    ans= a%b; 
                }

                if(op=='/'){
                    ans= a/b; 
                }


            }
            else if(op=='x'|| op=='X'){
                break;
            }
            else{
                System.out.println("Invalid");

            }
            System.out.println(ans);

            }
           
        }
    }
    

