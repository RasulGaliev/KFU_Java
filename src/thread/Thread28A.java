package thread;

public class Thread28A {
    public static void main(String[] args) {
        int n = 3;
        int array[] = new int[n];
        array[0] = 8;
        array[1] = 8;
        array[2] = 8;
        new ThreadAssistant28A(array).start();
        new ThreadAssistant28A(array).start();
    }
}
