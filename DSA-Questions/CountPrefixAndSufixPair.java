public class CountPrefixAndSufixPair {
    public static boolean isTrue(String a, String b) {
        if((b.startsWith(a)) && (b.endsWith(a))) {
            return true;
        }
        return false;
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(isTrue(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String words[] = {"abab", "ab"};
        int ans = countPrefixSuffixPairs(words);
        System.out.println(ans);
    }
}
