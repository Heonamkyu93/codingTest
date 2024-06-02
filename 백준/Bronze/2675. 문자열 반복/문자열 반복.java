import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int tes = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < tes; i++) {
	
			String[] str = reader.readLine().split(" ");	
			
			int ra = Integer.parseInt(str[0]);	
			String sa = str[1];
			
			for(int j = 0; j < sa.length(); j++) {
				for(int k = 0; k < ra; k++) {
					System.out.print(sa.charAt(j));
				}
			}
			System.out.println();
		}
	}
 
 
}