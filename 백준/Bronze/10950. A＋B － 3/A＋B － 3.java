import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int i=0;i<t;i++){
        String[] a = reader.readLine().split(" ");
            int q = Integer.parseInt(a[0]);
            int w = Integer.parseInt(a[1]);
            System.out.println(q+w);
        }
    }
}