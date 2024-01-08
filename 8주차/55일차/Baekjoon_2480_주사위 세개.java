import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		arr[0] = toi(st.nextToken());
		arr[1] = toi(st.nextToken());
		arr[2] = toi(st.nextToken());
		
		Arrays.sort(arr);
		if(arr[2] == arr[1]) {
			if(arr[1] == arr[0]) System.out.println(10000 + arr[0] * 1000);
			else System.out.println(1000 + arr[1] * 100);
		}
		else {
			if(arr[1] == arr[0]) System.out.println(1000 + arr[1] * 100);
			else System.out.println(arr[2] * 100);
		}
	}
	
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
