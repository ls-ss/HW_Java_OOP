package hw3.task2.model;

import hw3.task2.model.enums.Color;
import hw3.task2.model.enums.Gender;
import hw3.task2.model.enums.Size;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The class describes the representation of the Cat
 */
public class Cat extends Animal {
    private final Integer jumpHeight;

    public Cat(String name, Color color, Size size, Gender gender, Integer jumpHeight) {
        super(name, color, size, gender);
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String toString() {
        AtomicReference<StringBuilder> sb = new AtomicReference<>(new StringBuilder());
        sb.get().append("Кот{\n")
                .append(" скорость=").append(jumpHeight)
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
        System.out.println("Кошка:\n" + name + " " + color + " " + gender + " " + size.name() + " " + jumpHeight + " " + bowl);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;

        return Objects.equals(jumpHeight, cat.jumpHeight);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (jumpHeight!=null ? jumpHeight.hashCode():0);
        return result;
    }
}
