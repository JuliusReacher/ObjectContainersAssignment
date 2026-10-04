package objectcontainers;

/**
 * Represents an address by city and country.
 */
public class Address {

    private final String city;
    private final Country country;

    /**
     * Creates an address.
     *
     * @param city    the city where the hobby can be practised
     * @param country the country where the hobby can be practised
     */
    public Address(String city, Country country) {
        this.city = city;
        this.country = country;
    }

    /**
     * Returns the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the country.
     *
     * @return the country
     */
    public Country getCountry() {
        return country;
    }
}