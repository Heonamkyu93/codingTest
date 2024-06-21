import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(reader.readLine());
 
        writer.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
 
}
