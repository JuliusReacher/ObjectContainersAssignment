package objectcontainers;

import java.util.Comparator;

/**
 * Compares people by age, then by name and ID.
 */
public class PersonAgeComparator implements Comparator<Person> {

    /**
     * Compares people by age, then by name and ID.
     *
     * @param first  the first person
     * @param second the second person
     * @return the comparison result
     */
    @Override
    public int compare(Person first, Person second) {
        int ageComparison = Integer.compare(first.getAge(), second.getAge());

        if (ageComparison != 0) {
            return ageComparison;
        }

        int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(first.getName(), second.getName());

        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(first.getId(), second.getId());
    }
}