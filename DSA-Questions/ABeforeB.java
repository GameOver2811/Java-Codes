// Question : Return true if all a's are before all b's else return false.

public class ABeforeB {
    public static void main(String[] args) {
        String str = "aaaabbabbb";
        int a = 0, A = 0;
        boolean b = false;
        for(int i = 0; i < str.length(); i++) {
            if(!b && str.charAt(i) == 'a'){
                a++;
                A++;
            }
            else if(str.charAt(i) == 'a')
                A++;
            else
                b = true;
        }
        System.out.println(a == A);
    }
}
