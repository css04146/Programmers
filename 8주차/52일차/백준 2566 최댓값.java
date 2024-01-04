import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Test {
    
    public static void main(String args[]) throws IOException {
    	int x = 0;
    	int y = 0;
    	int max = Integer.MIN_VALUE;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	for(int i = 0; i < 9; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < 9; j++) {
    			int temp = Integer.parseInt(st.nextToken());
    			if(max < temp) {
    				max = temp;
    				x = i + 1;
    				y = j + 1;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.println(x + " " + y);
    } 
}
