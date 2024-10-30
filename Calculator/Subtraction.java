public class Subtraction implements Operations {
    public double calculate (double num1, double num2){
        return num1 - num2 ;
    }
    @Override
    public double calculate(double num1) {
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}
