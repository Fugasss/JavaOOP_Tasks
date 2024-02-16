package ClassWork.CW2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ClassWork2
{
	public static void task1(){
	    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < n; i++)
	       if(numbers[i] > 0)
	           System.out.print(numbers[i] + " ");
	    
	    System.out.println("");
	}
	
	public static void task2(){
	    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int min = numbers[0];
	    int max = numbers[0];
	    
	    for(int i = 0; i < n; i++){
	        if(numbers[i] < min)
	            min = numbers[i];
	            
	        if(numbers[i] > max)
	            max = numbers[i];
	    }
	    
	    System.out.println("Min: " + min);
	    System.out.println("Max: " + max);
	}
	
	public static void task3(){
	    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int minId = 0;
	    int maxId = 0;
	    
	    for(int i = 0; i < n; i++){
	        if(numbers[i] < numbers[minId])
	            minId = i;
	            
	        if(numbers[i] > numbers[maxId])
	            maxId = i;
	    }
	    
	    int buffer = numbers[minId];
	    numbers[minId] = numbers[maxId];
	    numbers[maxId] = buffer;
	    
	    System.out.println(Arrays.toString(numbers));
	}
	
	public static void task4(){
	    	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	           if(numbers[i] > numbers[j]){
	                int buffer = numbers[i];
            	    numbers[i] = numbers[j];
            	    numbers[j] = buffer;
	           }
	        }
	    }
	    
	    System.out.println(Arrays.toString(numbers));
	}
	
	public static void task5(){
	    	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int product = 1;
	    for(int i = 0; i < n; i++){
	       if(numbers[i] == 0) continue;
	       
	       product*=numbers[i];
	    }
	    
	    System.out.println(product);
	}
	
	public static void task6(){
	    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    int count = 0;
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int product = 1;
	    for(int i = 0; i < n; i++){
	       if(numbers[i] == 0) continue;
	       
	       product*=numbers[i];
	       count++;
	    }
	    
	    if(product < 0 && count%2 == 0){
	        System.out.println("Hey, calm down, dude, \ncan't find even root of negative number!");
	        return;
	    }
	    
	    System.out.println(Math.pow(product, 1.0d / (double)count));
	}
	
	public static void task7(){
	    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int[] numbers = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    
	    int m = sc.nextInt();
	    int count = 0;
	    
	     for(int i = 0; i < n; i++)
	        if(numbers[i] > m)
	            count++;
	    
	    System.out.println(count);
	}
}
