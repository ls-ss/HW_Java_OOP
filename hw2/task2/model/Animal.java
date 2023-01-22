package hw2.task2.model;

import hw2.task2.interfaces.AnimalInterface;
import hw2.task2.model.enums.Color;
import hw2.task2.model.enums.Gender;

/**
 * The abstract class describes the representation of Animal
 */
public abstract class Animal implements AnimalInterface {
    protected String name;
    protected Color color;
    protected Bowl bowl;

    protected Gender gender;

    public Animal(String name, Color color, Gender gender) {
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public void setBowl(Bowl bowl) {
        this.bowl = bowl;
    }
}
