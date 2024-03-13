import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        String result ="";
    
        if(a>0)result="14";
        else result="23";
            
        if(b>0) System.out.print(result.substring(0,1)); 
        else System.out.print(result.substring(1,2)); 
    
    
    }
    
}