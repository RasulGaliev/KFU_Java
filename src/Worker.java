import java.util.Arrays;

public class Worker {
    private int experience = 0;
    private Worker[] controlled_worker = null;
    private String name;
    public void setControlled_worker(Worker[] controlled_worker) {
        this.controlled_worker = Arrays.copyOf(controlled_worker, controlled_worker.length);
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setExperience() {
        experience++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    public Worker[] getControlled_worker() {
        return controlled_worker;
    }
    public int getLength() {
        return controlled_worker.length;
    }
    public Worker getWorkerIndex(int index) {
        return controlled_worker[index];
    }
}
