package hw4.task2.service;

import hw4.task2.model.Bowl;

/**
 * The interface describes the interaction with Person
 */
public interface PersonService {
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
    void callAnimal(AnimalService animal);

    @Override
    String toString();
}
