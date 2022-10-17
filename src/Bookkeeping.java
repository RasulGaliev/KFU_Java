import java.util.Arrays;

public class Bookkeeping {
    private Worker[] workers = null;

    public void setWorkers(Worker[] worker) {
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

    }
}
