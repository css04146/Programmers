class Solution {
    public String solution(int[] numbers, String hand) {
        String result = "";
        int left = 10, right = 12;
        int leftdis = -1, rightdis = -1;
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                result += "L";
                left = number;
            }
            else if(number == 3 || number == 6 || number == 9){
                result += "R";
                right = number;
            }
            else{
                number = number == 0 ? 11 : number;
                int temp1 = Math.abs(left - number);
                int temp2 = Math.abs(right - number);
                leftdis = temp1 / 3 + temp1 % 3;
                rightdis = temp2 / 3 + temp2 % 3;
                if(leftdis < rightdis){
                    result += "L";
                    left = number;
                } else if(leftdis == rightdis){
                    if(hand.equals("right")){
                        result += "R";
                        right = number;
                    } else{
                        result += "L";
                        left = number;
                    }
                } else{
                    result += "R";
                    right = number;
                }
            }
        }
        return result;
    }
}
