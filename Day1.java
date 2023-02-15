package Data_structure_StudyPlan;

import java.util.HashMap;
import java.util.HashSet;

public class Day1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));

        int []num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarray(num));
    }

    private static int maxsubarray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);

            if(sum<0) sum = 0;
        }

        return max;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if (map.containsKey(map.get(i))){
                return true;
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
//
//        HashSet<Integer> set = new HashSet<>();
//        for (int i: nums) {
//            if (!set.add(i)) return true;
//        }
//        return false;
    }

}
