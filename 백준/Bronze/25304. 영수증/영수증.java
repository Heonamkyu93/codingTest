import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =  sc.nextInt();
        int count = sc.nextInt();
        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum = sum - (price * num);
        }

        if(sum == 0) System.out.println("Yes");
        else System.out.println("No");


    }
}