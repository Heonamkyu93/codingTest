import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringTokenizer stz;
        int a =1;
        while(a<=count){
       
             stz=new StringTokenizer(reader.readLine());
            int q=Integer.parseInt(stz.nextToken());
            int w=Integer.parseInt(stz.nextToken());
            System.out.printf("Case #%d: %d + %d = %d%n",a,q,w,q+w);
         a++;
        }
        
        
    }
}