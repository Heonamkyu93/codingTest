import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        if(value>=90 && value<=100){
            System.out.print("A");
        }else if(value>=80 && value<=89){
            System.out.print("B");
        }else if(value>=70 && value<=79){
            System.out.print("C");
        }else if(value>=60 && value<=69){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}