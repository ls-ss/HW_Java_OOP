package hw4.task2;

import hw4.task2.model.*;
import hw4.task2.model.enums.Color;
import hw4.task2.model.enums.Gender;
import hw4.task2.model.enums.Size;
import hw4.task2.model.material.Metal;
import hw4.task2.model.material.Wood;
import hw4.task2.service.PersonService;

import java.util.List;

/**
 * Использовать обобщенные типы.
 */
public class MainPersonThing {
    /**
     * Execution script
     *
     * @param args args
     */
    public static void main(String[] args) {

        PersonService person = new Person("Микки", Gender.Девочка);
        Animal cat = new Cat("Кеша", Color.Черный, Size.МАЛЫЙ, Gender.Мальчик, 2);
        Animal dog = new Dog("Тузик", Color.Белый, Size.СРЕДНИЙ, Gender.Мальчик, 4);

        Bowl dogsBowl = new Bowl(Color.Серый);
        Bowl catsBowl = new Bowl(Color.Черный);

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
        System.out.println();

        AnimalHouse<Metal, Double> animalHouse = new AnimalHouse<>(new Metal(), 3.3);
        AnimalHouse<Wood, Integer> animalHouse1 = new AnimalHouse<>(new Wood(), 4);
        animalHouse.printHouse();
        System.out.println();
        animalHouse1.printHouse();
        System.out.println();
        animalHouse1.getMaterial().setColor(Color.Черный);
        animalHouse1.printHouse();
    }
}