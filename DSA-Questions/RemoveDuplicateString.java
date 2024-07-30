import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static  String removeDuplicates(String str) {
        Set<Character> ch = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!ch.contains(str.charAt(i))) {
                ch.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaDgergDerge"));
    }
}
