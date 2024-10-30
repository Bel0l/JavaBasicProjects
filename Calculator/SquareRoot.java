public class SquareRoot implements Operations {
    
    public double calculate ( double num1){
        return Math.sqrt(num1) ;
    }

    @Override
    public double calculate(double num1, double num2) {
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}
