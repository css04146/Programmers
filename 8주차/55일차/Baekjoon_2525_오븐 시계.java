import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = toi(st.nextToken());
		int minute = toi(st.nextToken());
		
		int n = toi(br.readLine());
		int time = hour * 60 + minute;
		
		time += n;
		time = time >= 1440 ? time - 1440 : time;
		
		hour = time / 60;
		minute = time % 60;
		
		br.close();
		System.out.println(hour + " " + minute);
	}
	
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
