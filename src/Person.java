
public class Person {
    private static int CLIENT_ID = 1;

    private String name;
    private int id;

    public Person(String name) {
        this.name = name;
        this.id = CLIENT_ID;
        CLIENT_ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
