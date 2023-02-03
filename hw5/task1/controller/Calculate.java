package hw5.task1.controller;

import hw5.task1.config.LoggerConfig;
import hw5.task1.model.RationalExample;
import hw5.task1.service.Solve;
import hw5.task1.service.SolveImpl;
import hw5.task1.view.Menu;
import java.io.IOException;

/**
 * Вид и модель связи класса
 */
public class Calculate {
    public Solve solve = new SolveImpl();

    public void start() {
        Menu menu = new Menu();
        try {
            LoggerConfig.config();
        } catch (IOException e) {
            menu.showMessage("Ошибка", "Проблема с логированием");
        }

        String action;
        do {
            action = menu.showMenu();
            if (action.equals("0")) {
                return;
            }
            RationalExample example = new RationalExample(solve.checkOperation(action));
            Number[] values = menu.getValues();
            example.setVariableA(values[0]);
            example.setVariableB(values[1]);
            try {
                menu.showMessage("Результат", solve.solve(example));
            } catch (NullPointerException e) {
                menu.showMessage("Ошибка", "Неверные данные. Введите значения еще раз");
            }
        } while (true);
    }
}
