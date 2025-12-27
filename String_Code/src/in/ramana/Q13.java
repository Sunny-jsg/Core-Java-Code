package in.ramana;

public class Q13 {
	public static void main(String[] args) {
		String s = "helloworld"; //output :he121w2r3d;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count =0;
			int occurance =1;
		  for(int j =0 ;j< ch.length;j++) {
			  if(ch[i] == ch[j]) {
				  count++;
			  }
		  }
		  for(int k=0;k<i;k++) {
			  if(ch[k] == ch[i]) {
				  occurance++;
			  }
		  }
		  if (count > 1) {
              System.out.print(occurance);
          } else {
              System.out.print(ch[i]);
          }
		}
	}

}
