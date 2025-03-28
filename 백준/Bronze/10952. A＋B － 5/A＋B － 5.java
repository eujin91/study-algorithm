import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while(A != 0 && B !=0){
            bw.write((A+B) + "\n");
            StringTokenizer st_2 = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st_2.nextToken());
            B = Integer.parseInt(st_2.nextToken());
        }
        bw.flush();
        bw.close();
    }
}