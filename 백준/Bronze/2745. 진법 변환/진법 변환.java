import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        reader.close();

        int tmp = 1;
        int sum = 0;

        for(int i = N.length()-1 ; i >= 0; i--){ 
            char C = N.charAt(i);
            
            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B;
        }

        System.out.println(sum);
    }
}