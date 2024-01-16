import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<String> st = new Stack<>();
        for(String i : s.split("")){
            if(!st.isEmpty()){
                if(st.peek().equals(i)) st.pop();
                else st.push(i);
            } else st.push(i);
        }
        int answer = st.isEmpty() ? 1 : 0;
        return answer;
    }
}
