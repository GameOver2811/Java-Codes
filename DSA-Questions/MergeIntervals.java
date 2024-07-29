import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Sort the intervals by their starting points
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Create a list to hold the merged intervals
        List<List<Integer>> ans = new ArrayList<>();

        // Add the first interval to the list
        ans.add(new ArrayList<>(Arrays.asList(intervals[0][0], intervals[0][1])));

        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval in the ans list
            List<Integer> lastInterval = ans.get(ans.size() - 1);

            // If the current interval overlaps with the last interval, merge them
            if (intervals[i][0] <= lastInterval.get(1)) {
                lastInterval.set(1, Math.max(lastInterval.get(1), intervals[i][1]));
            } else {
                // If they don't overlap, add the current interval to the list
                ans.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
        }

        // Convert the list of lists to a 2D array
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
    public static void main(String[] agrs) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(intervals);
        for(int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }

}
