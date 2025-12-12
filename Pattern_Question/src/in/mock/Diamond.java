package in.mock;

public class Diamond {
	public static void main(String[] args) {
		for(int i =1;i<=4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=3;l>=1;l--) {
			for(int m=l;m<=3;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=(2*l-1);n++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
	}

}
