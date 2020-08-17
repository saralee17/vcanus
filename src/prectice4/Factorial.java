package prectice4;

public class Factorial {

	static int FactorialTail(int n, int acc) {
		int acc1 = 1;
		do {
			if (n == 1) 
				return acc1;
			acc1 = acc1 * n;
			n = n - 1;
		} while (true);

	}

	static int Factorial(int n){
		return FactorialTail(n, 1);
	}
	
	public static void main(String[] args) {
		int result = Factorial(4);
		System.out.println(result);
	}

}
