package objectcontainers;

/**
 * Represents a person who has a job.
 */
public class Hired extends Person {

    private final String company;
    private final String jobTitle;

    /**
     * Creates an employed person.
     *
     * @param id       unique person ID
     * @param name     person's name
     * @param age      person's age
     * @param company  person's company
     * @param jobTitle person's job title
     */
    public Hired(int id, String name, int age, String company, String jobTitle) {
        super(id, name, age);
        this.company = company;
        this.jobTitle = jobTitle;
    }

    /**
     * @return the person's company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @return the person's job title
     */
    public String getJobTitle() {
        return jobTitle;
    }
}