public class tom {
    public static void main(String[]args) {
        String str = "apples", newStr = "";
        char a = 'a', b = 'p';
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                newStr += 'p';
            } else if(str.charAt(i) == 'p') {
                newStr += 'a';
            } else {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
