import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int num = 0;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            num += a * b;
        }

        if(X == num){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}