import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                s1 = s1.toUpperCase();
                s2 = s2.toUpperCase();
                String[] temp1 = transFiles(s1);
                String[] temp2 = transFiles(s2);
                if(temp1[0].equals(temp2[0])){
                    return toi(temp1[1]) - toi(temp2[1]);
                } else return temp1[0].compareTo(temp2[0]);
            }
        });
        return files;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
    public String[] transFiles(String file){
        int size = 0;
        int start = -1;
        int len = file.length();
        boolean findDigit = false; 
        String[] temp = new String[3];
        for(int i = 0; i < len; i++){
            char c = file.charAt(i);
            if(Character.isDigit(c)){
                if(!findDigit){
                    findDigit = true;
                    start = i;
                }
                size++;
            } else{
                if(findDigit) break;
            }
        }
        temp[0] = file.substring(0, start);
        temp[1] = file.substring(start, start + size);
        temp[2] = file.substring(start + size);
        return temp;
    }
}
