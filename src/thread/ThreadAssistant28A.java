package thread;

public class ThreadAssistant28A extends Thread{
    int[] a;
    int sum = 0;
    public ThreadAssistant28A(int[] a) {
        this.a = a;
    }
    @Override
    public void run() {
        this.sum = sum(a);
        System.out.println("Sum" + Thread.currentThread().getName() + " = " + sum);
    }
    public static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
}
