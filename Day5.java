package Data_structure_StudyPlan;

public class Day5 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String ransomnote = "a",magazine = "b";
        System.out.println(Q383(ransomnote,magazine));

        String sc = "anagram", t = "nagaram";
        System.out.println(Q242(s,t));
    }

    private static boolean Q242(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

    private static boolean Q383(String s1, String s2) {
        int[] alphabet = new int[26];
        for (Character c : s2.toCharArray()){
            alphabet[c-'a']++;
        }
        for (Character ch : s2.toCharArray()){
            if (alphabet[ch-'a'] == 0) return false;
            alphabet[ch-'a']--;
        }
        return true;
    }

    public static int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
