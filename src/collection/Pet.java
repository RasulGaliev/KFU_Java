package collection;

public class Pet {
    private String type;
    private int age;

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + age;
    }
}
