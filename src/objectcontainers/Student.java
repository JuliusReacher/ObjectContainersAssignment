package objectcontainers;

/**
 * Represents a student and the field of study.
 */
public class Student extends Person {

    private final String university;
    private final String fieldOfStudy;

    /**
     * Creates a student.
     *
     * @param id           unique person ID
     * @param name         student's name
     * @param age          student's age
     * @param university   university where the student studies
     * @param fieldOfStudy student's field of study
     */
    public Student(int id, String name, int age, String university, String fieldOfStudy) {
        super(id, name, age);
        this.university = university;
        this.fieldOfStudy = fieldOfStudy;
    }

    /**
     * @return the student's university
     */
    public String getUniversity() {
        return university;
    }

    /**
     * @return the student's field of study
     */
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
}