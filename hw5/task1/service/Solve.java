package hw5.task1.service;

import hw5.task1.model.enums.OperationType;
import hw5.task1.model.RationalExample;

/**
 * Interface for actions with expressions
 */
public interface Solve {

    String solve(RationalExample example);

    OperationType checkOperation(String operation);
}
