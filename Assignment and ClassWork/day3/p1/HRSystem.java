package day3.p1;

public class HRSystem {

	public static void main(String[] args) {
		
		Employee ramesh = new Employee(); // object of Employee;
		System.out.println(ramesh.getEmpName()); // no name
		
		
		
		ramesh.setEmpName("Ramesh");
		System.out.println(ramesh.getEmpName()); // ramesh
		
		Employee amit = new Employee(101); 
		
	}
}



/* -------------------------------------*/
/*
==== WRONG APPROACH ==== 
ramesh.empId = 101;
ramesh.salary = 2000;
ramesh.projectName = "ABC-Bank";

// object of Employee;

System.out.println(" Amit Salary "+amit.salary);
amit.workingOnProject();
*/
