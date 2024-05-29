package gr.aueb.cf.ch12.model;

/**
 * Java Bean - POJO (Plain Old Java Object) =
 * data class με private πεδία & default public constructor
 *  & getters and setters
 */
public class Student {

    //private πεδία
    private int id;
    private String firstname;
    private String lastname;

    /**
     * default public constructor
     * Populates the state of a {@link Student}
     * to default values, eg 0, null
     */
    public Student() {

    }

    /**
     * overloaded constructor
     * Populates the state of the instance based on specific
     * values that are given
     *
     * @param id
     * @param firstname
     * @param lastname
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //getters and setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
