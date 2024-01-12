class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(String s : X.split("")) arr1[Integer.parseInt(s)]++;
        for(String s : Y.split("")) arr2[Integer.parseInt(s)]++;
        for(int i = 9; i >= 0; i--){
            int len = Math.min(arr1[i], arr2[i]);
            for(int j = 0; j < len; j++) sb.append(i);
        }
        String answer = sb.toString();
        if(answer.startsWith("0")) return "0";
        if(answer.length() == 0) return "-1";
        return answer;
    }
}
