package calculator;

public interface Reader {
    ResponseType readResponseType();
    OperationType readOperationType();
    double readDouble();
}
