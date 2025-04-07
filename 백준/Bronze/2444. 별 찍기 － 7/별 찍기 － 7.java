import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {
            int num = Math.abs(N - i);
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            if (i <= N) {
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < 2 * (2 * N - i) - 1; k++) {
                    System.out.print("*");
                }
            }
            if ((2 * N - 1) != i) {
                System.out.print("\n");
            }
        }

    }
}