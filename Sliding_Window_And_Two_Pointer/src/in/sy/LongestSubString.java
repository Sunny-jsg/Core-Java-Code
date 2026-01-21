package in.sy;

import java.util.Arrays;

public class LongestSubString {
	public static void main(String[] args) {
		String s = "cadbzabcd";
		System.out.println("Longest substring length = " + longSubString(s));

	}

	public static int longSubString(String s) {
		int[] hash = new int[256];// Stores last index of each character
		Arrays.fill(hash, -1); // Initialize all to -1

		int n = s.length();
		int r = 0, l = 0, maxlength = 0;
		while (r < n) {
			char ch = s.charAt(r);
			// If character seen before and inside current window
			if (hash[ch] >= l) {
				l = hash[ch] + 1;

			}
			// Calculate window length
			int len = r - l + 1;
			maxlength = Math.max(maxlength, len);
			// Update last seen index of character
			hash[ch] = r;
			r++;
		}
		return maxlength;
	}

}
