import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character c = sc.next().charAt(0);
        int num = (int) c;

        System.out.println(num);
    }
}