class Solution {
    public boolean solution(int x) {
        int sum = harshad(x);
        return x % sum == 0 ? true : false;
    }
    public int harshad(int n){
        int temp = 0;
        int[] arr = new StringBuilder().append(n).chars().map(Character::getNumericValue).toArray();
        for(int a : arr) temp += a;
        return temp;
    }
}
