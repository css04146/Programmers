import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = toi(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n / 4; i++) sb.append("long ");
		sb.append("int");
		
		System.out.println(sb.toString());
	}
	
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
