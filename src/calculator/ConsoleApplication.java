package calculator;

public class ConsoleApplication implements Application {
    private final OperationStorage storage = new InMemoryOperationStorage();
    private final Calculator calculator = new Calculator();
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();

    public void run() {
        boolean continuation = true;
        while (continuation) {
            writer.write("Enter number 1");
            double num1 = reader.readDouble();
            writer.write("Enter number 2");
            double num2 = reader.readDouble();

            writer.write("Enter operation type. Sum, sub, mul or div?");

            Operation op;

            try {
                OperationType type = reader.readOperationType();
                op = new Operation(num1, num1, type);
            } catch (OperationNotFoundException e) {
                writer.write("Operation not found!");
                continue;
            }

            Operation result = calculator.calculate(op);
            storage.save(result);
            writer.write("Result = " + result.getResult());
            writer.write("");

            writer.write("Would you like to continue? yes OR no?");
            ResponseType response = reader.readResponseType();
            switch (response) {
                case YES: {
                    Operation[] all = storage.findAll();
                    for (Operation operation : all) {
                        if(operation != null)
                        writer.write("Result = " + operation.getResult());
                    }
                    writer.write("Ok, let`s continue");
                    break;
                }
                case NO: {
                    writer.write(" ");
                    continuation = false;
                    break;
                }
                default: {
                    continuation = false;
                }
            }
        }
        try {
            OperationType operationType = reader.readOperationType();
        } catch (OperationNotFoundException e) {
            writer.write("Operation not found!");
        }
    }
}





