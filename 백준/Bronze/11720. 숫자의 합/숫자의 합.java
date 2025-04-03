import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int val = 0;
        for(int i = 0; i < N; i++){
            val += str.charAt(i) - '0';
        }
        System.out.println(val);
    }
}