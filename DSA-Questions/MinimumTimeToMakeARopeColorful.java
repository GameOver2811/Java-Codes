public class MinimumTimeToMakeARopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int time = 0;
        for (int i = 0; i < colors.length() - 1;) {
            char currentColor = colors.charAt(i);
            int j = i, sum = 0, max = Integer.MIN_VALUE;
            while (j < colors.length() && colors.charAt(j) == currentColor) {
                sum += neededTime[j];
                max = Math.max(max, neededTime[j]);
                j++;
            }
            time += (sum - max);
            i = j;
        }
        return time;
    }
    public static void main(String[] args) {
        String colors = "aabcaa";
        int[] neededTime = {1,2,3,4,5,6};
        System.out.println(minCost(colors, neededTime));
    }
}
