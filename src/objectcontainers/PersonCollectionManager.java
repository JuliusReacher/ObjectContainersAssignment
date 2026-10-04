package objectcontainers;

import java.util.TreeSet;

/**
 * Stores people in TreeSets and prints them in different orders.
 */
public class PersonCollectionManager {

    private final TreeSet<Person> peopleByName = new TreeSet<>(new PersonNameComparator());

    private final TreeSet<Person> peopleByAge = new TreeSet<>(new PersonAgeComparator());

    /**
     * Adds a person to both sets.
     *
     * @param person person to add
     */
    public void addPerson(Person person) {
        peopleByName.add(person);
        peopleByAge.add(person);
    }

    /**
     * Prints people ordered by name.
     */
    public void printPeopleSortedByName() {
        printPeople("People sorted by name:", peopleByName);
    }

    /**
     * Prints people ordered by age.
     */
    public void printPeopleSortedByAge() {
        printPeople("People sorted by age:", peopleByAge);
    }

    private void printPeople(String heading, TreeSet<Person> people) {
        System.out.println(heading);

        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", age: " + person.getAge());
        }
    }
}