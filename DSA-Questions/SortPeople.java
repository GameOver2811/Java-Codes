//Question :
//        You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
//
//        For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
//        Return names sorted in descending order by the people's heights.

import java.util.Arrays;

public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < names.length; i++) {
            int maxIndx = -1, max = Integer.MIN_VALUE;
            for(int j = i; j < names.length; j++) {
                if(heights[j] > max) {
                    maxIndx = j;
                    max = heights[j];
                }
            }
            String temp = names[maxIndx];
            names[maxIndx] = names[i];
            names[i] = temp;
            int t = heights[i];
            heights[i] = heights[maxIndx];
            heights[maxIndx] = t;
        }
        return names;
    }

    public static void main(String[] args) {
        int heights[] = {6,4,5,7};
        String names[] = {"krishna", "Radha", "shiva", "shakti"};
        String[] answer = sortPeople(names, heights);
        System.out.println(Arrays.toString(answer));
    }

}
