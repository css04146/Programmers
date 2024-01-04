import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String args[]) throws IOException {
    	InputStream in = System.in;
    	InputStreamReader reader = new InputStreamReader(in);
    	BufferedReader br = new BufferedReader(reader);
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int[][] arr1 = new int[a][b];
    	int[][] arr2 = new int[a][b];
    	
    	for(int i = 0; i < a; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < b; j++) arr1[i][j] = Integer.parseInt(st.nextToken()); 
    	}
    	
    	for(int i = 0; i < a; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < b; j++) arr2[i][j] = Integer.parseInt(st.nextToken()); 
    	}
    	
    	for(int i = 0; i < a; i++) {
    		for(int j = 0; j < b; j++) {
    			System.out.print(arr1[i][j] + arr2[i][j]);
    			if(j != b - 1) System.out.print(" ");
    		}
    		System.out.println();
    	}
    } 
}
