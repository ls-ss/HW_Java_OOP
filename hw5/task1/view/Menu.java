package hw5.task1.view;

import java.util.Scanner;

/**
 * Класс содержит методы для вывода на консоль
 */
public class Menu {
    public String showMenu() {
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("+ -> Сумма");
            System.out.println("- -> Разность");
            System.out.println("* -> Умножение");
            System.out.println("/ -> Деление");
            System.out.println("0 -> Выход");
            String action = getValue();
            if ("0+-*/".contains(action) && action.length()==1) {
                return action;
            }
        }
    }

    public String getValue() {
        System.out.print("Операция: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Number[] getValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        String input1 = scanner.next();
        System.out.print("Второе число: ");
        String input2 = scanner.next();
        Number num1 = null;
        Number num2 = null;
        try {
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);
            } catch (NumberFormatException ex) {
                System.out.println("Ошибка ввода. Попробуйте ещё раз.");
            }
        }
        return new Number[]{num1, num2};
    }

    public void showMessage(String message, String example) {
        System.out.println(message + ": " + example);
    }
}
