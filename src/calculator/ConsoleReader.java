package calculator;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private final Scanner scanner = new Scanner(System.in);
    public String readString() {
        return scanner.next();
    }

    @Override
    public ResponseType readResponseType() {
        String next = scanner.next();
        String s = next.toUpperCase();
        return ResponseType.valueOf(s);
    }

    @Override
    public OperationType readOperationType() {
        String next = scanner.next();
        String s = next.toUpperCase();
        return OperationType.valueOf(s);
    }

    public double readDouble() {
        return scanner.nextDouble();
    }
}
