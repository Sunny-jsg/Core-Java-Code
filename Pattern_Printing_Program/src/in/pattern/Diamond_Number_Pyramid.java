package in.pattern;

public class Diamond_Number_Pyramid {
	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l);
			}
			
			System.out.println();
		}
		for(int m=4;m>=1;m--) {
			for(int n=m;n<=4;n++) {
				System.out.print(" ");
			}
			for(int o=1;o<=m;o++) {
				System.out.print(o);
			}
			for(int p=m-1;p>=1;p--) {
				System.out.print(p);
			}
			System.out.println();
		}
	}


}
