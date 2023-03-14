package Encapsulation;

public class encap {

	public static void main(String[] args) {
		{ 
		       
			   Employee obj = new Employee(); 

		          
			    obj.setEmpName("Surya");           
			    obj.setEmpAdd("Chennai");           
			    obj.setEmpNo(1234567890);

		          
			    System.out.println("Employee's Name: " +obj.getEmpName());           
			    System.out.println("Employee's Address.: " +obj.getEmpAdd());           
			    System.out.println("Employee's Number: " +obj.getEmpNo());    
			   } 

	}

}
