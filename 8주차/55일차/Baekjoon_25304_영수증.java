import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = toi(br.readLine());
		int n = toi(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum -= toi(st.nextToken()) * toi(st.nextToken());
		}
		
		if(sum == 0) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
