package HomeWork.HW3;

import HomeWork.HomeWork;

import java.util.Arrays;

public class HomeWork3 extends HomeWork {
    public void Task1() {
        Student[] students = new Student[]{
                new Student(1, "A", "B", 1.5),
                new Student(2, "B", "C", 2.5),
                new Student(3, "C", "D", 3.5),
                new Student(4, "D", "E", 4.0),
                new Student(5, "E", "F", 3.67),
        };


        for (Student student : students) {
            System.out.println(student.getData());
        }
    }


    public void Task2() {
        Student[] students = new Student[]{
                new Student(1, "A", "B", 1.5),
                new Student(2, "B", "C", 2.5),
                new Student(3, "C", "D", 3.5),
                new Student(4, "D", "E", 4.0),
                new Student(5, "E", "F", 3.67),
                new Student(6, "F", "G", 1.67),
                new Student(7, "G", "H", 2.0),
                new Student(8, "H", "K", 1.0),
                new Student(9, "K", "L", 0.0),
                new Student(10, "L", "P", 2.67),
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[i].gpa > students[j].gpa) {
                    Student swap = students[i];
                    students[i] = students[j];
                    students[j] = swap;
                }
            }
        }

        for (Student student : students) {
            System.out.println(student.getData());
        }
    }

    //    Test input
//    3
//    Macbook 540000 10 YES
//    Lenovo 100000 9 NO
//    Asus 145000 8 YES
    public void Task4() {
        int count = _scanner.nextInt();

        Laptop2[] laptops = new Laptop2[count];

        for (int i = 0; i < count; i++) {
            laptops[i] = new Laptop2(_scanner.next(), _scanner.nextInt(), _scanner.nextInt(), _scanner.next());
        }

        for (Laptop2 laptop : laptops) {
            System.out.printf("%s %d\n", laptop.name, (int) laptop.calculateNewPrice());
        }
    }

    //    Test input
//    2
//    SIS-1804 4
//    Kazybek 5000 YES
//    Aruzhan 12000 YES
//    Bekbolat 7000 NO
//    Alina 9500 YES
//    SIS-1811 3
//    Dias 9000 YES
//    Tamerlan 13000 NO
//    Amir 10000 YES
    public void Task5() {

        Group[] groups = new Group[_scanner.nextInt()];

        for (int i = 0; i < groups.length; i++) {
            String name = _scanner.next();
            Tourist[] tourists = new Tourist[_scanner.nextInt()];

            for (int j = 0; j < tourists.length; j++) {
                tourists[j] = new Tourist(_scanner.next(), _scanner.nextInt(), _scanner.next());
            }

            groups[i] = new Group(name, tourists);
        }

        for (Group g : groups) {
            System.out.printf("%s - %s\n", g.name, (g.canGo() ? "YES" : "NO"));
        }
    }

    //    Test Input
