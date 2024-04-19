import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
   
    static int[] count = new int[4];
   
    static int[] min = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(br.readLine());

   
        int S = Integer.parseInt(line.nextToken());
        int P = Integer.parseInt(line.nextToken());

   
        char[] dnas = br.readLine().toCharArray();

   
        line = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i ++) {
            min[i] = Integer.parseInt(line.nextToken());
        }

   
        for(int i = 0; i < P - 1; i++) {
            add(dnas[i]);
        }

   
        int start=0, end=P-1, answer=0;

   
        while(end < S) {
   
            add(dnas[end]);
            
   
            if(isValidPassword()) answer++;
            
   
            remove(dnas[start]);
            
   
            start++;
            end++;
        }

   
        System.out.println(answer);
    }

    private static void add(char c) {
        switch(c) {
            case 'A': {
                count[0]++;
                break;
            }
            case 'C':  {
                count[1]++;
                break;
            }
            case 'G':  {
                count[2]++;
                break;
            }
            case 'T':   {
                count[3]++;
                break;
            }
        }
    }

    private static void remove(char c) {
        switch(c) {
            case 'A': {
                count[0]--;
                break;
            }
            case 'C':  {
                count[1]--;
                break;
            }
            case 'G':  {
                count[2]--;
                break;
            }
            case 'T':   {
                count[3]--;
                break;
            }
        }
    }

    private static boolean isValidPassword() {
        return IntStream.range(0, 4)
                .allMatch(i -> count[i] >= min[i]);
    }
}