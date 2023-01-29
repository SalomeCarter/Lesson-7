package calculator;

public interface Reader {
    ResponseType readResponseType();
    OperationType readOperationType() throws OperationNotFoundException;
    OperationNotFoundException readOperationNotFoundException();
    double readDouble();
}
