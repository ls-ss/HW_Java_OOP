package hw5.task1.service;

import hw5.task1.controller.Calculate;
import hw5.task1.model.enums.OperationType;
import hw5.task1.model.RationalExample;
import java.util.logging.Logger;

/**
 * Реализация интерфейса Solve для рациональных чисел
 */
public class SolveImpl implements Solve {

    Logger logger = Logger.getLogger(Calculate.class.getName());
    public Operation<Number> operation = new RationalOperationImpl();

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
            logger.info("Деление" + example + " Ответ: " + divide);
            return divide;
        }
        logger.warning("Не удалось вычислить значение!");
        return "Не удалось вычислить значение";
    }

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
