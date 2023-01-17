package calculator;

public class ConsoleApplication implements Application {
    private OperationStorage storage = new InMemoryOperationStorage();
    private Calculator calculator = new Calculator();
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();

    public void run() {
        boolean continuation = true;
        while (continuation) {
            writer.write("Enter number 1");
            double num1 = reader.readDouble();
            writer.write("Enter number 2");
            double num2 = reader.readDouble();
            writer.write("Enter operation type. Sum, sub, mul or div?");
            String type = reader.readString();
            Operation op = new Operation(num1, num2, type);
            Operation result = calculator.calculate(op);
            storage.save(result);
            writer.write("Result = " + result.getResult());

            writer.write("");

            writer.write("Would you like to continue? yes OR no?");
            String response = reader.readString();
            switch (response) {
                case "yes": {
                    Operation[] all = storage.findAll();
                    for (Operation operation : all) {
                        if(operation != null)
                        writer.write("Result = " + operation.getResult());
                    }
                    writer.write("Ok, let`s continue");
                    break;
                }
                case "no": {
                    writer.write(" ");
                    continuation = false;
                    break;
                }
                default: {
                    continuation = false;
                }
            }
        }
    }
}





