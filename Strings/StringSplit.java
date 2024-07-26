import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String para = "This is an example of split String";
        System.out.println("We can split string using split method");
        String[] arr = para.split(" ");
        System.out.println("Splited Array : "+Arrays.toString(arr));
    }
}
