import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
           
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        reader.close();
        
        int count =1;
        int start =1;
        int end =1;
        int sum = 1;
        while(start<value/2+1){
            if(sum==value){
                count++;
                end++;sum+=end;
            }else if(sum>value){
                sum-=start;
                start++;
            }else{
                 end++;sum+=end;
            }
        }
        System.out.print(count);
        
        
    }
}