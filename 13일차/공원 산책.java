class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int height = park.length;
        int width = park[0].length();
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        for(String route : routes){
            String[] temp = route.split(" ");
            String dir = temp[0];
            int dis = Integer.parseInt(temp[1]);
            boolean isBlock = false;
            if(dir.equals("E")){
                if(answer[1] + dis >= width) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0]].charAt(answer[1] + i) == 'X'){
                        isBlock = true; break;
                    }
                }
                if(!isBlock) answer[1] += dis;
            }
            else if(dir.equals("W")){
                if(answer[1] - dis < 0) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0]].charAt(answer[1] - i) == 'X'){
                        isBlock = true; break;
                    }
                }
                if(!isBlock) answer[1] -= dis;
            }
            else if(dir.equals("S")){
                if(answer[0] + dis >= height) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0] + i].charAt(answer[1]) == 'X'){
                        isBlock = true; break;
                    }
                }
                if(!isBlock) answer[0] += dis;
            }
            else if(dir.equals("N")){
                if(answer[0] - dis < 0) continue;
                for(int i = 1; i <= dis; i++){
                    if(park[answer[0] - i].charAt(answer[1]) == 'X'){
                        isBlock = true; break;
                    }
                }
                if(!isBlock) answer[0] -= dis;
            }
        }
        return answer;
    }
}
