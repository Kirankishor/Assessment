package assessment;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
 
interface Operation {
    double operate(double number1, double number2);
}
 
public class ArthimaticOperationsExample {
	
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<Operation> operations = Arrays.asList(
                (a, b) -> a + b,
                (a, b) -> a - b,
                (a, b) -> a * b,
                (a, b) -> (b != 0) ? a / b : Double.NaN
        );
 
        System.out.println("enter first number");
        double number1 = sc.nextDouble();
        
        System.out.println("enter second number");
        double number2 = sc.nextDouble();
 
        operations.forEach(operation ->
                System.out.println("Result: " + operation.operate(number1, number2)));
    }
}
