package in.stream;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		int[] arr = { 66, 32, 12, 45, 20 };
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > 20) {
				System.out.println(arr[i]);
			}
		}
         System.out.println("==================================");
		List<Integer> list1 = Arrays.asList(66, 32, 12, 45, 20);
		list1.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
		System.out.println("===================================");
		List<String> list2 = Arrays.asList("John","Anushka","Anupama","Ashok","Mohan","Akash");
		list2.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	}

}
