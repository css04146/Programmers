class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = array_gcd(arrayA);
        int gcdB = array_gcd(arrayB);
        if(possibility_gcd(gcdA, arrayB)) answer = Math.max(gcdA, answer);
        if(possibility_gcd(gcdB, arrayA)) answer = Math.max(gcdB, answer);
        return answer;
    }
    public boolean possibility_gcd(int a, int[] b){
        boolean flag = true;
        for(int i : b){
            if(i % a == 0){
                return false;
            }
        }
        return flag;
    }
    public int array_gcd(int[] arr){
        if(arr.length > 1){
            int temp = -1;
            temp = gcd(arr[0], arr[1]);
            for(int i = 1; i < arr.length; i++) temp = gcd(arr[i], temp);
            return temp;
        } else return arr[0];
    }
    public int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        return gcd(b, r);
    }
}
