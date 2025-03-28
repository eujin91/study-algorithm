import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = 0;

        for(int i = 1; i <= n; i++){
            val += i;
        }

        System.out.println(val);
    }
}