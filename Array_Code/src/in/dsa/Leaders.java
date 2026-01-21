package in.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {
	public static void main(String[] args) {
		int [] arr = {1,2,5,3,1,2};
		List<Integer> l = leaders(arr);
		for(Integer ld : l) {
			System.out.print(ld + " ");
		}
	}
	public static List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList();
         int maxFromRight = nums[nums.length - 1];
        result.add(maxFromRight);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                result.add(nums[i]);
            }
        }
        Collections.reverse(result);
        return result;
        
    }

}
