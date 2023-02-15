package Data_structure_StudyPlan;

import java.util.HashMap;

public class Day2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        nums = twosum(nums,9);
        for (int e: nums) System.out.print(e+" ");
    }

    private static int[] twosum(int[] nums,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i =0;i< nums.length;i++){
            if (map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }else {
                map.put(nums[i],i );
            }
        }
        return result;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1;
        int tail2 = n-1;
        int i = m+n-1;

        while(tail2>=0){
            if(tail1 >=0 && nums1[tail1] > nums2[tail2]){
                nums1[i--] = nums1[tail1--];
            }
            else{
                nums1[i--] = nums2[tail2--];
            }
        }
    }
}
