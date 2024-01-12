class Solution {
    public int solution(String dartResult) {
        int idx = 0;
        int answer = 0;
        String str = "";
        int[] dart = new int[3];
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)) str += c;
            else if(c == 'S' || c == 'D' || c == 'T'){
                dart[idx++] = Integer.parseInt(str);
                int temp = dart[idx - 1];
                str = "";
                if(c == 'S') continue;
                else if(c == 'D') dart[idx - 1] = (int)Math.pow(temp, 2);
                else dart[idx - 1] = (int)Math.pow(temp, 3);
            } else{
                if(c == '*'){
                    if(idx > 1) dart[idx - 2] *= 2;
                    dart[idx - 1] *= 2;
                } else dart[idx - 1] *= -1;
            }
        }
        return dart[0] + dart[1] + dart[2];
    }
}
