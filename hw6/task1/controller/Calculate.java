package hw6.task1.controller;

import hw6.task1.config.LoggerConfig;
import hw6.task1.model.RationalExample;
import hw6.task1.service.Solve;
import hw6.task1.service.impl.SolveImpl;
import hw6.task1.view.MenuGet;
import hw6.task1.view.impl.MenuGetImpl;
import hw6.task1.view.MenuShow;
import hw6.task1.view.impl.MenuShowImpl;

import java.io.IOException;

/**
 * Class linking model and view
 */
public class Calculate {
    public Solve solve = new SolveImpl();

    public void start() {
        MenuGet menuGet = new MenuGetImpl();
        MenuShow menuShow = new MenuShowImpl();
        try {
            LoggerConfig.config();
        } catch (IOException e) {
            menuShow.showMessage("Ошибка", "Проблема с логированием");
        }

        String action;
        do {
            action = menuShow.showMenu(menuGet);
            if (action.equals("0")) {
                return;
            }
            RationalExample example = new RationalExample(solve.checkOperation(action));
            Number[] values = menuGet.getValuesForExpression();
            example.setVariableA(values[0]);
            example.setVariableB(values[1]);
            try {
                menuShow.showMessage("Результат", solve.solve(example));
            } catch (NullPointerException e) {
                menuShow.showMessage("Ошибка", "Неверные данные. Введите значения еще раз");
            }
        } while (true);
    }
}
