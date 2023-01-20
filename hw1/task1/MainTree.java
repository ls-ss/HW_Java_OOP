package hw1.task1;

import hw1.task1.model.*;
import hw1.task1.model.enums.Auto;
import hw1.task1.model.enums.Flavour;

import java.util.List;

/**
  Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
  Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей и
  отношений между людьми: родитель, ребёнок.
 */

public class MainTree {
    public static void main(String[] args) {
        Family family = new Family();
        Person alla = new Female("Алла", "Алова", "12/10/2020", family, 5, Flavour.Ромашка);
        Person tolya = new Male("Толя", "Толин", "12/12/2020", family, 3, Auto.Лада);
        Person vanya = new Male("Ваня", "Алов", "12/12/2020", family, 4, Auto.Газель);
        Person mike = new Male("Миша", "Мишин", "12/12/2020", family, 7, Auto.Москвич);
        Person jili = new Male("Юля", "Мишина", "12/12/2020", family, 8, Auto.Лада);
        Person ket = new Female("Катя", "Катина", "12/12/2020", family, 8, Flavour.Одуванчик);
        Person ira = new Female("Ирина", "Толина", "12/10/2020", family, 6, Flavour.Ландыш);
        Person alik = new Male("Алик", "Ликов", "12/12/2020", family, 4, Auto.Лада);
        Person lora = new Female("Лора", "Ликова", "12/12/2020", family, 9, Flavour.Ромашка);
        Person masha = new Female("Маша", "Машова", "12/12/2020", family, 7, Flavour.Одуванчик);
        Person martha = new Female("Марта", "Машова", "12/12/2020", family, 7, Flavour.Одуванчик);
        Person vova = new Female("Вова", "Вовин", "12/12/2020", family, 8, Flavour.Одуванчик);
        Person kolya = new Male("Коля", "Вовин", "12/12/2020", family, 9, Auto.Москвич);
        Person roma = new Male("Рома", "Ромов", "12/12/2020", family, 5,Auto.Газель);

        tolya.setParents(List.of(vanya, alla));
        alik.setParents(List.of(tolya, ira));
        vanya.setParents(List.of(lora , mike));
        ira.setParents(List.of(jili, ket));
        mike.setParents(List.of(roma, vova));

        tolya.addChildren(alik);
        alik.addChildren(alik);

        lora .addSiblings(martha);
        tolya.addSiblings(kolya);

        family.setName("Алова");
        family.setFather(vanya);
        family.setMother(alla);
        family.setChildren(List.of(tolya, masha));

        System.out.println("\nРанг:");
        Person.printFamilyTree(alik, 0);

        System.out.println("\nДети:");
        tolya.printChildren();

        System.out.println("\nИнфо:");
        alik.printInfo();
        vova.printInfo();
    }
}