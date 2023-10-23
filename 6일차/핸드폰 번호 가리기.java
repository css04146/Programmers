class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        phone_number = phone_number.substring(len);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) sb.append('*');
        return sb.toString() + phone_number;
    }
}
