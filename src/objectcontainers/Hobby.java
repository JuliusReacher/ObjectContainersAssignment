package objectcontainers;

import java.util.List;

/**
 * Represents a hobby and the addresses where it can be practised.
 */
public class Hobby {

    private final String name;
    private final int frequency;
    private final List<Address> addresses;

    /**
     * Creates a hobby.
     *
     * @param name      the hobby's name
     * @param frequency how many times per week it is practised
     * @param addresses places where it can be practised
     */
    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    /**
     * Returns the hobby's name.
     *
     * @return the hobby's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns how many times per week the hobby is practised.
     *
     * @return weekly frequency
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Returns the addresses where the hobby can be practised.
     *
     * @return the addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }
}