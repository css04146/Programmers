// 복습 요
// 백준 10451
// https://www.acmicpc.net/problem/10451
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test{
	static int answer = 0;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			int[] arr = new int[M + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= M; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			visit = new boolean[M + 1];
			int count = 0;
			
			for(int j = 1; j <= M; j++) {
				if(!visit[j]) {
					int next = arr[j]; // 찾을 숫자
					visit[j] = true;
					
					while(true) {
						if(visit[next]) {
							count++;
							break;
						}
						visit[next] = true;
						next = arr[next];
					}
				}
			}
			System.out.println(count);
		}
	}
}
