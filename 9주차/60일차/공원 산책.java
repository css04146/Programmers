class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int[] answer = new int[2];
        int start_x = -1, start_y = -1;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(park[i].charAt(j) == 'S'){
                    start_x = i; // y축
                    start_y = j; // x축
                    break;
                }
            }
        }
        answer[0] = start_x; // y축
        answer[1] = start_y; // x축
        for(String route : routes){
            String[] temp = route.split(" ");
            String dir = temp[0];
            int dis = Integer.parseInt(temp[1]);
            if(dir.equals("E")){
                boolean isBlock = false;
                if(answer[1] + dis >= width) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0]].charAt(answer[1] + i) == 'X'){
                        isBlock = true;
                        break;
                    }
                }
                if(!isBlock) answer[1] += dis;
            }
            else if(dir.equals("W")){
                boolean isBlock = false;
                if(answer[1] - dis < 0) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0]].charAt(answer[1] - i) == 'X'){
                        isBlock = true;
                        break;
                    }
                }
                if(!isBlock) answer[1] -= dis;
            }
            else if(dir.equals("S")){
                boolean isBlock = false;
                if(answer[0] + dis >= height) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0] + i].charAt(answer[1]) == 'X'){
                        isBlock = true;
                        break;
                    }
                }
                if(!isBlock) answer[0] += dis;
            }
            else{
                boolean isBlock = false;
                if(answer[0] - dis < 0) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0] - i].charAt(answer[1]) == 'X'){
                        isBlock = true;
                        break;
                    }
                }
                if(!isBlock) answer[0] -= dis;
            }
        }
        return answer;
    }
}
