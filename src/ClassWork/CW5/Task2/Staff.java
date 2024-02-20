package ClassWork.CW5.Task2;

public class Staff implements Worker {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return String.format("ID: %3d\tName: %5s\tSalary: %7d", id, name + " " + surname, getSalary());
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
