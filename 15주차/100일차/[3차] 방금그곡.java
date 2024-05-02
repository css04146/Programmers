class Solution {
    public String solution(String m, String[] musicinfos) {
        m = changeMelody(m);
        int maxPlayTime = -1;
        String answer = "(None)";
        for(String musicinfo : musicinfos){
            String temp = "";
            musicinfo = changeMelody(musicinfo);
            String[] t = musicinfo.split(",");
            String[] time1 = t[0].split(":");
            String[] time2 = t[1].split(":");
            int t1 = toi(time1[0]) * 60 + toi(time1[1]);
            int t2 = toi(time2[0]) * 60 + toi(time2[1]);
            int tlen = t2 - t1; // 멜로디가 나온 시간
            int len = t[3].length(); // 노래 가사 길이
            int i = tlen / len; // 멜로디 반복 횟수
            int j = tlen % len; // 남는 멜로디 횟수
            while(i --> 0) temp += t[3];
            temp += t[3].substring(0, j);
            if(temp.contains(m) && tlen > maxPlayTime){
                maxPlayTime = tlen;
                answer = t[2];
            }
        }
        return answer;
    }
    public String changeMelody(String s){
        s = s.replace("A#", "H");
        s = s.replace("B#", "M");
        s = s.replace("C#", "I");
        s = s.replace("D#", "J");
        s = s.replace("F#", "K");
        s = s.replace("G#", "L");
        return s;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
