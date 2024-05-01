import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] temp1 = split(s1.toLowerCase());
                String[] temp2 = split(s2.toLowerCase());
                if(temp1[0].compareTo(temp2[0]) > 0) return 1;
                else if(temp1[0].compareTo(temp2[0]) < 0) return -1;
                else {
                    if(toi(temp1[1]) < toi(temp2[1])) return -1;
                    else if(toi(temp1[1]) > toi(temp2[1])) return 1;
                    else return 0;
                }
            }
        });
        return files;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
    public String[] split(String s){
        int size = 0; // 숫자 사이즈
        int start = 0; // 숫자 시작 부분
        boolean mn = false; // 숫자 시작 부분을 찾았나
        String[] temp = new String[3];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); // 문자
            if(Character.isDigit(c)){
                if(!mn) start = i;
                mn = true;
                size++;
            }
            else{
                if(mn) break;
            }
        }
        temp[0] = s.substring(0, start);
        temp[1] = s.substring(start, start + size);
        temp[2] = s.substring(start + size);
        return temp;
    }
}
