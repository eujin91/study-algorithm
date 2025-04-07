import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int val = 1;
        if (str.length() == val) {
            System.out.println(1);
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(str.length() - i - 1);
                if (c1 != c2) {
                    val = 0;
                    break;
                }
            }
            System.out.println(val);
        }


    }
}