import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = reader.readLine();
			name[i] = str.substring(0,1)+str.substring(str.length()-1,str.length());	
		}
		reader.close();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);	
		}
		
	}
}