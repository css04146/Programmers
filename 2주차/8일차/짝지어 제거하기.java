import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<String> st = new Stack<>();
        for(String i : s.split("")){
            if(!st.isEmpty() && st.peek().equals(i)) st.pop();
            else st.push(i);
        }
        return st.isEmpty() ? 1 : 0;
    }
}
