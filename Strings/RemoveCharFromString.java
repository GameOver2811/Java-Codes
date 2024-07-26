public class RemoveCharFromString {
    public static String removeChar(String str, char key) {
        int splitIndx = -1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == key) {
                splitIndx = i;
                break;
            }
        }
        if(splitIndx == -1) {
            return str;
        }
        return str.substring(0, splitIndx) + str.substring(splitIndx + 1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        char key = 'c';
        System.out.println("String without "+ key + " is : "+ removeChar(str, key));
    }
}
