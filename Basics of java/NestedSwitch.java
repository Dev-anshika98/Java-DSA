import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();

        String department = in.next();

        switch (EmpID) {
           case 1-> System.out.println("Anshika");
           case 2-> System.out.println("heralala");
           case 3->{
           System.out.println("Empoyee 3");
           switch (department) {
            case "IT"->System.out.println("IT departement");
            case "Management"->System.out.println("MCA");
            default->System.out.println("invalid");

           }
           
        }


    }
    
    }
}

