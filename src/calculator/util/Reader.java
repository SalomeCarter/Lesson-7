package calculator.util;

import calculator.OperationNotFoundException;
import calculator.OperationType;
import calculator.ResponseType;

public interface Reader {
    ResponseType readResponseType();
    OperationType readOperationType() throws OperationNotFoundException;
    double readDouble();
}
