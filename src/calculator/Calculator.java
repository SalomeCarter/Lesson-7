package calculator;

public class Calculator {
    Operation calculate(Operation operation) {
        switch (operation.type) {
            case "sum":
                operation.result = operation.num1 + operation.num2;
                return operation;
            case "sub":
                operation.result = operation.num1 - operation.num2;
                return operation;
            case "mul":
                operation.result = operation.num1 * operation.num2;
                return operation;
            case "div":
                operation.result = operation.num1 / operation.num2;
                return operation;
        }
        return operation;
        }
    }

