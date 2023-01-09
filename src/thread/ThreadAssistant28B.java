package thread;

public class ThreadAssistant28B extends Thread{
    private long sum;
    private final int[] a;
    private int i;
    private int j;

    public ThreadAssistant28B(long sum, int[] a, int i, int j) {
        this.sum = sum;
        this.a = a;
        this.i = i;
        this.j = j;
    }

    public void run() {
        while (i != j && i < a.length) {
            sum += a[i];
            i++;
        }
        Thread28B.sum += sum;
        System.out.println("Summa of thread number " + Thread.currentThread().getName() + " is " + this.sum);
    }
}

