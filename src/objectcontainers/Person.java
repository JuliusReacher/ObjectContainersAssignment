package objectcontainers;

import java.util.Objects;

/**
 * Represents a person with a unique ID, a name, and an age.
 */
public class Person {

    private final int id;
    private final String name;
    private final int age;

    /**
     * Creates a person.
     *
     * @param id   unique identifier
     * @param name person's name
     * @param age  person's age
     */
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the person's unique ID.
     *
     * @return the person's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the person's name.
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person's age.
     *
     * @return the person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Two people are equal when they have the same ID.
     *
     * @param other object to compare
     * @return true when both objects represent the same person
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Person person)) {
            return false;
        }
        return id == person.id;
    }

    /**
     * Generates a hash code based on the person's ID.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}