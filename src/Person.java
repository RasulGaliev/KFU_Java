public class Person {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int age;

    public Person(int id, String surname, String name, String patronymic, int age) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return surname + " " + name.charAt(0)+ "." + patronymic.charAt(0) + ".";
    }
}
