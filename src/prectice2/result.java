package prectice2;

public class result {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(5).add(4).subtract(3).out();
		System.out.println(result);

	}

}
