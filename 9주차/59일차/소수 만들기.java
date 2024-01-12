class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }
    public void findPrime(int idx, int sum, int count, int[] nums){
        if(count == 3 && isPrime(sum)){
            answer++;
            return;
        }
        for(int i = idx; i < nums.length; i++){
            findPrime(i + 1, sum + nums[i], count + 1, nums);
        }
    }
    public boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        if((int)sqrt == sqrt) return false;
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
