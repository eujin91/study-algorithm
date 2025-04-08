import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 20;
        double num = 0.0;
        double scoreNum = 0.0;
        Map<String, Double> sMap = new HashMap<String, Double>() {
            {
                put("A+", 4.5);
                put("A0", 4.0);
                put("B+", 3.5);
                put("B0", 3.0);
                put("C+", 2.5);
                put("C0", 2.0);
                put("D+", 1.5);
                put("D0", 1.0);
                put("F", 0.0);
            }
        };

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            double val = sc.nextDouble();
            String score = sc.next();
            if (score.equals("P")) {
                continue;
            }
            num += val * sMap.get(score);
            scoreNum += val;
        }

        System.out.println(num / scoreNum);
    }
}