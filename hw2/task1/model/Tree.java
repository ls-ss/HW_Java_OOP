package hw2.task1.model;

import hw2.task1.interfaces.TreeService;

import java.util.List;

public class Tree implements TreeService {

    public void printFamilyTree(Person person, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("     *");
        }
        System.out.println(person.getFirstname() + " " + person.getLastname() + " | братья и сестры:" + person.getSiblings());

        List<Person> parents = person.getParents();

        if (parents!=null) {
            for (Person parent : parents) {
                printFamilyTree(parent, depth + 1);
            }
        }
    }

    @Override
    public void printChildren(Person person) {
        System.out.println(person + "\nДети:\n" + person.getChildren());
    }

}
