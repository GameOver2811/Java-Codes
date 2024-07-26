import java.util.HashMap;

public class OccurenceOfCharacter {
    public static void printOccurence(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println("Frequency of all Char : ");
        for(Character i : freq.keySet()) {
            System.out.println(i + " -----> "+ freq.get(i));
        }
    }
    public static void duplicateChar(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println("Duplicate Char : ");
        for(Character i : freq.keySet()) {
            if(freq.get(i) > 1)
                System.out.println(i + " -----> "+ freq.get(i));
        }
    }
    public static void main(String[] args) {
        String str = "sdhdfbdskjfbskjfnakjb";
        printOccurence(str);
        duplicateChar(str);
    }
}
