public class Calculator {
    public double executeOperation(Operations operation, double num1, double num2) {
        return operation.calculate(num1, num2);
    }
    public double executeOperation(Operations operation, double num1){
        return operation.calculate(num1);
    }
}

