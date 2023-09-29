package org.example;

import javax.swing.plaf.synth.SynthUI;
import java.sql.PseudoColumnUsage;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void first() {
        System.out.print("Fall seven times\nand\nstand up eight");
    }

    public static void second() {
        System.out.print("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        System.out.print("Sum : " + sum + "\ndiff : " + diff + "\nmult : " + mult + "\n");
    }

    public static void third() {
        System.out.print("Enter a four-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 1000 && num < 10000) {
            int n1 = num / 1000;
            int n2 = (num / 100) % 10;
            int n3 = (num / 10) % 10;
            int n4 = num % 10;
            int res = n4 * 1000 + n3 * 100 + n2 * 10 + n1;
            System.out.print("Result = " + res);
        } else {
            System.out.print("You entered wrong number");
        }
    }

    public static void fourth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour(0-23): ");
        int hour = scanner.nextInt();
        if (hour < 0 || hour > 23) {
            System.out.print("wrong time");
        } else {
            if (hour >= 0 && hour < 6) {
                System.out.print("Good night");
            } else if (hour >= 6 && hour < 13) {
                System.out.print("Good morning");
            } else if (hour >= 13 && hour < 17) {
                System.out.print("Good day");
            } else {
                System.out.print("Good evening");
            }
        }

    }

    public static void fifth() {
        System.out.print("Enter six-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 100000 && num < 1000000) {
            int n1 = num / 100000;
            int n2 = (num / 10000) % 10;
            int n3 = (num / 1000) % 10;
            int n4 = (num / 100) % 10;
            int n5 = (num / 10) % 10;
            int n6 = num % 10;
            int s1 = n1 + n2 + n3;
            int s2 = n4 + n5 + n6;
            if (s1 == s2) {
                System.out.print("Your number is lucky");
            } else {
                System.out.print("Your number is unlucky");
            }
        } else {
            System.out.print("Wrong number");
        }
    }

    public static void sixth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(0-100): ");
        int num = scanner.nextInt();
        if (num < 1 || num > 100) {
            System.out.print("Wrong number");
        } else {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("Fizz Buzz");
            } else if (num % 3 == 0) {
                System.out.print("Fizz");
            } else if (num % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(num);
            }
        }

    }

    public static void seventh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.print("Factorial does not exist");
        } else {
            if (num == 0 || num == 1) {
                System.out.print(num);
            } else {
                int factorial = 1;
                for (int i = num; i >= 1; i--) {
                    factorial *= i;
                }
                System.out.print("Factorial = " + factorial);
            }
        }
    }

    public static void eighth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number<=1){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static void nineth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        System.out.println("Fill array: ");
        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<size;i++){
            sum += arr[i];
        }
        double avg = sum/size;
        System.out.println("Sum: " + sum + "\nAVG: " + avg);
    }

    public static void tenth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        System.out.println("Fill array: ");
        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int count=0;
        for(int i=0; i<size;i++){
            if(arr[i]==n)
                count++;
        }
        System.out.print("Number " + n + " appears: " + count);


    }

    public static int sum(int start, int end){
        int sum=0;
        for (int i = start; i <= end; i++)
            sum+= i;
        return sum;
    }
    public static void eleventh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        if(start>end){
            int temp =start;
            start = end;
            end = temp;
        }

        System.out.print(sum(start,end));
    }

    public static void factorial(int size,int[]arr){
        int []newArr = new int[size];
        for(int i= 0; i<arr.length; i++){
            int fact =1;
            if(arr[i]>0){
                for(int j = arr[i]; j>=2;j--){
                    fact *= j;
                }
                newArr[i] = fact;
            }
            else {
                newArr[i] = 0;
            }
        }
        for (int i = 0; i<newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static void twelfth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        System.out.println("Fill array: ");
        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        factorial(arr.length,arr);

    }
    public static void main(String[] args) {
        //first();
        //second();
        //third();
        //fourth();
        //fifth();
        //sixth();
        //seventh();
        //eighth();
        //nineth();
        //tenth();
        //eleventh();
        //twelfth();




    }
}