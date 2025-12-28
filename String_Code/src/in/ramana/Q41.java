package in.ramana;



public class Q41 {
	public static void main(String[] args) {
		String s ="__java__is___very__easy__";
		String s2 ="";
		char[] ch = s.toCharArray();
		for(int i =0;i<ch.length;i++) {
			
			if (ch[i] == '_' && (i == 0 || ch[i - 1] == '_')) {
                continue;
            }
			s2 +=ch[i];
		}
		 if (s2.endsWith("_")) {
	            s2 = s2.substring(0, s2.length() - 1);
	        }
		System.out.println(s2);
	}

}
