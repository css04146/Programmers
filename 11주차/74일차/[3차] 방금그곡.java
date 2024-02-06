class Solution {
    public String solution(String m, String[] musicinfos) {
        int maxPlayTime = -1;
        String answer = "";
        m = changeMelody(m);
        int len = m.length();
        for(String musicinfo : musicinfos){
            StringBuilder sb = new StringBuilder();
            String[] temp = musicinfo.split("\\,");
            int time = getTime(temp[0], temp[1]);
            temp[3] = changeMelody(temp[3]);
            int i = time / temp[3].length();
            int j = time % temp[3].length();
            while(i --> 0) sb.append(temp[3]);
            sb.append(temp[3].substring(0, j));
            if(sb.toString().contains(m) && time > maxPlayTime){
                maxPlayTime = time;
                answer = temp[2];
            }
        }
        return maxPlayTime == -1 ? "(None)" : answer;
    }
    public String changeMelody(String s){
        s = s.replaceAll("C#", "H");
        s = s.replaceAll("D#", "I");
        s = s.replaceAll("F#", "J");
        s = s.replaceAll("G#", "K");
        s = s.replaceAll("A#", "L");
        return s;
    }
    public int getTime(String s1, String s2){
        String[] temp1 = s1.split("\\:");
        String[] temp2 = s2.split("\\:");
        int t1 = toi(temp1[0]) * 60 + toi(temp1[1]);
        int t2 = toi(temp2[0]) * 60 + toi(temp2[1]);
        return t2 - t1;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
