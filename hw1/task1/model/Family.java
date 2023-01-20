package hw1.task1.model;

import java.util.List;

public class Family {
    private String name;
    private Person father;
    private Person mother;
    private List<Person> children;

    public void setName(String name) {
        this.name = name;
    }


    public void setFather(Person father) {
        this.father = father;
    }


    public void setMother(Person mother) {
        this.mother = mother;
    }


    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return name + " " + father + " " + mother + " " + children;
    }
}
