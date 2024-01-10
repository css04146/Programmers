import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = toi(st.nextToken());
    	int m = toi(st.nextToken());
    	
    	long[] arr = new long[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = i + 1;
    	}
    	
    	for(int i = 0; i < m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = toi(st.nextToken()) - 1;
    		int b = toi(st.nextToken()) - 1;
    		long temp = arr[a];
    		arr[a] = arr[b];
    		arr[b] = temp;
    	}
    	
    	for(int i = 0; i < n; i++) {
    		System.out.print(arr[i] + " ");
    	}
    }
    public static int toi(String s) {
    	return Integer.parseInt(s);
    }
}
