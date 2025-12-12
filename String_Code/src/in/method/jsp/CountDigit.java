package in.method.jsp;

public class CountDigit {
	public static void main(String[] args) {
		String s = "a34f54f94j34j";
		int sum =0;
		char[] a = s.toCharArray();
		for(char c : a) {
			if(c >='0' && c <='9') {
				
				sum += Integer.parseInt(c +"");
			}
			
		}
		System.out.println(sum);
	}

}
