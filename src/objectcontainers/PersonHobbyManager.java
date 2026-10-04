package objectcontainers;

import java.util.HashMap;
import java.util.List;

/**
 * Stores and prints the hobbies associated with people.
 */
public class PersonHobbyManager {

    private final HashMap<Person, List<Hobby>> hobbiesByPerson = new HashMap<>();

    /**
     * Adds hobbies for a person.
     *
     * @param person  the person
     * @param hobbies the person's hobbies
     */
    public void addHobbies(Person person, List<Hobby> hobbies) {
        hobbiesByPerson.put(person, hobbies);
    }

    /**
     * Prints a person's hobbies and the countries where they can be practised.
     *
     * @param person the person whose hobbies will be printed
     */
    public void printHobbiesAndCountries(Person person) {
        List<Hobby> hobbies = hobbiesByPerson.get(person);

        if (hobbies == null) {
            System.out.println("No hobbies found for " + person.getName());
            return;
        }

        System.out.println("Hobbies and countries for " + person.getName() + ":");

        for (Hobby hobby : hobbies) {
            System.out.print(hobby.getName() + " (" + hobby.getFrequency() + " times/week) - Countries: ");

            List<Address> addresses = hobby.getAddresses();

            for (int i = 0; i < addresses.size(); i++) {
                System.out.print(addresses.get(i).getCountry().getName());

                if (i < addresses.size() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }
}