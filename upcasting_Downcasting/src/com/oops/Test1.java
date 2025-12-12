package com.oops;

public class Test1 {
	public static void main(String[] args) {
		India i= new Bihar();
		System.out.println(i.popullation);
		i.main();
		Bihar b =(Bihar) i;
		System.out.println(b.popullation);
		b.main();
		
	}

}
