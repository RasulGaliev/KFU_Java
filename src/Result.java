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
        double result = this.sortArray()[results.length - 1];
        int winner_index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getResult() == result) {
                winner_index = i;
                break;
            }
        }
        return students[winner_index];
    }
    public Student prize_winners() {
        double result = this.sortArray()[results.length - 1];
        int winner_index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getResult() == result) {
                winner_index = i;
                break;
            }
        }
        return students[winner_index];
    }
}
