package in.dsa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Count_Char_2 {
	public static void main(String[] args) {
		String s = "banana";
		
		Map<Character, List<Integer>> lhs = new LinkedHashMap<>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			lhs.putIfAbsent(c, new ArrayList<>());
			lhs.get(c).add(i);
		}
		for(Entry<Character, List<Integer>> e : lhs.entrySet() ) {
			 System.out.println(e.getKey() + " = " + e.getValue());
		}
	}

}
