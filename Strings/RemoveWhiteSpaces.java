public class RemoveWhiteSpaces {
    public static String remove(String str) {
        String ansString = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                ansString += str.charAt(i);
            }
        }
        return ansString;
    }
    public static void main(String[] args) {
        String str = "   this is an example      of whitespace   removal  from any string   ";
        System.out.println("Before : "+ str);
        System.out.println("After Removing whitespaces : " + remove(str));
    }
}
