package in.ramana;

public class Q36 {
	public static void main(String[] args) {
		String s = "abc243d10";
		char[] ch = s.toCharArray();
		int sum =0;
		int num =0;
		for(char c : ch) {
			if(c >='0' && c<='9') {
				num = num *10 +(c-'0');
			}else {
				sum +=num;
				num=0;
			}
		}
		sum +=num;
		System.out.println(sum);
	}

}
