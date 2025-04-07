import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append(sc.next().trim());
        sb.append(" ");
        sb.append(sc.next().trim());
        StringTokenizer st = new StringTokenizer(sb.reverse().toString(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        System.out.println(Math.max(num1, num2));


    }
}