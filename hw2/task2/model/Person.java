package hw2.task2.model;

import hw2.task2.model.enums.Gender;
import hw2.task2.interfaces.AnimalInterface;
import hw2.task2.interfaces.PersonInterface;

/**
 * The class describes the representation of the Person
 */
public class Person implements PersonInterface {

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

    public void callAnimal(AnimalInterface animal) {
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
