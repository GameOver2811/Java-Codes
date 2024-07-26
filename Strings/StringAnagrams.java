import java.util.HashMap;

public class StringAnagrams {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "abbc", s2 = "bcaa";
        System.out.println(isAnagram(s1, s2));
    }
}
