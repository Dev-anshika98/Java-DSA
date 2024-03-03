import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {

        //Print number from 1 to 5
        for(int num=1; num<=5; num++){
        System.out.println(num);

    }
    

    //Print number from 1 t n
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i = 1; i<=n; i++){
        System.out.println(i);
    }

    //While loops
    int num=1;
    while(num!=9){
        System.out.println(num);
        num++;
    }



    }
}
