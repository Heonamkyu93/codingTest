import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stz.nextToken());
        stz=new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(stz.nextToken());
        
        int[] numbers = new int[n];
        stz=new StringTokenizer(reader.readLine());
        for(int i=0;i<n;i++){
            
            int value=Integer.parseInt(stz.nextToken());
            numbers[i]=value;
        }
        Arrays.sort(numbers);
        int start =0;
        int end = n-1;
        int count = 0;
        
        while(end>start){
            if(numbers[start]+numbers[end]>m){
                end--;
            }else if(numbers[start]+numbers[end]==m){
                count++;start++;end--; 
            }else if(numbers[start]+numbers[end]<m){
               
                start++;
               
            }
        }
        
        System.out.println(count);
        
    } 
}