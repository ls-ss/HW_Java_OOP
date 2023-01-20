package hw1.task2.model;

import hw1.task2.model.enums.Color;
import hw1.task2.model.enums.Gender;

public class Dog extends Animal {
    private int speed;

    public Dog(String name, Color color, Gender gender, int speed) {
        super(name, color, gender);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Собака{" +
                "скорость=" + speed +
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
                System.out.println(this.name + "  не ест. Миска пустая.");
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
            System.out.println(this.name + ", он не здесь. Это собака.");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Собака:\n" + this.name + " " + this.color + " " + this.gender + " " + this.speed + " " + this.bowl);
    }
}
