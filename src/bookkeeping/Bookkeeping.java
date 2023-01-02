package bookkeeping;

import java.util.Arrays;

public class Bookkeeping {
    private Worker[] workers = null;
    public Bookkeeping() {}
    public Bookkeeping(Worker[] workers) {
        setWorkers(workers);
    }
    public void setWorkers(Worker[] workers) {
        this.workers = Arrays.copyOf(workers, workers.length);
    }
    public Worker[] getWorkers() {
        return workers;
    }
    public int getLength() {
        return workers.length;
    }
    public int counter(Worker worker) {
        int count = 0;
        for (int i = 0; i < worker.getLength(); i++) {
            if (worker.getWorkerIndex(i).getExperience() <= 6)
                count++;
        }
        return count;
    }
    public boolean prize(Worker worker) {
        return worker.getControlled_worker() != null && counter(worker) > 3;
    }
    public void out_recipients() {
        for (int i = 0; i < getLength(); i++) {
            if (prize(workers[i]))
                System.out.println(workers[i].getName());
        }
    }
    public static void main(String[] args) {
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2, "Aleks");
        Worker worker3 = new Worker(1, "Ayaz");
        Worker worker4 = new Worker(2, new Worker[]{worker1, worker2, worker3},"Ill");
        Worker worker5 = new Worker(2, new Worker[]{worker1, worker2, worker3, worker4},"Aka");
        Worker worker6 = new Worker(2, new Worker[]{worker1, worker2, worker3, worker4, worker5},"Sata");
        Bookkeeping my_bookkeeping = new Bookkeeping(new Worker[]{worker1, worker2, worker3, worker4, worker5, worker6});
        my_bookkeeping.out_recipients();
    }
}
