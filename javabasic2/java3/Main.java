// 2023-04-06 10:19:08
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
      
        System.out.println("Enter the week day: ");
        int day = myObj.nextInt();
        switch (day){
            case 1:
            System.out.println("The day is monday");
            break;
            case 2:
            System.out.println("The day is tuesday");
            break;
            case 3:
            System.out.println("The day is Wednesday");
            break;
            case 4:
            System.out.println("The day is Thursday");
            break;
            case 5:
            System.out.println("The day is Friday");
            break;
            case 6:
            System.out.println("The day is saturday");
            break;
            case 7:
            System.out.println("The day is sunday");
            break;
        }
        

      
    }
  }
