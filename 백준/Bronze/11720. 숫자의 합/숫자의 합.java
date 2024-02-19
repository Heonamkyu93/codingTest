import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
        String value = sc.next();
        
       char[]cNum=value.toCharArray();
        int sum=0;
        for(int i=0;i<cNum.length;i++){
            sum+=cNum[i]- '0' ;
        }
        System.out.print(sum);
    
    
    }
}
