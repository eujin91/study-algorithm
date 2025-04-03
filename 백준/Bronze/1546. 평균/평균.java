import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Double> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(sc.nextDouble());
        }
        double val = 0;
        double max = Collections.max(list);
        for (int i = 0; i < N; i++) {
            list.set(i, (list.get(i) / max * 100));
            val += list.get(i);
        }
        val /= N;
        System.out.println(val);

    }
}