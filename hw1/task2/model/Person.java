package hw1.task2.model;

import hw1.task2.model.enums.Gender;

public class Person {

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

    public void callAnimal(Animal animal) {
        animal.walkUp();
    }

    @Override
    public String toString() {
        return "Персона{" +
                "имя='" + name + '\'' +
                ", пол=" + gender +
                '}';
    }
}
