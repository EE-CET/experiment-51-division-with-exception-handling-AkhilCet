import java.util.Scanner;

public class DivisionHandling {
    
    public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();

      try {
         int c = a / b;
         System.out.println(c);
      } 
      catch (ArithmeticException e) {
         System.out.println("Divide by zero error");
      }

      input.close();
   }
        
}
