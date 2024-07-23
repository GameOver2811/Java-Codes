//Question :

//Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
//
//Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
//
//Return the minimum time Bob needs to make the rope colorful.


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