//    6
//    Brad Pitt 40 7,0
//    Kate Moss 31 6,9
//    Gal Gadot 5 7,1
//    Johnny Depp 50 7,8
//    Leonardo DiCaprio 35 7,9
//    Penelope Cruz 27 7,8
    public void Task6() {
        Oscar[] oscars = new Oscar[_scanner.nextInt()];

        for (int i = 0; i < oscars.length; i++) {
            oscars[i] = new Oscar(_scanner.next(), _scanner.next(), _scanner.nextInt(), _scanner.nextDouble());
        }

        for (int i = 0; i < oscars.length; i++) {
            for (int j = 0; j < oscars.length; j++) {
                if (oscars[i].rating > oscars[j].rating) {
                    Oscar swap = oscars[i];
                    oscars[i] = oscars[j];
                    oscars[j] = swap;
                } else if (oscars[i].rating == oscars[j].rating &&
                        oscars[i].movies > oscars[j].movies) {
                    Oscar swap = oscars[i];
                    oscars[i] = oscars[j];
                    oscars[j] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(oscars));
    }

//    Test Input
//    2
//    ALMATY 2
//    KZPharma 3
//    Adderall 2000 YES
//    Clonazepam 3200 NO
//    Lexapro 950 YES
//    Evalar 2
//    Xanax 5600 NO
//    Pantoprazole 1800 YES
//    ASTANA 2
//    EuroPharma 4
//    Gabapentin 7400 NO
//    Cymbalta 1600 YES
//    Tramadol 450 YES
//    Azithromycin 780 NO
//    Health 2
//    Ritalin 1200 YES
//    Methadone 9800 YES
    public void Task7() {
        City[] cities = new City[_scanner.nextInt()];

        for (int i = 0; i < cities.length; i++) {
            String cityName = _scanner.next();
            Pharmacy[] pharmacies = new Pharmacy[_scanner.nextInt()];

            for (int j = 0; j < pharmacies.length; j++) {
                String pharmName = _scanner.next();
                Drug[] drugs = new Drug[_scanner.nextInt()];

                for (int k = 0; k < drugs.length; k++) {
                    String drugName = _scanner.next();
                    int price = _scanner.nextInt();
                    String outOfDate = _scanner.next();

                    drugs[k] = new Drug(drugName, price, outOfDate);
                }
                pharmacies[j] = new Pharmacy(pharmName, drugs);
            }
            cities[i] = new City(cityName, pharmacies);
        }

        for (City city : cities) {
            System.out.printf("City: %s\n", city.name);

            Drug mostExpensive = new Drug();

            for (Pharmacy pharmacy : city.pharmacies) {
                Drug exp = pharmacy.getMostExpensive();

                if(exp.price > mostExpensive.price)
                    mostExpensive = exp;

                System.out.printf("The most expensive drug in %s is %s\n", pharmacy.name, exp.name);
            }

            System.out.printf("THE MOST EXPENSIVE DRUG IN %s: %s\n", city.name, mostExpensive.name);
        }
    }
}

// TASK 1-2
class Student {
    public int id;
    public String name;
    public String surname;
    public double gpa;

    public Student() {
    }

    public Student(int id, String name, String surname, double gpa) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getData() {
        return String.format("ID %3d, Student: %s %s, GPA: %.2f", id, name, surname, gpa);
    }
}

// TASK 3
class CPU {
    public String name;
    public int RAM;
    public double frequency;

    public CPU() {
    }

    public CPU(String name, int RAM, double frequency) {

        this.name = name;
        this.RAM = RAM;
        this.frequency = frequency;
    }

    public String getCPUData() {
        return String.format("%s %.1f\t??? RAM ???: %5d", name, frequency, RAM);
    }
}

class Laptop1 {
    public String name;
    public int HDDMemory;
    public CPU processor;

    public Laptop1() {
    }

    public Laptop1(String name, int HDDMemory, CPU cpu) {
        this.name = name;
        this.HDDMemory = HDDMemory;
        this.processor = cpu;
    }

    public void printLaptopData() {
        String info = "";
        info += name + "\n";
        info += HDDMemory + "\n";
        info += processor.getCPUData() + "\n";

        System.out.println(info);
    }

    public void execute() {
        if (processor.RAM <= 4096 || processor.frequency < 2.5) {
            System.out.println("Cannot start computer");
            return;
        }

        System.out.println("Laptop is started and executing");
    }
}

// TASK 4
class Laptop2 {
    public String name;
    public int startPrice;
    public int generation_of_CPU; // 8,9,10
    public String ssd;

    public Laptop2() {
    }

    public Laptop2(String name, int price, int generation, String ssd) {
        this.name = name;
        this.startPrice = price;
        this.generation_of_CPU = generation;
        this.ssd = ssd;
    }

    public double calculateNewPrice() {
        int percent = 0;

        switch (generation_of_CPU) {
            case 8:
                percent += 10;
                break;
            case 9:
                percent += 15;
                break;
            case 10:
                percent += 20;
                break;
            default:
                System.out.println("There is no another CPU generations");
                break;
        }

        if (ssd.equals("YES"))
            percent += 15;


        return startPrice * (100d + percent) / 100d;
    }
}

// TASK 5
class Tourist {
    public String name;
    public int money;
    public String access;

    public Tourist() {
    }

    public Tourist(String name,
                   int money,
                   String access) {

        this.name = name;
        this.money = money;
        this.access = access;
    }

}

class Group {
    public String name;
    public Tourist[] tourists;

    public Group() {
    }

    public Group(String name, Tourist[] tourists) {

        this.name = name;
        this.tourists = tourists;
    }

    public boolean canGo() {
        int total = 0;

        for (Tourist t : tourists) {
            if (t.access.equals("NO")) continue;

            total += t.money;
        }

        return total >= 20000;
    }
}

// TASK 6
class Oscar {
    String name;
    String surname;
    int movies;
    double rating;

    public Oscar() {
    }

    public Oscar(String name,
                 String surname,
                 int movies,
                 double rating) {

        this.name = name;
        this.surname = surname;
        this.movies = movies;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.1f", name, surname, movies, rating);
    }
}

// TASK 7
class Drug {
    String name;
    int price;
    String outOfDate;

    public Drug() {
    }

    public Drug(String name, int price, String outOfDate) {
        this.name = name;
        this.price = price;
        this.outOfDate = outOfDate;
    }
}

class Pharmacy {
    String name;
    Drug[] drugs;

    public Pharmacy() {
    }

    public Pharmacy(String name, Drug[] drugs) {
        this.name = name;
        this.drugs = drugs;
    }

    public Drug getMostExpensive() {
        Drug d = drugs[0];

        for (Drug drug : drugs) {
            if (drug.price > d.price)
                d = drug;
        }

        return d;
    }
}

class City {
    String name;
    Pharmacy[] pharmacies;

    public City() {
    }

    public City(String name, Pharmacy[] pharmacies) {
        this.name = name;
        this.pharmacies = pharmacies;
    }
}