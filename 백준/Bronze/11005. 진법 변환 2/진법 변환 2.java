import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder builder = new StringBuilder();

        
        while(N != 0){
            if(N%B >= 10) builder.append((char) ((N % B) + 55));
            else builder.append(N%B);
            N /= B;
        }

        System.out.println(builder.reverse().toString());
        
    }
}