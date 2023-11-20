class Solution {
    public int solution(int[] arr) {
        int answer = arr[0] * arr[1];
        answer /= gcd(arr[0], arr[1]);
        if(arr.length > 2){
            for(int i = 2; i < arr.length; i++){
                answer /= gcd(answer, arr[i]);
                answer *= arr[i];
            }
        }
        return answer;
    }
    public int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        return gcd(b, r);
    }
}
