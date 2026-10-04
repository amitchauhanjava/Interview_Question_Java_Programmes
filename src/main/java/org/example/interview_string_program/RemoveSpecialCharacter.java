package org.example.interview_string_program;

import java.util.HashMap;
import java.util.Map;

public class RemoveSpecialCharacter {
	
	public static void main(String[] args) {
		
		String name = "My&*$Name%@is$%Amit";
		
		String plainText = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainText);
		twoSum(new int[]{2, 7, 11, 5},9);
	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return new int[]{};
	}
}
