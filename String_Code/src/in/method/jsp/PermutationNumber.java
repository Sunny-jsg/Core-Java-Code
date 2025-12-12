package in.method.jsp;

public class PermutationNumber {
	
	    public static void main(String[] args) {
	        String s = "abc";   // unique characters
	        int n = s.length();
	        int total = factorial(n);
	        System.out.println("Total permutations = " + total);
	    }

	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    
	}


}
