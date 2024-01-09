import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String ars[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = toi(st.nextToken());
		int m = toi(st.nextToken());
		int[] arr = new int[n];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = toi(st.nextToken());
			int b = toi(st.nextToken());
			int c = toi(st.nextToken());
			for(int j = a - 1; j < b; j++) {
				arr[j] = c;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) sb.append(a + " ");
		
		System.out.println(sb.toString());
	}
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
