import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] temp1 = split(s1.toUpperCase());
                String[] temp2 = split(s2.toUpperCase());
                if(temp1[0].compareTo(temp2[0]) > 0) return 1;
                else if(temp1[0].compareTo(temp2[0]) < 0) return -1;
                else{
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
        int size = 0;
        int n_start = 0;
        boolean first = true;
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(Character.isDigit(s.charAt(i))){
                if(first){
                    n_start = i;
                    first = false;
                }
                size++;
            }
            else{
                if(!first) break;
            }
        }
        int n_end = n_start + size;
        String[] temp = new String[3];
        temp[0] = s.substring(0, n_start);
        temp[1] = s.substring(n_start, n_end);
        temp[2] = s.substring(n_end);
        return temp;
    }
}
