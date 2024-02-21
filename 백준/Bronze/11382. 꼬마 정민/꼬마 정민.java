import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(reader.readLine());

        long a = Long.parseLong(stz.nextToken());
       
        long b = Long.parseLong(stz.nextToken());
       
        long c = Long.parseLong(stz.nextToken());
        System.out.println(a+b+c);
    }
}