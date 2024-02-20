package ClassWork.CW5.Task2;

public class Programmers implements Worker {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double kpi) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = kpi;
    }

    @Override
    public String getWorkerData() {
        return String.format("ID: %3d\tName: %5s\tSalary: %7d", id, nickname, getSalary());

    }

    @Override
    public int getSalary() {
        return salary + (int) (KPIValue * bonusSalary);
    }
}
