package in.ramana;

public class Q19 {
	public static void main(String[] args) {
		String s1 = "easy very is java";
		String s2 = "";
		char[] ch = s1.toCharArray();
		int i = ch.length - 1;
		int j = ch.length - 1;
		while (i >= 0) {
			while (i >= 0 && ch[i] != ' ')
				i--;
			String temp ="";
			for(int k =i+1;k<=j;k++) {
				temp +=ch[k];
			}
			s2+=temp;
			if(i>0)
			 s2 += " ";
			i--;
			j=i;

		}
		System.out.println(s2);
	}

}
