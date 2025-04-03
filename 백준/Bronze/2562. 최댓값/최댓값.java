import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 9;

        List<Integer> list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        int max = Collections.max(list);
        System.out.println(max);
        System.out.println(list.indexOf(max) + 1);
    }
}