package calculator;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private final Scanner scanner = new Scanner(System.in);
    public String readString() {
        return scanner.next();
    }

    @Override
    public ResponseType readResponseType() {
        return null;
    }

    @Override
    public OperationType readOperationType() {
        return null;
    }

    public double readDouble() {
        return scanner.nextDouble();
    }
}
