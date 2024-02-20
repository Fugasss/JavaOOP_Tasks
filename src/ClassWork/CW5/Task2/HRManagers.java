package ClassWork.CW5.Task2;

public class HRManagers implements Worker {
    private int id;
    private String fullName;
    private int salary;

    public HRManagers() {
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return String.format("ID: %3d\tName: %5s\tSalary: %7d", id, fullName, getSalary());
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
