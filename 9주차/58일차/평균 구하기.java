class Solution {
    public double solution(int[] arr) {
        double answer = sum(arr);
        return answer / arr.length;
    }
    public double sum(int[] arr){
        double sum = 0;
        for(int i : arr) sum += i;
        return sum;
    }
}
