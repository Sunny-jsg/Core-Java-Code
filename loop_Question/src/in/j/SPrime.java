package in.j;

import java.util.ArrayList;

public class SPrime {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 10; i <= 200; i++) {
			if (isPrime(i))
				al.add(i);
		}
		System.out.print("First 3 Prime Numbers: ");
		for (int i = 0; i < 3 && i < al.size(); i++) {
			System.out.println(al.get(i) + " ");
		}
		System.out.println();
		System.out.print("Last 3 Prime Numbers: ");
        for (int i = Math.max(0, al.size() - 3); i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
	}
	

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
