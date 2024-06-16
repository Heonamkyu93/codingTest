import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / q + " ");
            C %= q;

            sb.append(C / d + " ");
            C %= d;

            sb.append(C / n + " ");
            C %= n;

            sb.append(C / p + "\n");
        }
        System.out.print(sb);

        br.close();
    }
}
