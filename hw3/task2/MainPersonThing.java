package hw3.task2;

import hw3.task2.model.*;
import hw3.task2.model.Person;
import hw3.task2.model.enums.Color;
import hw3.task2.model.enums.Gender;
import hw3.task2.model.enums.Size;
import hw3.task2.service.PersonService;
import java.util.List;
/**
 * Проделать код ревью своих работ. Некоторые стандартные интерфейсы
 */
public class MainPersonThing {
    public static void main(String[] args) {
        PersonService person = new Person("Таня", Gender.Девочка);
        Animal cat = new Cat("Кеша", Color.Черный, Size.SMAll, Gender.Мальчик, 2);//iz-za togo chto ispolzuesh russkiy yazyk
        Animal dog = new Dog("Тузик", Color.Рыжий, Size.SMAll,Gender.Мальчик, 4);

        Bowl dogsBowl = new Bowl(Color.Серый);
        Bowl catsBowl = new Bowl(Color.Белый);

        cat.setBowl(catsBowl);
        dog.setBowl(dogsBowl);

        List<Animal> animals = List.of(dog, cat);
        for (Animal animal : animals) {
            animal.printInfo();
        }
        System.out.println();

        for (Animal animal : animals) {
            person.callAnimal(animal);
        }
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

        for (Animal animal : animals) {
            person.callAnimal(animal);
        }
        System.out.println();

        cat.eat(catsBowl);
        dog.eat(dogsBowl);
        System.out.println();

        for (Animal animal : animals) {
            person.callAnimal(animal);
        }
        System.out.println();

        Animal cloneAnimal = cat.clone();
        System.out.println("Собака и кошка равны: "+dog.equals(cat));
        System.out.println("Сравнить кошку и клон кошки: "+cloneAnimal.compareTo(cat));
        System.out.println("Соответствует коту и клону кошки: "+cloneAnimal.equals(cat));
    }

}