// 복습 요
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                s1 = s1.toLowerCase();
                s2 = s2.toLowerCase();
                String[] temp1 = split(s1);
                String[] temp2 = split(s2);
                if(temp1[0].compareTo(temp2[0]) > 0) return 1;
                else if(temp1[0].compareTo(temp2[0]) < 0) return -1;
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
        int size = 0;
        int nstart = -1;
        int len = s.length();
        boolean first = true;
        String[] temp = new String[3];
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
        temp[0] = s.substring(0, nstart);
        temp[1] = s.substring(nstart, nend);
        temp[2] = s.substring(nend);
        return temp;
    }
}
