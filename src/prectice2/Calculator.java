package prectice2;

public class Calculator {
	int result;
	
	public Calculator add(int num) {
		this.result += num;
		return this;
	}
	
	public Calculator subtract(int num) {
		this.result -= num;
		return this;
	}
	
	public int out() {
		return result;
	}
}
