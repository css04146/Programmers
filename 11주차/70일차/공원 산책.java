class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int[] answer = new int[2];
        for(int i = 0 ; i < height; i++){
            if(park[i].contains("S")){
                int idx = park[i].indexOf('S');
                answer[0] = i;
                answer[1] = idx;
                break;
            }
        }
        for(String route : routes){
            String[] temp = route.split(" ");
            String direction = temp[0];
            int distance = Integer.parseInt(temp[1]);
            boolean isBlock = false;
            switch(direction){
                case "E" :
                    if(answer[1] + distance >= width) continue;
                    for(int i = 1; i <= distance; i++){
                        if(park[answer[0]].charAt(answer[1] + i) == 'X'){
                            isBlock = true;
                        }
                    }
                    if(!isBlock) answer[1] += distance;
                    break;
                case "W" :
                    if(answer[1] - distance < 0) continue;
                    for(int i = 1; i <= distance; i++){
                        if(park[answer[0]].charAt(answer[1] - i) == 'X'){
                            isBlock = true;
                        }
                    }
                    if(!isBlock) answer[1] -= distance;
                    break;
                case "S" :
                    if(answer[0] + distance >= height) continue;
                    for(int i = 1; i <= distance; i++){
                        if(park[answer[0] + i].charAt(answer[1]) == 'X'){
                            isBlock = true;
                        }
                    }
                    if(!isBlock) answer[0] += distance;
                    break;
                case "N" :
                    if(answer[0] - distance < 0) continue;
                    for(int i = 1; i <= distance; i++){
                        if(park[answer[0] - i].charAt(answer[1]) == 'X'){
                            isBlock = true;
                        }
                    }
                    if(!isBlock) answer[0] -= distance;
                    break;
            }
        }
        return answer;
    }
}
