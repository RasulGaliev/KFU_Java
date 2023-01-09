package thread;

import java.util.Scanner;

public class Thread28B extends  Thread{
    static  int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        int k = sc.nextInt();
        int i = 0;
        int j = n / k;
        if (n % k != 0)
            j++;
        long threadSum = 0;
        for (int t = 1; t <= k; t++) {
            Thread workerThread = new ThreadAssistant28B(threadSum, array, i, j);
            workerThread.start();
            i = j;
            j = i + n/k;
            if (n % k != 0)
                j++;
            workerThread.join();
        }
        System.out.println("Sum = " + sum);
    }
}
