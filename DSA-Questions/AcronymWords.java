import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcronymWords {

    public static boolean isAcronym(List<String> words, String s) {

        if(words.size() != s.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(new String[]{"alice", "bob", "charlie"}));
        String s = "abc";
        System.out.println(isAcronym(words, s));
    }
}
