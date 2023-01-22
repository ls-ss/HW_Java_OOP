package hw2.task2;

import hw2.task2.model.*;
import hw2.task2.model.enums.Color;
import hw2.task2.model.enums.Gender;
import hw2.task2.interfaces.AnimalInterface;
import hw2.task2.interfaces.PersonInterface;

/**
 * Обеспечить переход от использования явных классов в сторону использования абстрактных типов.
 */
public class MainPersonThing {
    public static void main(String[] args) {
        Person person = new Person("Таня", Gender.Девочка);
        Animal cat = new Cat("Кеша", Color.Черный, Gender.Мальчик, 2);
        Animal dog = new Dog("Тузик", Color.Рыжий, Gender.Мальчик, 4);

        Bowl dogsBowl = new Bowl(Color.Серый);
        Bowl catsBowl = new Bowl(Color.Белый);

        cat.setBowl(catsBowl);
        dog.setBowl(dogsBowl);

        dog.printInfo();
        cat.printInfo();
        System.out.println();

        person.callAnimal(cat);
        person.callAnimal(dog);
        System.out.println();

        cat.eat(catsBowl);
        dog.eat(dogsBowl);
        System.out.println();

        cat.eat(dogsBowl);
        dog.eat(catsBowl);
        System.out.println();

        person.fillBowl(catsBowl);
        person.fillBowl(catsBowl);
        person.fillBowl(dogsBowl);
        System.out.println();

        person.callAnimal(cat);
        person.callAnimal(dog);
        System.out.println();

        cat.eat(catsBowl);
        dog.eat(dogsBowl);
        System.out.println();

        person.callAnimal(cat);
        person.callAnimal(dog);
    }
}