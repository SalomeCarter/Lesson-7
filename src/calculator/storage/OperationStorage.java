package calculator.storage;

import calculator.entity.Operation;

public interface OperationStorage {
    void save(Operation operation);
    Operation[] findAll();
}
