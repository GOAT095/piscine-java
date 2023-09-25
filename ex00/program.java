package ex00;


public class program {
    public static void main(String[] args) {
        int sum = 0;
        int n = 479598;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}