import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45){
            H = (H + 24 - 1) % 24;
            M = (M + 60 - 45) % 60;
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}