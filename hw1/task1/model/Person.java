package hw1.task1.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    protected String firstname;

    protected String lastname;
    protected String dateBirth;
    protected Family family;
    protected List<Person> parents;
    protected final List<Person> siblings;
    protected final List<Person> children;


    public Person(String firstname, String lastname, String dateBirth, Family family) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateBirth = dateBirth;
        this.family = family;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public List<Person> getParents() {
        return parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void addSiblings(Person siblings) {
        this.siblings.add(siblings);
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChildren(Person child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + dateBirth;
    }

    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth);
    }

    public static void printFamilyTree(Person person, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("     *");
        }
        System.out.println(person.getFirstname() + " " + person.getLastname() + " | Братья и сестры:" + person.getSiblings());

        List<Person> parents = person.getParents();

        if (parents!=null) {
            for (Person parent : parents) {
                printFamilyTree(parent, depth + 1);
            }
        }
    }

    public void printChildren() {
        System.out.println(this.firstname+this.lastname + "\nДети:\n" + this.getChildren());
    }
}
