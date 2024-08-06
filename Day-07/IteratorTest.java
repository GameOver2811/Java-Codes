import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hii");

        Iterator<String> iterator = arr.iterator();

        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
