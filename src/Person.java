public class Person {
    protected String person_Name;
    protected String person_ID;

    public Person(String name, String id) {
        this.person_Name = name;
        this.person_ID = id;
    }

    @Override
    public String toString() {
        return "\nName: " + person_Name + "\nSecurity number: " + person_ID;
    }
}
