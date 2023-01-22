package hw2.task1.interfaces;

import hw2.task1.model.Family;
import hw2.task1.model.Person;

public interface TreeService {

    /**
     * The method prints information about the Tree to the console
     *
     * @param person person
     * @param depth  indent
     */
    void printFamilyTree(Person person, int depth);

    /**
     * The method prints information about persons children to the console
     */
    void printChildren(Person person);
}
