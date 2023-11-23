import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        for(int[] d : data){
            if(ext.equals("code")){
                if(d[0] < val_ext) list.add(d);
            } else if(ext.equals("date")){
                if(d[1] < val_ext) list.add(d);
            } else if(ext.equals("maximum")){
                if(d[2] < val_ext) list.add(d);
            } else{
                if(d[3] < val_ext) list.add(d);
            }
        }
        if(sort_by.equals("code")){
            list.sort((o1, o2) -> o1[0] - o2[0]);
        } else if(sort_by.equals("date")){
            list.sort((o1, o2) -> o1[1] - o2[1]);
        } else if(sort_by.equals("maximum")){
            list.sort((o1, o2) -> o1[2] - o2[2]);
        } else{
            list.sort((o1, o2) -> o1[3] - o2[3]);
        }
        int[][] answer = new int[list.size()][data[0].length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
