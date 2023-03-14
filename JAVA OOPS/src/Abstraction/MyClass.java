package Abstraction;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		Subtraction s = new Subtraction();
		Multiplication m = new Multiplication();
		
		a.calculate(10, 10);
		s.calculate(20, 10);
		m.calculate(10, 10);
	}

}
