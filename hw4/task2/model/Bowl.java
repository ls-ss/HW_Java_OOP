package hw4.task2.model;

import hw4.task2.model.enums.Color;

/**
 * The class describes the representation of the Bowl
 */
public class Bowl {
    private final Color color;
    private boolean isEmpty;

    public Bowl(Color color) {
        this.color = color;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Миска{" +
                "цвет=" + color +
                ", миска пустая=" + isEmpty +
                '}';
    }
}
