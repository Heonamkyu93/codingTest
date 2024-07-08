import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        reader.close();
        
        long A = Long.parseLong(st.nextToken()); 
        long B = Long.parseLong(st.nextToken()); 
        long V = Long.parseLong(st.nextToken()); 

        long day = A - B; 
        long goal = V -B; 
        
        
        if(goal%day != 0){ 
            System.out.println(goal/day + 1);
        }else{ 
            System.out.println(goal/day);
        }

    }
}