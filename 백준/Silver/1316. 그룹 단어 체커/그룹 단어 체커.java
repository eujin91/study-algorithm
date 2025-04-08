import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int count = 0;
        int tmp = 1;
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            sb.append(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                if (sb.toString().charAt(j - 1) != str.charAt(j)) {
                    if (sb.toString().contains(str.charAt(j) + "")) {
                        tmp = 3;
                        break;
                    }
                }
                sb.append(str.charAt(j));
            }
            if (tmp != 3) {
                count++;
            }
            tmp = 1;
            sb.setLength(0);
        }
        System.out.println(count);
    }
}