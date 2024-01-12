import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i : ingredient){
            st.push(i);
            if(st.size() >= 4){
                if(st.get(st.size() - 1) == 1){
                    if(st.get(st.size() - 2) == 3){
                        if(st.get(st.size() - 3) == 2){
                            if(st.get(st.size() - 4) == 1){
                                answer++;
                                st.pop();
                                st.pop();
                                st.pop();
                                st.pop();
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
