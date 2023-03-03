package Data_structure_StudyPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

        int[] nums1 = {1,2,2,1},nums2 = {2,2};
        int[] ans = intersect(nums1,nums2);
        for (int e: ans) System.out.print(e+" ");
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int top = 0;
        int bottom = 0;
        ArrayList<Integer> h = new ArrayList<>();

        while (true){
            if (top >= nums1.length || bottom >= nums2.length){
                break;
            }
            if (nums1[top] == nums2[bottom]){
                h.add(nums1[top]);
                top ++;
                bottom ++;
            }
            else if (nums1[top] < nums2[bottom]){
                top ++;
            }
            else if (nums1[top] > nums2[bottom]){
                bottom ++;
            }
        }
        int[] g = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            g[i] = h.get(i);
        }
        return g;
    }
}
