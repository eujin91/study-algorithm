import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int i = sc.nextInt()-1;

        System.out.println(str.charAt(i));
    }
}