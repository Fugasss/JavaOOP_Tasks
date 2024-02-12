package HomeWork.HW2;

import HomeWork.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks extends HomeWork {

    public void task1() {
        System.out.println("Enter a number of elements: ");

        int n = _scanner.nextInt();
        Integer[] numbers = new Integer[n];

        System.out.println("Fill array: ");

        for (int i = 0; i < n; i++)
            numbers[i] = _scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(list);
    }

    public void task2() {
        System.out.println("Enter a number of elements: ");

        int n = _scanner.nextInt();
        Integer[] numbers = new Integer[n];

        System.out.println("Fill array: ");

        for (int i = 0; i < n; i++)
            numbers[i] = _scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        Integer[] array = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }

    public void task3() {
        System.out.println("Enter a number of elements: ");

        int n = _scanner.nextInt();
        Integer[] numbers = new Integer[n];

        System.out.println("Fill array: ");

        for (int i = 0; i < n; i++)
            numbers[i] = _scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("Enter a number to find: ");

        int value = _scanner.nextInt();

        int ind = list.indexOf(value);

        if (ind == -1) {
            System.out.printf("There is no %d in a list", value);
            return;
        }

        System.out.printf("The index of %d is %d", value, ind);
    }

    public void task4(){
        System.out.println("Enter a number of elements: ");

        int n = _scanner.nextInt();
        Integer[] numbers = new Integer[n];

        System.out.println("Fill array: ");

        for (int i = 0; i < n; i++)
            numbers[i] = _scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("Enter numbers to swap: ");

        int val1 = _scanner.nextInt();
        int val2 = _scanner.nextInt();

        int ind1 = list.indexOf(val1);
        int ind2 = list.indexOf(val2);

        if (ind1 == -1 || ind2 == -1) {
            System.out.println("Can't swap numbers that are not in the list!");
            return;
        }

        System.out.println("Before: ");
        System.out.println(list);

        Integer buffer = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, buffer);

        System.out.println("After: ");
        System.out.println(list);
    }
}
