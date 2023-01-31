package hw4.task2.model.material;

import hw4.task2.model.enums.Color;
/**
 * Class Wood implements interface Material. Used in generics
 */
public class Wood implements Material {
    String name;
    Color color;

    public Wood() {
        this.name = "Дерево";
        this.color = Color.Белый;
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
