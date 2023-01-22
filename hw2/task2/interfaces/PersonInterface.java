package hw2.task2.interfaces;

import hw2.task2.model.Bowl;

/**
 * The interface describes the interaction with Person
 */
public interface PersonInterface {
    /**
     * The method describes filling the bowl
     *
     * @param bowl bowl
     */
    void fillBowl(Bowl bowl);

    /**
     * The method describes calling the animal
     *
     * @param animal animal
     */
    void callAnimal(AnimalInterface animal);

    @Override
    String toString();
}
