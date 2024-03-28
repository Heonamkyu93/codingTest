import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] q=a.split("");
        String answer="";
        for(String w:q){
            if(w.equals(w.toUpperCase())) {answer+=w.toLowerCase(); continue;}
            answer+=w.toUpperCase();
        }
        System.out.print(answer);
    }
}