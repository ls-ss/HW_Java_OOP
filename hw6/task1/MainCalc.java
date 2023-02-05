package hw6.task1;

import hw6.task1.controller.Calculate;

/**
 * Рефакторинг и оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а
 */
public class MainCalc {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.start();
    }
}
