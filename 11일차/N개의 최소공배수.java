class Solution {
    public int solution(int[] arr) {
        int temp = gcd(arr[0], arr[1]);
        int answer = arr[0] * arr[1] / temp;
        if(arr.length > 2){
            for(int i = 2; i < arr.length; i++){
                temp = gcd(answer, arr[i]);
                answer = arr[i] * answer / temp;
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
