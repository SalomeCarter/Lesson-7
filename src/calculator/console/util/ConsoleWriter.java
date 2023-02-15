package calculator.console.util;

import calculator.util.Writer;

public class ConsoleWriter implements Writer {

    public void write(String message) {
        System.out.println(message);
    }
}
