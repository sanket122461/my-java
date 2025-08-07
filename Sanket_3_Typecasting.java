import java.util.Scanner;
public class Sanket_3_Typecasting {
    public static void main(String[] args) {
        double num1 = 5.5;
        int num2 = 2;

        // Implicit type casting (widening)
        double result1 = num1 + num2;
        System.out.println("Result of implicit type casting: " + result1);

        // Explicit type casting (narrowing)
        int result2 = (int) num1 + num2;
        System.out.println("Result of explicit type casting: " + result2);

        // Type casting with user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        double userInput = scanner.nextDouble();
        
        int castedValue = (int) userInput;
        System.out.println("Casted value from double to int: " + castedValue);
        
        scanner.close();
        
    }
}
