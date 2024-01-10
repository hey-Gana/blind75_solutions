package blind75_answers;

import java.util.HashSet;

//This is the solution for leetcode 217. Contains Duplicate
public class leetcode217 {
	
	//takes an array input and checks if there are any repetitive / duplicate values
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		//Using hashset to compare as they are like dictionaries {key:value} pairs
		for(int i=0; i<nums.length; i++) {
			if(hs.contains(nums[i])) {return true;}
			hs.add(nums[i]);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 3};
		System.out.println(containsDuplicate(nums));
		
		int[] f1 = {1,2,3,4};
		System.out.println(containsDuplicate(f1));
	}

}
