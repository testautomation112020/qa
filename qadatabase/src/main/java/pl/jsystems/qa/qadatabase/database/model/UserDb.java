package pl.jsystems.qa.qadatabase.database.model;

public class UserDb {

    public long id;
    public String name;
    public String surname;

    public UserDb(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public UserDb() {
    }

    @Override
    public String toString() {
        return "UserDb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
