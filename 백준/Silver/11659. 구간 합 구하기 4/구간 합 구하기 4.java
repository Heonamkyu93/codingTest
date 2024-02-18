import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer stz = new StringTokenizer(reader.readLine());
        int num =Integer.parseInt(stz.nextToken());
         int question =Integer.parseInt(stz.nextToken());
         long[] s =new long[num+1];
         stz = new StringTokenizer(reader.readLine());
        for(int i=1;i<=num;i++){
             
            s[i] = s[i-1] +Integer.parseInt(stz.nextToken());
        }
        for(int j =0 ; j<question;j++){
              stz = new StringTokenizer(reader.readLine());
             int first =Integer.parseInt(stz.nextToken());
             int last =Integer.parseInt(stz.nextToken());
              System.out.println(s[last] - s[first - 1]);
        }
    
    }
}