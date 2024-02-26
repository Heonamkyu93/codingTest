import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(reader.readLine());
        int idx=1;
        while(idx<=a){
            String[] g =reader.readLine().split(" ");
            
            int q=Integer.parseInt(g[0]);
            int w=Integer.parseInt(g[1]);
            
             writer.write("Case #" + idx + ": " + (q + w) + "\n");
            idx+=1;
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}