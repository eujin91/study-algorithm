import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int val6 = A*B;
        int val5 = B/100*A;
        B = B % 100;
        int val4 = B/10*A;
        int val3 = B%10*A;

        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
    }
}