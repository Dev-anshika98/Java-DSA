import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String Fruit = in.next();

        switch (Fruit) {
            case "Mango":
            System.out.println("king of fruit");          
                break;
            
            case "Apple":
            System.out.println("red fruit");          
                break;
            case "Orange":
            System.out.println("Round fruit");          
                break;
        
            default:
            System.out.println("Invalid");
                break;
        }


        switch (Fruit) {
            case "Mango"-> System.out.println("king of fruit");         
            case "Apple"->System.out.println("red fruit");    
            case "Orange"-> System.out.println("Round fruit");  
            default->System.out.println("Invalid");
        }


       int day = in.nextInt();

       switch (day) {
        case 1->System.out.println("Monday");
        case 2->System.out.println("Tuesday");
        case 3->System.out.println("Wednesday");
        case 4->System.out.println("Thursday");
        case 5->System.out.println("Friday");
        case 6->System.out.println("Saturday");
        case 7->System.out.println("Sunday");

        default->System.out.println("invalid day");
            
       }

    switch (day) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        System.out.println("weekday");
            break;
        case 6:
        case 7:
        System.out.println("Weekend");
        break;
    }

    switch (day) {
        case 1, 2, 3, 4,5->System.out.println("weekday");
        case 6, 7->System.out.println("Weekend");
        
    }


    }
    
}
