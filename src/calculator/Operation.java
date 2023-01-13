package calculator;

public class Operation {
    double num1;
    double num2;
    String type;
    double result;
    String continuation;


    public Operation(double num1, double num2, String type, String continuation) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.continuation = continuation;
    }
}
