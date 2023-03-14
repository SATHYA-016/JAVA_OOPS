package Encapsulation;

public class Employee {
	
		// Step 1: Declare variables as private in the class.          
		   private String EmpName; 
		   private String EmpAdd;         
		   private int EmpNo;
		   
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		public String getEmpAdd() {
			return EmpAdd;
		}
		public void setEmpAdd(String empAdd) {
			EmpAdd = empAdd;
		}
		public int getEmpNo() {
			return EmpNo;
		}
		public void setEmpNo(int empNo) {
			EmpNo = empNo;
		}

		 
}
