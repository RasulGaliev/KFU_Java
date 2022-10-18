public class Student {
    private int number;
    private String name;
    private double result;

    public Student(int number, String name, double result) {
        setNumber(number);
        setName(name);
        setResult(result);
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public int getNumber() {
        return number;
    }
    public double getResult() {
        return result;
    }
    public String getName() {
        return name;
    }
}
