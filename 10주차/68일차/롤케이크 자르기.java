// 복습 요
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> t1 = new HashSet<>();
        Set<Integer> t2 = new HashSet<>();
        int[] topping1 = new int[topping.length];
        int[] topping2 = new int[topping.length + 1];
        for(int i = 0; i < topping.length; i++){
            t1.add(topping[i]);
            topping1[i] = t1.size();
        }
        for(int i = topping.length - 1; i >= 0; i--){
            t2.add(topping[i]);
            topping2[i] = t2.size();
        }
        for(int i = 0; i < topping.length; i++){
            if(topping1[i] == topping2[i + 1]) answer++;
        }
        return answer;
    }
}
//
import java.util.*;

class Solution {
     public static int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < topping.length; i++){
            set1.add(topping[i]);
            list1.add(set1.size());
        }
        for(int i = topping.length - 1; i >= 0; i--){
            set2.add(topping[i]);
            list2.add(set2.size());
        }
        Collections.reverse(list2);
        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i).equals(list2.get(i + 1))) answer++;
        }
        return answer;
    }
}
//
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> t1 = new HashSet<>();
        Set<Integer> t2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < topping.length; i++){
            t1.add(topping[i]);
            list1.add(t1.size());
        }
        for(int i = topping.length - 1; i >= 0; i--){
            t2.add(topping[i]);
            list2.add(t2.size());
        }
        Collections.reverse(list2);
        for(int i = 0; i < topping.length - 1; i++){
            if(list1.get(i).equals(list2.get(i + 1))) answer++;
        }
        return answer;
    }
}
