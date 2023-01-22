package hw2.task2.model;

import hw2.task2.model.enums.Color;
import hw2.task2.model.enums.Gender;
import hw2.task2.interfaces.AnimalInterface;

/**
 * The class describes the representation of the Cat
 */
public class Cat extends Animal implements AnimalInterface {
    private final int jumpHeight;

    public Cat(String name, Color color, Gender gender, int jumpHeight) {
        super(name, color, gender);
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String toString() {
        return "Кот{" +
                "высота=" + jumpHeight +
                ", имя='" + name + '\'' +
                ", цвет=" + color +
                ", миска=" + bowl +
                ", пол=" + gender +
                '}';
    }

    @Override
    public void eat(Bowl bowl) {
        if (this.bowl.equals(bowl)) {
            if (bowl.isEmpty()) {
                System.out.println(this.name + " не ест. Миска пустая.");
            } else {
                System.out.println(this.name + " поел.");
                bowl.setEmpty(true);
            }
        } else {
            System.out.println("Проблема с миской.");
        }
    }

    @Override
    public void walkUp() {
        if (!this.bowl.isEmpty()) {
            System.out.println(this.name + ", он не здесь. Он возле миски.");
        } else {
            System.out.println(this.name + ", он не здесь. Это кот.");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Кот:\n" + this.name + " " + this.color + " " + this.gender + " " + this.jumpHeight + " " + this.bowl);
    }
}
