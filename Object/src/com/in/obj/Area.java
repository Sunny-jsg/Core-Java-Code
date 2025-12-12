package com.in.obj;

public class Area {
	int i;
   static int  j;
	
	void m2() {
		System.out.println(i +"," +j);
		
		i++;
		j++;
		
	}

	

	public static void main(String[] args) {
		Area a1 = new Area();
		Area a2 = new Area();
		Area a3 = new Area();
		a1.m2();
		a1.m2();
		a1.m2();
	}

}
