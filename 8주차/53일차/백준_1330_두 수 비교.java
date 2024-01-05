package Main;

import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = toi(st.nextToken());
		int b = toi(st.nextToken());
		br.close();/*
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();*/
		System.out.println(a < b ? "<" : (a == b ? "==" : ">"));
	}
	public static int toi(String s) {
		return Integer.parseInt(s);
	}
}
