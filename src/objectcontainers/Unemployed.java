package objectcontainers;

/**
 * Represents a person who is currently looking for a job.
 */
public class Unemployed extends Person {

    private final String desiredJobTitle;

    /**
     * Creates an unemployed person.
     *
     * @param id              unique person ID
     * @param name            person's name
     * @param age             person's age
     * @param desiredJobTitle type of job the person is seeking
     */
    public Unemployed(int id, String name, int age, String desiredJobTitle) {
        super(id, name, age);
        this.desiredJobTitle = desiredJobTitle;
    }

    /**
     * @return the job title the person is seeking
     */
    public String getDesiredJobTitle() {
        return desiredJobTitle;
    }
}