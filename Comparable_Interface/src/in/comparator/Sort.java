package in.comparator;

import java.util.Comparator;

public class Sort {
	public static void sort(Object [] o , Comparator c) {
		for(int i=0;i<o.length;i++) {
			for(int j=0;j<o.length-1-i;j++) {
				
				if(c.compare(o[j], o[j+1])>0) {
					Object temp = o[j+1];
					o[j+1]=o[j];
					o[j]= temp;
				}
			}
		}
	}

}
