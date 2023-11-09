package ex03;

import java.util.Scanner;

public class Program {
    private  static int get_min(Scanner s){
        int min = 9;
        for(int i = 0; i < 5;i++){
            int x = s.nextInt();
            min = x < min ? x : min;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s ;
        int CurrentWeek = 1;
        int res = 0;

        int multiply = 1;
        while (1 == 1){ // autism
            if((s = scanner.next()).equals("42") || CurrentWeek > 18)
                break;
            if(s.equals("Week")) {
                int WeekEntered = scanner.nextInt();
                if (WeekEntered != CurrentWeek) {
                    System.err.println("IllegalArgument");
                    scanner.close();
                    System.exit(-1);
                }
                int min = get_min(scanner);
                System.out.println(min);
                int pow = CurrentWeek - 1;
                while (pow > 0) {
                    multiply *= 10;
                    pow--;
                }
                System.out.println("multi = " + multiply);
                res += multiply * min;
                System.out.println("result = " + res);
                CurrentWeek++;
            }
        }
        // printer
        for (int i = 0; i < CurrentWeek-1; i++) {
            System.out.print("Week " + (i + 1) + " ");
            for (int j = 0; j < res % 10; j++) {
                System.out.print("=");
            }
            System.out.println(">");
            res = res / 10;
        }
        scanner.close();
    }
}
