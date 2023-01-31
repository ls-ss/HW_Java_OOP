package hw4.task1.model;

import hw4.task1.model.enums.Position;

/**
 * Class contains Author model
 */
public class Author {
    private final String firstname;
    private final String lastname;
    private final Position position;

    public Author(String firstname, String lastname, Position position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Автор: " + "Имя: " + firstname + ", Фамилия: " + lastname + ", Должность: " + position;
    }
}
