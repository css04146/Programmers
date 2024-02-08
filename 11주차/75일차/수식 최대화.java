import java.util.List;
import java.util.ArrayList;
class Solution {
    long answer = 0;    
    public long solution(String expression) {
        String temp = "";
        List<Long> n = new ArrayList<>();
        List<Character> o = new ArrayList<>();
        for(char c : expression.toCharArray()){
            if(!Character.isDigit(c)){
                long i = tol(temp);
                n.add(i);
                o.add(c);
                temp = "";
            } else temp += c;
        }
        n.add(tol(temp));
        findNumber(n, o);
        return answer;
    }
    public void findNumber(List<Long> l1, List<Character> l2){
        if(l1.size() == 1){
            long n = (long)(Math.abs(l1.get(0)));
            answer = Math.max(answer, n);
            return;
        }
        for(int idx = 0; idx < 3; idx++){
            if(idx == 0){ // idx가 0일 때는 '*' 처리
                List<Long> list1 = new ArrayList<>(l1);
                List<Character> list2 = new ArrayList<>(l2);
                if(list2.contains('*')){
                    for(int i = 0; i < list2.size(); i++){
                        if(list2.get(i) == '*'){
                            long num1 = list1.get(i);
                            long num2 = list1.get(i + 1);
                            list1.remove(i);
                            list1.remove(i);
                            list1.add(i, num1 * num2);
                            list2.remove(i);
                            i--;
                        }
                    }
                    findNumber(list1, list2);
                }
            } else if(idx == 1){ // idx가 1일 때는 '+' 처리
                List<Long> list1 = new ArrayList<>(l1);
                List<Character> list2 = new ArrayList<>(l2);
                if(list2.contains('+')){
                    for(int i = 0; i < list2.size(); i++){
                        if(list2.get(i) == '+'){
                            long num1 = list1.get(i);
                            long num2 = list1.get(i + 1);
                            list1.remove(i);
                            list1.remove(i);
                            list1.add(i, num1 + num2);
                            list2.remove(i);
                            i--;
                        }
                    }
                    findNumber(list1, list2);
                }
            } else{ // idx가 2일 때는 '-' 처리
                List<Long> list1 = new ArrayList<>(l1);
                List<Character> list2 = new ArrayList<>(l2);
                if(list2.contains('-')){
                    for(int i = 0; i < list2.size(); i++){
                        if(list2.get(i) == '-'){
                            long num1 = list1.get(i);
                            long num2 = list1.get(i + 1);
                            list1.remove(i);
                            list1.remove(i);
                            list1.add(i, num1 - num2);
                            list2.remove(i);
                            i--;
                        }
                    }
                    findNumber(list1, list2);
                }
            }
        }
        
    }
    public long tol(String s){
        return Long.parseLong(s);
    }
}
