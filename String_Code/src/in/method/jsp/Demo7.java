package in.method.jsp;

public class Demo7 {
	public static void main(String[] args) {
		String s1 ="banana";
		int Vowelcount =0;
		int consonantCount=0;
		char[] ch = s1.toCharArray();
		for(char c : ch) {
			if(c >='A' && c <='Z' || c >='a' && c<='z' ) {
				if(c =='A'|| c=='a' || c=='E'|| c =='e'|| c=='I' || c=='i' || c =='O'|| c=='o'|| c=='U' || c=='u') {
					Vowelcount++;
					
				}else {
					consonantCount++;
				}
					
				
			}
		}
		System.out.println("Vowel count = "+ Vowelcount);
		System.out.println("Consonant Count = "+ consonantCount);
	}

}
