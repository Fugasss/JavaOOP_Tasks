package HomeWork;

import java.util.ArrayList;

public class HomeWork2 extends HomeWork {

    public void task1() {
        int n = _scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = _scanner.nextInt();
        }

        int sum = 0;
        boolean isZero = false;

        for (int val : numbers) {
            if (val == 0 && !isZero) {
                isZero = true;
                continue;
            }
            if (val == 0) {
                break;
            }
            if (!isZero) continue;

            sum += val;
        }

        System.out.println(sum);
    }

    public void task2() {
        int n = _scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = _scanner.nextInt();
        }

        int m = _scanner.nextInt();

        boolean found = false;
        int id = 0;
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            if (val == m) {
                found = true;
                id = i;
                break;
            }
        }

        System.out.println((found ? "Yes\nIndex:" + id : "No"));
    }

    public void task3() {
        int n = _scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
            numbers[i] = _scanner.nextInt();

        int max = numbers[0];
        int sMax = numbers[0];

        for (int i = 1; i < n; i++)
            if (numbers[i] > max)
                max = numbers[i];

        for (int i = 1; i < n; i++)
            if (numbers[i] < max && numbers[i] > sMax)
                sMax = numbers[i];

        System.out.println(sMax);
    }

    private class TimeStamp {
        public final int hours;
        public final int minutes;
        public final int seconds;

        public int inSeconds() {
            return seconds + minutes * 60 + hours * 60 * 60;
        }

        public TimeStamp(int h, int m, int s) {

            this.hours = h;
            this.minutes = m;
            this.seconds = s;
        }

        @Override
        public String toString() {
            return String.format("%d %d %d", hours, minutes, seconds);
        }
    }

    public void task4() {
        int n = _scanner.nextInt();
        TimeStamp[] stamps = new TimeStamp[n];

        for (int i = 0; i < n; i++) {
            stamps[i] = new TimeStamp(
                    _scanner.nextInt(),
                    _scanner.nextInt(),
                    _scanner.nextInt());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (stamps[j].inSeconds() > stamps[i].inSeconds()) {
                    TimeStamp buffer = stamps[i];
                    stamps[i] = stamps[j];
                    stamps[j] = buffer;
                }
            }
        }

        for(TimeStamp stamp: stamps){
            System.out.println(stamp.toString());
        }
    }
}