package objectcontainers;

import java.util.Comparator;

/**
 * Compares people by name, then by ID.
 */
public class PersonNameComparator implements Comparator<Person> {

    /**
     * Compares people by name, ignoring case, then by ID.
     *
     * @param first  the first person
     * @param second the second person
     * @return the comparison result
     */
    @Override
    public int compare(Person first, Person second) {
        int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(first.getName(), second.getName());

        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(first.getId(), second.getId());
    }
}