// IntStream.range(0, a).forEach(s -> sb.append('*')); 능숙하게 쓸 수 있게 하기
import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append('*'));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
