import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int finish = sc.nextInt();

        if(M + finish > 59) {
            H = (H + ((M+finish) / 60)) % 24;
            M = (M + finish) % 60;
        } else {
            M = M + finish;
        }

        System.out.println(H + " " + M);


    }
}