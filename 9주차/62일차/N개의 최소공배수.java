class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        if(len == 0) return arr[0];
        int answer = arr[0] * arr[1] / gcd(arr[0], arr[1]);
        for(int i = 2; i < len; i++){
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }
    public int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        return gcd(b, r);
    }
}
