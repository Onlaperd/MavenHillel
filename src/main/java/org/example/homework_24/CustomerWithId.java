package homework_24;

public class CustomerWithId {

    private static int userCount = -1;

    private String name;
    private String surname;
    private final Integer id;

    public CustomerWithId(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = userCount + 1;
        userCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }
}
