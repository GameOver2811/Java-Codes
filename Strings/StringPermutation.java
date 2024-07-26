import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void permutation(char[] str, ArrayList ds, List<List<Character>> ans, boolean[] flag) {
        if(ds.size() == str.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < str.length; i++) {
            if(!flag[i]) {
                flag[i] = true;
                ds.add(str[i]);
                permutation(str, ds, ans, flag);
                ds.remove(ds.size() - 1);
                flag[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        String str = "abc";

        char[] strChar = str.toCharArray();
        List<List<Character>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] flag = new boolean[strChar.length];
        permutation(strChar, ds, ans, flag);
        System.out.println("All Permutation of "+ str+ " : ");
        for(List<Character> i : ans) {
            for(Character j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
