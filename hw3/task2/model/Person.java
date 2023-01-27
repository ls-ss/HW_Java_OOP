package hw3.task2.model;

import hw3.task2.model.enums.Gender;
import hw3.task2.service.AnimalService;
import hw3.task2.service.PersonService;

/**
 * The class describes the representation of the Person
 */
public class Person implements PersonService {

    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void fillBowl(Bowl bowl) {
        if (bowl.isEmpty()) {
            bowl.setEmpty(false);
            System.out.println("Напоните миску.");
        } else {
            System.out.println("Миска полная.");
        }
    }

    public void callAnimal(AnimalService animal) {
        animal.walkUp();
    }

    @Override
    public String toString() {
        return  "Персона{" +
                "имя='" + name + '\'' +
                ", пол=" + gender +
                '}';
    }
}
