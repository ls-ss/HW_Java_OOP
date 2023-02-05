package hw6.task1.service.impl;

import hw6.task1.controller.Calculate;
import hw6.task1.model.enums.OperationType;
import hw6.task1.model.RationalExample;
import hw6.task1.service.Operation;
import hw6.task1.service.Solve;
import java.util.logging.Logger;

/**
 * Интерфейс Solve для рациональных чисел
 */
public class SolveImpl implements Solve {

    Logger logger = Logger.getLogger(Calculate.class.getName());
    public Operation<Number> operation = (Operation<Number>) new RationalOperationImpl();

    /**
     * Метод возвращает результат операции и записывает логи
     *
     * @param example contains two values and symbol of operation
     * @return result of operation
     */
    @Override
    public String solve(RationalExample example) {
        if (example.getOperation().equals(OperationType.DIFFERENCE)) {
            String difference = operation.difference(example).toString();
            logger.info("Разность: " + example + " Ответ: " + difference);
            return difference;
        }
        if (example.getOperation().equals(OperationType.SUMMARIZE)) {
            String sum = operation.sum(example).toString();
            logger.info("Сумма: " + example + " Ответ: " + sum);
            return sum;
        }
        if (example.getOperation().equals(OperationType.MULTIPLY)) {
            String multiply = operation.multiply(example).toString();
            logger.info("Умножение: " + example + " Ответ: " + multiply);
            return multiply;
        }
        if (example.getOperation().equals(OperationType.DIVIDE)) {
            String divide = operation.divide(example).toString();
            logger.info("Деление: " + example + " Ответ: " + divide);
            return divide;
        }
        logger.warning("Не удалось вычислить значение!");
        return "Не удалось вычислить значение!";
    }

    /**
     * Method returns symbol for operation
     *
     * @param operation symbol of operation as String
     * @return enum equivalent operation
     */
    @Override
    public OperationType checkOperation(String operation) {
        if (operation.equals("+")) {
            return OperationType.SUMMARIZE;
        } else if (operation.equals("-")) {
            return OperationType.DIFFERENCE;
        } else if (operation.equals("*")) {
            return OperationType.MULTIPLY;
        } else if (operation.equals("/")) {
            return OperationType.DIVIDE;
        } else {
            return OperationType.SUMMARIZE;
        }
    }
}
