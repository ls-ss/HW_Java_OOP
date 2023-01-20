package hw1.task1.model;

import hw1.task1.model.enums.Auto;

public class Male extends Person {
    private int power;
    private Auto auto;

    public Male(String firstname, String lastname, String dateBirth, Family family, int power, Auto auto) {
        super(firstname, lastname, dateBirth, family);
        this.power = power;
        this.auto = auto;
    }

    @Override
    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth + " " + this.power + " " + this.auto);
    }
}
