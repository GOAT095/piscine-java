package ex03;

import java.rmi.ServerError;
import java.security.cert.CertificateRevokedException;
import java.sql.SQLOutput;
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
    private static void print_grades(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s ;
        int CurrentWeek = 1;
        while (1 == 1){ // autism
            if((s = scanner.next()).equals("42") || CurrentWeek > 18)
                break;
            if(s.equals("Week")){
                int Wentered = scanner.nextInt();
                if(Wentered != CurrentWeek){
                    System.err.println("IllegalArgument");
                    scanner.close();
                    System.exit(-1);
                }
                int min = get_min(scanner);
                System.out.println(min);

            }
        }
    }
}
