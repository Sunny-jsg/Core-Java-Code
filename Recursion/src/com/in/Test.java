package com.in;

public class Test {
	public static void main(String[] args) {
		String[] words = { "flower", "flow", "flight" };
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));

		String[] words2 = { "dog", "racecar", "car" };
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words2));

	}
	
	static String longestCommonPrefix(String[] str) {
		if(str == null || str.length==0) {
			return "";
		}
		String prefix=str[0];
		for(int i=1;i<str.length;i++) {
			String current = str[i]; 
		 while(!current.startsWith(prefix)) {
			prefix = prefix.substring(0, prefix.length()-1);
			if(prefix.isEmpty())
				return "";
		 }
		}
		return prefix;
	}

	
}
