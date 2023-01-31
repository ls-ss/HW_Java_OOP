package hw4.task2.model.material;

import hw4.task2.model.enums.Color;

/**
 * Class Metal implements interface Material. Used in generics
 */
public class Metal implements Material {
    String name;
    Color color;

    public Metal() {
        this.name = "Металл";
        this.color = Color.Серый;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
