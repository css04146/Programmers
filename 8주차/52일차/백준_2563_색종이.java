// 복습 요망
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Test {
    
    public static void main(String args[]) throws IOException {
    	int total = 0;
    	boolean[][] visit = new boolean[101][101];
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		for(int j = a; j < a + 10; j++) {
    			for(int k = b; k < b + 10; k++) {
    				if(!visit[j][k]) {
    					visit[j][k] = true;
    					total++;
    				}
    			}
    		}
    	}
    	System.out.println(total);
    }
}
