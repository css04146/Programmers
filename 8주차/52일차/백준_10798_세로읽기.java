import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Test {
    
    public static void main(String args[]) throws IOException {
    	char[][] c = new char[5][15];
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	for(int i = 0; i < 5; i++) {
    		String temp = br.readLine();
    		for(int j = 0; j < temp.length(); j++) {
    			c[i][j] = temp.charAt(j);
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < 15; i++) {
    		for(int j = 0; j < 5; j++) {
    			if(c[j][i] == '\0') continue;
    			else sb.append(c[j][i]);
    		}
    	}
    	System.out.println(sb.toString());
    }
}
