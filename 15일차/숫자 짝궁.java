class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] x = new int[10];
        int[] y = new int[10];
        
        for(String xs : X.split("")) x[Integer.parseInt(xs)]++;
        for(String ys : Y.split("")) y[Integer.parseInt(ys)]++;
        
        for(int i = 9; i >= 0; i--){
            while(x[i] > 0 && y[i] > 0){
                x[i]--; y[i]--;
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        if(answer.equals("")){
            return "-1";
        }
        answer = answer.replace("0", "").equals("") ? "0" : answer;
        return answer;
    }
}
