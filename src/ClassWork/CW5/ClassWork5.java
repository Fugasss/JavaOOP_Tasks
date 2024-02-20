package ClassWork.CW5;

import ClassWork.CW5.Task1.Engine;
import ClassWork.CW5.Task1.FerrariEngine;
import ClassWork.CW5.Task1.RenaultEngine;
import ClassWork.CW5.Task2.HRManagers;
import ClassWork.CW5.Task2.Programmers;
import ClassWork.CW5.Task2.Staff;
import ClassWork.CW5.Task2.Worker;

import java.util.Arrays;

public class ClassWork5 {
    public static void Task1() {
        Engine[] engines = {
                new FerrariEngine(5.7, 8, 50.0),
                new FerrariEngine(12.2, 16, 45.0),
                new FerrariEngine(6.7, 12, 29.0),
                new FerrariEngine(7.7, 10, 33.5),
                new FerrariEngine(8.7, 10, 40.5),

                new RenaultEngine(5.7, 8, 50.0, 10),
                new RenaultEngine(12.2, 16, 45.0, 20),
                new RenaultEngine(6.7, 12, 29.0, 30),
                new RenaultEngine(7.7, 10, 33.5, 40),
                new RenaultEngine(8.7, 10, 40.5, 50)
        };

        for (Engine engine : engines) {
            System.out.printf("Max speed: %f\n", engine.getMaxSpeed());
        }
    }

    public static void Task2() {
        Worker[] workers = {
                new Programmers(1, "A", 1500, 500, 0.3),
                new Programmers(2, "B", 2500, 600, 0.4),
                new Programmers(3, "C", 3500, 700, 0.5),
                new Programmers(4, "D", 4500, 800, 0.6),
                new Programmers(5, "E", 5500, 900, 0.7),

                new Staff(1, "A", "A", 1500),
                new Staff(2, "B", "B", 2500),
                new Staff(3, "C", "C", 3500),
                new Staff(4, "D", "D", 4500),
                new Staff(5, "E", "E", 5500),

                new HRManagers(1, "A B", 1500),
                new HRManagers(2, "B C", 2500),
                new HRManagers(3, "C D", 3500),
                new HRManagers(4, "E F", 4500),
                new HRManagers(5, "F G", 5500)
        };

        System.out.println(Arrays
                .stream(workers)
                .max((x, y) -> Integer.compare(x.getSalary(), y.getSalary()))
                .get()
                .getWorkerData());

        System.out.println();

        Arrays.sort(workers, (x, y) -> (Integer.compare(y.getSalary(), x.getSalary())));

        for(Worker worker : workers){
            System.out.println(worker.getWorkerData());
        }
    }
}
