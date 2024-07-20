import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Read {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        System.out.println(st.countTokens());
        //for(int i=0; i<st.countTokens(); i++){
        while (st.hasMoreTokens()) {
            ans = ans + Integer.parseInt(st.nextToken());
        }

        System.out.println("Sum of all Entered numbers is : "+ans);

        // String [] str  = br.readLine().split(",");

        // System.out.println(Arrays.toString(str));

    }
}