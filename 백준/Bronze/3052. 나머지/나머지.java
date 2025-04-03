import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            list.add(num % 42);
        }
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set.size());
    }
}