import java.util.Objects;

public class Person {
    private String name;
    private String surname;

    public enum gender { // Не нашел применение. В ТЗ сказано выводить имя, фамилию и рост актера.
        MALE,
        FEMALE
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

}