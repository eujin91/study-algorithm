import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            for (int j = 0; j < 8; j++) {
                if (sb.toString().contains(arr[j])) {
                    int idx = sb.indexOf(arr[j]);
                    count += 1;
                    sb.delete(idx, idx + arr[j].length());
                    count += sb.length();
                    sb.setLength(0);
                    break;
                }
            }
        }
        count += sb.length();
        System.out.println(count);


    }
}