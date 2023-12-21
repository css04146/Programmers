// 다른 방법으로 복습 요
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] temp1 = split(s1.toUpperCase());
                String[] temp2 = split(s2.toUpperCase());
                if(temp1[0].compareTo(temp2[0]) < 0) return -1;
                else if(temp1[0].compareTo(temp2[0]) > 0) return 1;
                else{
                    int n1 = Integer.parseInt(temp1[1]);
                    int n2 = Integer.parseInt(temp2[1]);
                    if(n1 < n2) return -1;
                    else if(n1 > n2) return 1;
                    else return 0;
                }
            }
        });
        return files;
    }
    public String[] split(String s){
        int len = s.length();
        boolean first = true;
        int nstart = 0, size = 0;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                if(first){
                    nstart = i;
                    first = false;
                }
                size++;
            }
            else{
                if(!first) break;
            }
        }
        int nend = nstart + size;
        String[] temp = new String[3];
        temp[0] = s.substring(0, nstart);
        temp[1] = s.substring(nstart, nend);
        temp[2] = s.substring(nend);
        return temp;
    }
}
