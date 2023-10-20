// 무조건 복습해야됨
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] temp1 = split(s1);
                String[] temp2 = split(s2);
                if(temp1[0].toLowerCase().compareTo(temp2[0].toLowerCase()) < 0) return -1;
                else if(temp1[0].toLowerCase().compareTo(temp2[0].toLowerCase()) > 0) return 1;
                else{
                    if(Integer.parseInt(temp1[1]) > Integer.parseInt(temp2[1])){
                        return 1;
                    }else if(Integer.parseInt(temp1[1]) < Integer.parseInt(temp2[1])){
                        return -1;
                    }else{
                        return 0;
                }
            }
            }
        });
        return files;
    }
    public String[] split(String s){
        int size = 0;
        int nstart = -1;
        int nend = -1;
        boolean first = true;
        String[] temp = new String[3];
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
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
        nend = nstart + size;
        temp[0] = s.substring(0, nstart);
        temp[1] = s.substring(nstart, nend);
        temp[2] = s.substring(nend);
        return temp;
    }
}
