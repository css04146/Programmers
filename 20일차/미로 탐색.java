// q를 안쓰면 최단거리가 나오지 않음.
// 백준 2178
// https://www.acmicpc.net/problem/2178
import java.io.*;
import java.util.*;

public class Test {
	static int N, M;
	static int[][] arr;
	static boolean[][] visit;
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken()); // y축
    	M = Integer.parseInt(st.nextToken()); // x축
    	visit = new boolean[N][M];
    	arr = new int[N][M];
    	
    	for(int i = 0; i < N; i++) {
    		String temp = br.readLine();
    		for(int j = 0; j < M; j++) {
    			arr[i][j] = temp.charAt(j) - '0';
    		}
    	}
    	
    	dfs(0, 0);
    	/*
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < N; i++) {
    		for(int j = 0; j < M; j++) {
    			sb.append(arr[i][j] + " ");
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb.toString());*/
    	System.out.println(arr[N - 1][M - 1]);
    }
    
    static void dfs(int x, int y) {
    	Queue<int[]> q = new LinkedList<>();
    	q.add(new int[] {x, y});
    	while(!q.isEmpty()) {
    		int[] temp = q.poll();
    		int nowX = temp[0];
    		int nowY = temp[1];
    		for(int i = 0; i < 4; i++) {
        		int cx = nowX + dx[i];
        		int cy = nowY + dy[i];
        		if(cx >= N || cx < 0
        		|| cy >= M || cy < 0) continue;
        		if(arr[cx][cy] == 1 && !visit[cx][cy]) {
        			arr[cx][cy] += arr[nowX][nowY];
        			visit[x][y] = true;
        			q.add(new int[] {cx, cy});
        		}
        	}
    	}
    }
}
