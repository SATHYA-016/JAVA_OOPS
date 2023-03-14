package Polymorphism;

public class method_overloading {
	public void display() {
		System.out.println("Employee details");
	}
	public void display(String Employee_name) {
		System.out.println("Employee name: "+Employee_name);
	}
	public void display(int Employee_id) {
		System.out.println("Employee ID: "+Employee_id);
	}
	public void display(String Address,int phone_no) {
		System.out.println("Employee address: "+ Address+" Employee phone_no: "+ phone_no); 
	}
	public static void main(String[] args) {
		method_overloading m =new method_overloading();
		m.display();
		m.display("SURYA");
		m.display(2121538);
		m.display("CHENNAI", 1234567890);
}
}
