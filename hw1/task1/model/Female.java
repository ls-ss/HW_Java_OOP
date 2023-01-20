package hw1.task1.model;

import hw1.task1.model.enums.Flavour;

public class Female extends Person {
    private int beauty;
    private Flavour flavour;

    public Female(String firstname, String lastname, String dateBirth, Family family, int beauty, Flavour flavour) {
        super(firstname, lastname, dateBirth, family);
        this.beauty = beauty;
        this.flavour = flavour;
    }

    @Override
    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth + " " + this.beauty + " " + this.flavour);
    }
}
