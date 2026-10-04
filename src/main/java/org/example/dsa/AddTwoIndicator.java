package org.example.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoIndicator {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] finalResult = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    System.out.println(Arrays.toString(new int[]{i, j}));
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(finalResult));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[]{
                        map.get(required),
                        i
                };
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
