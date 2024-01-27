package HomeWork;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.io.File;
import java.util.Scanner;

public class HomeWork1 extends HomeWork {


    public void easy_6() {
        int n = _scanner.nextInt();

        int f = n / 100;
        int s = n / 10 % 10;
        int t = n % 10;

        n = f * 100 + t * 10 + s;

        System.out.println(n);
    }

    public void easy_7() {
        double n = _scanner.nextInt();

        double discount = 0;

        if (n > 5000)
            discount = 5d;
        if (n > 10000)
            discount = 10d;

        n -= n * (discount / 100d);

        System.out.println(n);
    }

    public void easy_8() {
        int n = _scanner.nextInt();

        int f = n / 100;
        int s = n / 10 % 10;
        int t = n % 10;

        int sum = f + s + t;

        if (sum >= 10 && sum <= 99)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public void easy_9() {
        int n = _scanner.nextInt();

        int f = n / 100;
        int s = n / 10 % 10;
        int t = n % 10;

        int mul = f * s * t;

        if (mul >= 100 && mul <= 999)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public void easy_10() {
        int n = _scanner.nextInt();

        int f = n / 100;
        int s = n / 10 % 10;
        int t = n % 10;

        if (f == 9 || s == 9 || t == 9)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public void medium_6() {
        double price = _scanner.nextInt();
        final double step = .1d;

        for (double i = .1d; i <= 1d; i += step) {
            System.out.printf("%.1f kg is %.1f%n", i, price * i);
        }

    }

    public void medium_7() {
        int n = _scanner.nextInt();

        int s = 0;
        for (int i = 1; i <= n; i++)
            s += i * i;

        System.out.println(s);
    }

    public void medium_8() {
        int n = _scanner.nextInt();

        int s = 0;
        int buffer = 0;

        for (int i = 1; i <= n; i++) {
            buffer += i;
            s += buffer;
        }

        System.out.println(s);
    }

    public void medium_9() {
        int n = _scanner.nextInt();

        int s = 0;
        int mul = 0;
        for (int i = 1; i <= n; i++) {
            mul += (int) Math.pow(10, i - 1);
            s += mul * 8;
        }

        System.out.println(s);
    }

    public void medium_10() {
        int n = _scanner.nextInt();
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter++ + " ");
            }

            System.out.println();
        }
    }

    public void hard_6() {
        int n = _scanner.nextInt();

        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }

    public void hard_7() {
        int n = _scanner.nextInt();

        int l = n % 10;
        int f = (int) (n / Math.pow(10, (int) Math.log10(n)));

        System.out.println((l + f));
    }

    private int dFactorial(int n) {
        int df = 1;

        for (int i = 2 - n % 2; i <= n; i += 2) {
            df *= i;
        }

        return df;
    }

    public void hard_8() {
        int n = _scanner.nextInt();

        int sum = 0;

        for (int i = 2 - n % 2; i <= n; i += 2) {
            sum += dFactorial(i);
        }

        System.out.println(sum);
    }

    private boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public void hard_9() {
        int n = _scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++)
            if (isPrime(i))
                count++;

        System.out.println(count);
    }

    public void hard_10() {
        File file = new File("res/input.txt");
        int id = 0;
        int vMax = 0;

        try (Scanner reader = new Scanner(file)) {
            if (!reader.hasNextInt()) {
                System.out.println("Input file is empty!");
                return;
            }

            int n = reader.nextInt();


            for (int i = 0; i < n; i++) {
                int v = reader.nextInt();
                int s = reader.nextInt();

                if (v > vMax && s == 1) {
                    vMax = v;
                    id = i + 1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            File output = new File("res/output.txt");

            if (!output.exists())
                output.createNewFile();

            try (FileWriter writer = new FileWriter(output)) {
                writer.write(Integer.toString(id));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Override
    public void callAll() {
        easy_6();
        easy_7();
        easy_8();
        easy_9();
        easy_10();
        medium_6();
        medium_7();
        medium_8();
        medium_9();
        medium_10();
        hard_6();
        hard_7();
        hard_8();
        hard_9();
        hard_10();
    }
}
