package in.binarySearch;

public class Q4 {
	public static void main(String[] args) {
		char[] ch = { 'c', 'f', 'j' };
		char target = 'a';
		char ans = isBinary(ch, target);
		System.out.println(ans);

	}

	public static char isBinary(char[] ch, char target) {
		int start = 0;
		int end = ch.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > ch[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return ch[start % ch.length];
	}

}
