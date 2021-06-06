
import java.io.*;
import java.util.Scanner;

class Fibonacci extends Thread {

    public void run() {
        try {
            int a = 0, b = 1, c = 0;

            System.out.print("Enter the Limit for fabonacci: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Fibonacci series:");
            while (n > 0) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
                n = n - 1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Reverse extends Thread {

    public void run() {
        try {
            System.out.println("\nReverse is: ");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + "  ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class FibonacciUsingThread {

    public static void main(String[] args) {
        try {
            Fibonacci fib = new Fibonacci();
            fib.start();
            fib.sleep(5000);
            Reverse rev = new Reverse();
            rev.start();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
