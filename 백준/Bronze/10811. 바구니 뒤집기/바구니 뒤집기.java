import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        for (int i = 0; i < M; i++) {
            int j = sc.nextInt() - 1;
            int k = sc.nextInt();
            Collections.reverse(list.subList(j, k));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}