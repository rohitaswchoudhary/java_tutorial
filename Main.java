// 2023-04-12
// program to print sum of positive integers using do while loop
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        int i = 0;
      do {
        sum +=i; 
        Scanner myObj = new Scanner(System.in);
        
      
        System.out.println("Enter the numbers : ");
        i = myObj.nextInt();

      }
      while (i>= 0);  
      System.out.println("Sum: "+sum);
    }
  }