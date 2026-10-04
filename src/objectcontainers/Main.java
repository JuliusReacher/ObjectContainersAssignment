package objectcontainers;

import java.util.List;

/**
 * Runs the assignment example.
 */
public class Main {

    /**
     * Runs the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PersonCollectionManager people = new PersonCollectionManager();

        Student student = new Student(1, "Ana Popescu", 22, "University of Bucharest", "Computer Science");
        Hired hired = new Hired(2, "Mihai Ionescu", 35, "Tech Company", "Developer");
        Unemployed unemployed = new Unemployed(3, "Elena Marin", 28, "Designer");
        Person person = new Person(4, "Andrei Radu", 40);

        people.addPerson(student);
        people.addPerson(hired);
        people.addPerson(unemployed);
        people.addPerson(person);

        people.printPeopleSortedByName();
        people.printPeopleSortedByAge();

        Country romania = new Country("Romania");
        Country italy = new Country("Italy");
        Country france = new Country("France");

        Address bucharest = new Address("Bucharest", romania);
        Address rome = new Address("Rome", italy);
        Address paris = new Address("Paris", france);

        Hobby cycling = new Hobby("Cycling", 3, List.of(bucharest, rome));
        Hobby swimming = new Hobby("Swimming", 2, List.of(paris));

        PersonHobbyManager hobbyManager = new PersonHobbyManager();
        hobbyManager.addHobbies(student, List.of(cycling, swimming));
        hobbyManager.printHobbiesAndCountries(student);
    }
}