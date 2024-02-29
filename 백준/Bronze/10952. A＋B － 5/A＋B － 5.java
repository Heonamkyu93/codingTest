import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b;
        while (true) {
            String[] in = reader.readLine().split(" ");
            a = Integer.parseInt(in[0]);
            b = Integer.parseInt(in[1]);
            if (a == 0 && b == 0) break; // 입력의 마지막에 0이 입력되면 종료
            writer.write(String.valueOf(a + b) + "\n");
        }
        
        writer.flush(); // BufferedWriter의 버퍼에 남아있는 데이터를 출력
        writer.close(); // writer를 닫음
    }
}
