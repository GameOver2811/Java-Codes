import java.util.HashMap;

public class DuplicateWordInString {

    public static void findDuplicateAndOccurence(String[] arr) {

        HashMap<String, Integer> count = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        for(String s : count.keySet()) {
            if(count.get(s) > 1) {
                System.out.println(s + " ----> "+ count.get(s));
            }
        }

    }

    public static void main(String[] args) {
        String str = "Double hai hai hai hai hai hai bhai sab Double hai Double nhi samajh mai aa aa raha kya Double hai";
        String[] arr = str.split(" ");
        findDuplicateAndOccurence(arr);
    }
}
