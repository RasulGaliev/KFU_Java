import java.util.Arrays;

public class Result {
    private double[] results;
    private Student[] students;
    public Result(double[] results, Student[] students) {
        setResults(results);
        setStudents(students);
    }
    public void setResults(double[] results) {
        this.results = results.clone();
    }
    public void setStudents(Student[] students) {
        this.students = students.clone();
    }
    public double[] getResults() {
        return results;
    }
    public Student[] getStudents() {
        return students;
    }
    public double[] sortArray() {
        double[] sorted_array = results.clone();
        Arrays.sort(sorted_array);
        return sorted_array;
    }
    public double[] reverse_sort(){
        return my_bubble_reverse_sort(results);
    }
    private static double[] my_bubble_reverse_sort(double[] array) {
        double tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tmp = array[j];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public Student winner() {
        double result = this.sortArray()[0];
        int winner_index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getResult() == result) {
                winner_index = i;
                break;
            }
        }
        return students[winner_index];
    }
    public Student[] prize_winners() {
        double first_place = this.sortArray()[0];
        double second_place = this.sortArray()[1];
        double third_place = this.sortArray()[2];
        Student[] prize_winners_students = new Student[3];
        for (Student student : students) {
            if (student.getResult() == first_place)
                prize_winners_students[0] = student;
            else if (student.getResult() == second_place)
                prize_winners_students[1] = student;
            else if (student.getResult() == third_place)
                prize_winners_students[2] = student;
        }
        return prize_winners_students;
    }
    public double averageTime() {
        double sum = 0;
        for (double result : results) sum += result;
        return sum / results.length;
    }
    public int numberOfParticipants() {
        return results.length;
    }
}
