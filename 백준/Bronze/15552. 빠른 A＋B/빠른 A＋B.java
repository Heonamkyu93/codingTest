import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        while(0<a){
             String line = reader.readLine();
            String[] tokens = line.split(" ");
            int q = Integer.parseInt(tokens[0]);
            int w = Integer.parseInt(tokens[1]);
             writer.write((q + w) + "\n"); 
            a-=1;
        }
          writer.flush(); 
        writer.close(); 
        reader.close();
    }
}