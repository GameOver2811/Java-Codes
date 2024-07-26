public class CharOccurenceWithoutLoop {
    public static int findOccurence(String str, char ch) {
        String temp = str.replaceAll(Character.toString(ch), "");
        return str.length() - temp.length();
    }
    public static void main(String[] args) {
        String str = "sfksnklsdnklsnf";
        char ch = 's';
        System.out.println("Occurence of "+ ch + " is " + findOccurence(str, ch));
    }
}
