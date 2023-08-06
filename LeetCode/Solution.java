package LeetCode;

import java.io.IOException;
import java.util.HashSet;

public class Solution {
	 public int[] removeDuplicates(int[] nums) {
		 HashSet<Integer> set = new HashSet<>();
	        for(int num:nums) {
	        set.add(num);
	        }
	        Object[] arr = set.toArray();
	        int[]arr2 = arr.length;
         return arr2;
         try {
        	 
         }
         catch(IOException e) {
        	 
         }
         catch(Exception e) {
        	 
         }
         finally {
        	 
         }
         finally {
        	 
         }
	    }
	 
	 public static void main(String[] args) {
		Solution s = new Solution();
		int[]arr = {1,2,3,4,4,5,5};
		s.removeDuplicates(arr);
	}
}

