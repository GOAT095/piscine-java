

package ex02;

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //get input from stdin in java
        int i;
        int counter= 0;
        int res = 0;
        int n;
        while((n = scanner.nextInt()) != 42){
            i = 2;
            while(n != 0) {
                res += n % 10;
                n /= 10;
            }
            while (i * i <= res) {
                System.out.println("---> " + res);
                if (res % i == 0) {
                    System.out.println("---> " + res);
                    counter--;
                    break;
                }
                i++;
            }
            counter++;
            System.out.println("---> " + counter);
        }
        System.out.println("Count of coffee-request - " + counter);
        scanner.close();
    }
}

