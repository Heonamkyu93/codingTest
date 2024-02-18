import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String value = b+"";
        int last=Integer.valueOf(value.substring(2,3));
        int middle=Integer.valueOf(value.substring(1,2));
        int first=Integer.valueOf(value.substring(0,1));
        System.out.println(a*last);
        System.out.println(a*middle);
        System.out.println(a*first);
        
     
        System.out.println(a*b);
        
       
        
    }
}