class Solution {
    public int solution(String dartResult) {
        int idx = 0; // n의 index
        String str = "";
        int[] n = new int[3];
        for(String dart : dartResult.split("")){
            if(dart.equals("*")
            || dart.equals("#")){
                if(dart.equals("*")){
                    if(idx >= 2) n[idx - 2] *= 2;
                    n[idx - 1] *= 2;
                }
                else n[idx - 1] *= -1;
            }
            else if(dart.equals("S")
                 || dart.equals("D")
                 || dart.equals("T")){
                int num = Integer.parseInt(str);
                if(dart.equals("S")) n[idx++] = num;
                else if(dart.equals("D")) n[idx++] = (int)Math.pow(num, 2);
                else n[idx++] = (int)Math.pow(num, 3);
                str = "";
            }
            else str += dart;
        }
        return n[0] + n[1] + n[2];
    }
}
