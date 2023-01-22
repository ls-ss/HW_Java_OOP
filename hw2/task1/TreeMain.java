package hw2.task1;

import hw2.task1.model.Family;
import hw2.task1.model.Female;
import hw2.task1.model.Male;
import hw2.task1.model.Person;
import hw2.task1.model.enums.Auto;
import hw2.task1.model.enums.Flavour;
import hw2.task1.interfaces.PersonService;
import hw2.task1.interfaces.TreeService;
import hw2.task1.model.Tree;

import java.util.List;

/**
 * Обеспечить переход от использования явных классов в сторону использования абстрактных типов.
 */
public class TreeMain {
    public static void main(String[] args) {
        Family family = new Family();
        TreeService treeService = new Tree();

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

        tolya.setParents(List.of(((Person) vanya), ((Person) alla)));
        alik.setParents(List.of(((Person) tolya), ((Person) ira)));
        vanya.setParents(List.of(((Person) lora), ((Person) mike)));
        ira.setParents(List.of(((Person) jili), ((Person) ket)));
        mike.setParents(List.of(((Person) roma), ((Person) vova)));

        tolya.addChildren((Person) alik);
        alik.addChildren((Person) alik);

        lora.addSiblings((Person) martha);
        tolya.addSiblings((Person) kolya);

        family.setName("Алова");
        family.setFather((Person) vanya);
        family.setMother((Person) alla);
        family.setChildren(List.of(((Person) tolya), ((Person) masha)));

        System.out.println("\nРанг:");
        treeService.printFamilyTree((Person) alik, 0);

        System.out.println("\nДети:");
        treeService.printChildren((Person) tolya);

        System.out.println("\nИнфо:");
        alik.printInfo();
        vova.printInfo();
    }
}
