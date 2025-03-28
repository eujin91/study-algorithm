import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] val = new int[3];
        int money = 0;

        for(int i = 0; i < val.length; i++){
            val[i] = sc.nextInt();
        }

        if(val[0] == val[1] && val[0] == val[2]){
            money = 10000 + val[0] * 1000;
        } else if (val[0] != val[1] && val[0] != val[2] && val[1] != val[2]) {
            Arrays.sort(val);
            money = val[2] * 100;
        } else {
            if(val[0] == val[1] || val[0] == val[2]){
                money = 1000 + val[0] * 100;
            }
            if(val[1] == val[2]){
                money = 1000 + val[1] * 100;
            }
        }

        System.out.println(money);
    }
}