// 복습이지만 다시 할 것
// hm을 복사 후 값을 빼는 방식으로 다시 시도해볼 것
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int wlen = want.length; // want의 길이
        int len = 0; // number 안 숫자의 합
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < wlen; i++){
            hm.put(want[i], number[i]);
            len += number[i];
        }
        for(int i = 0; i <= discount.length - len; i++){
            boolean istrue = true; //  hidx와 맞는지 여부
            Map<String, Integer> hidx = new HashMap<>();
            for(int j = i; j < i + len; j++){
                String temp = discount[j];
                hidx.put(temp, hidx.getOrDefault(temp, 0) + 1);
            }
            for(String key : hidx.keySet()){
                if(hidx.get(key) != hm.get(key)) istrue = false;
            }
            if(istrue) answer++;
        }
        return answer;
    }
}
