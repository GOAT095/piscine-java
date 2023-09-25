package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 0 && n <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1); //error
        }
        int i = 2;
        int counter = 0;
        while (i * i < n) {
            counter++;
            if (n % i == 0) {
                System.out.println("false " + counter);
                break;
            }
            i++;
        }
        System.out.println("true " + counter + 1);
        scanner.close();
        }
}

