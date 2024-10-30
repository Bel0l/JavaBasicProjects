import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /,@");
        String operation = scanner.next();

        Operations op;
        
        switch (operation) {
            case "+":
                op = new Addition();
                break;
            case "-":
                op = new Subtraction();
                break;
            case "*":
                op = new Multiplication();
                break;
            case "/":
                op = new Division();
                break;
            case "@":
                op = new SquareRoot();
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        double result = calculator.executeOperation(op, num1, num2);
        System.out.println("Result: " + result);
    }
}

