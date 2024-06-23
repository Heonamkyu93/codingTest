import java.io.*;

public class Main {
    public static void main(String[] rgs) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        char arr[][] = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                writer.write(String.valueOf(arr[i][j]));
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}