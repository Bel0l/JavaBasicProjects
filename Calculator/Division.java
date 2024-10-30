public class Division implements Operations {
    
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return num1 / num2;

    }
    @Override
    public double calculate(double num1) {
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}
