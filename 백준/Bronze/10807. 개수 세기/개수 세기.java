import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            list.add(sc.nextInt());
        }
        int v = sc.nextInt();
        int count = Collections.frequency(list, v);

        System.out.println(count);


    }
}