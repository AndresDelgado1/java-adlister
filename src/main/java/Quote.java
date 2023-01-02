import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String content;

    public Quote() {}

    public Quote(int id, String firstName, String lastName, String content) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
