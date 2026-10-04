package objectcontainers;

/**
 * Represents a country by its name.
 */
public class Country {

    private final String name;

    /**
     * Creates a country.
     *
     * @param name country's name
     */
    public Country(String name) {
        this.name = name;
    }

    /**
     * @return country's name
     */
    public String getName() {
        return name;
    }
}