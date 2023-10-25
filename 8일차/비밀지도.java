// 복습. 차후 다시 할것
// String.format("%" + n + "s", temp);
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < arr1.length; i++){
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            temp = String.format("%" + n + "s", temp);
            temp = temp.replace("0", " ");
            temp = temp.replace("1", "#");
            answer[i] = temp;
        }
        return answer;
    }
}
