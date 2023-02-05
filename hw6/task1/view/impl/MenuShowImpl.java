package hw6.task1.view.impl;

import hw6.task1.view.MenuGet;
import hw6.task1.view.MenuShow;

/**
 * The class contains show-methods for displaying to the console
 */
public class MenuShowImpl implements MenuShow {

    /**
     * Method shows message to the console
     *
     * @param message String value of message
     * @param example additional information for output
     */
    @Override
    public void showMessage(String message, String example) {
        System.out.println(message + ": " + example);
    }

    /**
     * Method shows main menu
     *
     * @param menuGet interface for getting value
     * @return number of action
     */
    @Override
    public String showMenu(MenuGet menuGet) {
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("+ -> Сумма");
            System.out.println("- -> Разность");
            System.out.println("* -> Умножение");
            System.out.println("/ -> Деление");
            System.out.println("0 -> Выход");
            String action = menuGet.getInputValue();
            if ("0+-*/".contains(action) && action.length()==1) {
                return action;
            }
        }
    }
}
