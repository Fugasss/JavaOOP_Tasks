package HomeWork.HW4;

import HomeWork.HomeWork;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class HomeWork4 extends HomeWork {
    public void Execute() {
        String menu = """
                PRESS [1] ADD USER
                PRESS [2] TO LIST USERS
                PRESS [0] TO EXIT
                                """;

        String addMenu = """
                PRESS [1] TO ADD STUDENT
                PRESS [2] TO ADD STAFF
                            """;
        String listMenu = """
                PRESS [1] TO LIST STUDENTS
                PRESS [2] TO LIST STAFF
                            """;
        String inputUserFormat = """
                Enter user's info (id, login, password, name, surname, gpa/salary):
                Ex. 1:
                    1 AAshat bRjk21 Andrey Ashatov 2.5
                                """;

        ArrayList<User> users = new ArrayList<>();

        while (true) {
            System.out.println(menu);
            int firstCommand = _scanner.nextInt();

            if (firstCommand == 0) {
                break;
            }

            if(firstCommand == 1)
                System.out.println(addMenu);
            else if(firstCommand == 2)
                System.out.println(listMenu);

            int secondCommand = _scanner.nextInt();

            if (secondCommand == 0) {
                continue;
            }

            if (firstCommand == 1) {
                System.out.println(inputUserFormat);

                int id = _scanner.nextInt();
                String login = _scanner.next();
                String password = _scanner.next();
                String name = _scanner.next();
                String surname = _scanner.next();
                double value = _scanner.nextDouble();

                User user;

                if (secondCommand == 1)
                    user = new Student(id, login, password, name, surname, value);
                else if (secondCommand == 2)
                    user = new Staff(id, login, password, name, surname, value);
                else
                    user = new User(id, login, password, name, surname);

                users.add(user);
            } else if (firstCommand == 2) {
                if (secondCommand == 1) {
                    users.stream().filter(x -> x instanceof Student).map(User::getData).forEach(System.out::println);
                }
                if (secondCommand == 2) {
                    users.stream().filter(x -> x instanceof Staff).map(User::getData).forEach(System.out::println);
                }
            }
        }
    }
}

class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
    }

    public User(int id,
                String login,
                String password,
                String name,
                String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getData() {
        return String.format("Id: %4d\nFull name: %s %s\nLogin: %s\nPassword: %s\n", id, name, surname, login, password);
    }

    @Override
    public String toString() {
        return getData();
    }
}

class Staff extends User {
    private final int MaxCountOfSubjects = 100;
    private double salary;
    private String[] subjects = new String[MaxCountOfSubjects];
    private int indexOfSubjects = 0;

    public Staff() {
        indexOfSubjects = 0;
    }

    public Staff(int id,
                 String login,
                 String password,
                 String name,
                 String surname,
                 double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        if (indexOfSubjects + 1 >= MaxCountOfSubjects) {
            System.out.println("Error: The limit on the number of courses has been reached!");
            return;
        }

        subjects[indexOfSubjects++] = subject;
    }

    @Override
    public String getData() {
        String info = super.getData();

        return info + String.format("Salary: %.2f\nIndex of Subjects: %d\nSubjects:\n\t%s\n", salary, indexOfSubjects, String.join("\n\t", Arrays.copyOfRange(subjects, 0, indexOfSubjects)));
    }
}

class Student extends User {
    private final int MaxCountOfCourses = 100;
    private double gpa;
    private String[] courses = new String[MaxCountOfCourses];
    private int indexOfCourses = 0;

    public Student() {
        indexOfCourses = 0;
    }

    public Student(int id,
                   String login,
                   String password,
                   String name,
                   String surname,
                   double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        if (indexOfCourses + 1 >= MaxCountOfCourses) {
            System.out.println("Error: The limit on the number of courses has been reached!");
            return;
        }
        this.courses[indexOfCourses++] = course;
    }

    @Override
    public String getData() {
        String info = super.getData();

        return info + String.format("GPA: %.2f\nIndex of Courses: %d\nCourses:\n\t%s\n", gpa, indexOfCourses, String.join("\n\t", Arrays.copyOfRange(courses, 0, indexOfCourses)));
    }
}