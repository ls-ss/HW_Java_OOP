package hw4.task2.model;

import hw4.task2.model.enums.Color;
import hw4.task2.model.enums.Gender;
import hw4.task2.model.enums.Size;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The class describes the representation of the Dog
 */
public class Dog extends Animal {
    private final Integer speed;

    public Dog(String name, Color color, Size size, Gender gender, Integer speed) {
        super(name, color, size, gender);
        this.speed = speed;
    }

    @Override
    public String toString() {
        AtomicReference<StringBuilder> sb = new AtomicReference<>(new StringBuilder());
        sb.get().append("Собака{\n")
                .append(" скорость=").append(speed)
                .append(",\n имя='").append(name).append('\'')
                .append(",\n цвет=").append(color)
                .append(",\n миска=").append(bowl)
                .append(",\n пол=").append(gender)
                .append(",\n размер=").append(size)
                .append("\n}");
        return sb.toString();
    }

    @Override
    public void eat(Bowl bowl) {
        if (this.bowl.equals(bowl)) {
            if (bowl.isEmpty()) {
                System.out.println(name + " не могу есть. Миска пуста");
            } else {
                System.out.println(name + " поел");
                bowl.setEmpty(true);
            }
        } else {
            System.out.println("Проблемы с миской");
        }
    }

    @Override
    public void walkUp() {
        if (!bowl.isEmpty()) {
            System.out.println(name + " он не здесь. Он возле чаши");
        } else {
            System.out.println(name + " он не здесь. Это кошка");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Собака:\n" + name + " " + color + " " + gender + " " + size.name() + " " + speed + " " + bowl);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;

        return Objects.equals(speed, dog.speed);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (speed!=null ? speed.hashCode():0);
        return result;
    }
}
