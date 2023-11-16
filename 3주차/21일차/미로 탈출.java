import java.util.Queue;
import java.util.LinkedList;
class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(String[] maps) {
        int answer = 0;
        
        int lx = -1, ly = -1; // 레버의 x, y 좌표
        int sx = -1, sy = -1; // 시작 지점의 x, y 좌표
        int ex = -1, ey = -1; // 종료 지점의 x, y 좌표
        
        int height = maps.length; // 높이
        int width = maps[0].length(); // 너비
        
        int[][] arr = new int[height][width];
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[i].length(); j++){
                if(maps[i].charAt(j) == 'S'){ sx = j; sy = i; }
                else if(maps[i].charAt(j) == 'L'){ lx = j; ly = i; }
                else if(maps[i].charAt(j) == 'E'){ ex = j; ey = i; }
            }
        }
        
        if(sx == ex && sy == ey) return 0;
        
        q.add(new int[]{sx, sy});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int px = temp[0]; // 과거의 x좌표
            int py = temp[1]; // 과거의 y좌표
            
            for(int i = 0; i < 4; i++){
                int cx = px + dx[i];
                int cy = py + dy[i];
                
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                
                if(arr[cy][cx] == 0 && maps[cy].charAt(cx) != 'X'){
                    arr[cy][cx] = arr[py][px] + 1;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        
        if(arr[ly][lx] == 0) return -1;
        int t = arr[ly][lx];
        arr = new int[height][width];
        arr[ly][lx] = t;
        q.add(new int[]{lx, ly});
        
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int px = temp[0]; // 과거의 x좌표
            int py = temp[1]; // 과거의 y좌표
            
            for(int i = 0; i < 4; i++){
                int cx = px + dx[i];
                int cy = py + dy[i];
                
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                
                if(arr[cy][cx] == 0 && maps[cy].charAt(cx) != 'X'){
                    arr[cy][cx] = arr[py][px] + 1;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        return arr[ey][ex] == 0 ? -1 : arr[ey][ex];
    }
}

/* eclipse 돌려보기 위한 code
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test{
	static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String[] maps = new String[N];
		for(int i = 0; i < N; i++) {
			String t = br.readLine();
			maps[i] = t;
		}
	
		int answer = 0;
        
        int lx = -1, ly = -1; // 레버의 x, y 좌표
        int sx = -1, sy = -1; // 시작 지점의 x, y 좌표
        int ex = -1, ey = -1; // 종료 지점의 x, y 좌표
        
        int height = maps.length; // 높이
        int width = maps[0].length(); // 너비
        
        int[][] arr = new int[height][width];
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[i].length(); j++){
                if(maps[i].charAt(j) == 'S'){ sx = j; sy = i; }
                else if(maps[i].charAt(j) == 'L'){ lx = j; ly = i; }
                else if(maps[i].charAt(j) == 'E'){ ex = j; ey = i; }
            }
        }
        
        q.add(new int[]{sx, sy});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int px = temp[0]; // 과거의 x좌표
            int py = temp[1]; // 과거의 y좌표
            
            for(int i = 0; i < 4; i++){
                int cx = px + dx[i];
                int cy = py + dy[i];
                
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                
                if(arr[cy][cx] == 0 && maps[cy].charAt(cx) != 'X'){
                    arr[cy][cx] = arr[py][px] + 1;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        int t = arr[ly][lx];
        arr = new int[height][width];
        arr[ly][lx] = t;
        q.add(new int[]{lx, ly});
        
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int px = temp[0]; // 과거의 x좌표
            int py = temp[1]; // 과거의 y좌표
            
            for(int i = 0; i < 4; i++){
                int cx = px + dx[i];
                int cy = py + dy[i];
                
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                
                if(arr[cy][cx] == 0 && maps[cy].charAt(cx) != 'X'){
                    arr[cy][cx] = arr[py][px] + 1;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < M; j++) {
        		System.out.printf("%3d", arr[i][j]);
        	}
        	System.out.println();
        }
    }
}
*/
/*
5
5
SOOOL
XXXXO
OOOOO
OXXXX
OOOOE
*/
// elcipse용 테스트케이스
