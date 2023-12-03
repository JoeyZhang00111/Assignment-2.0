
public class main {
	public static void main(String args[]){
		Employee emp1 = new Employee("John Doe");
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Number: " + emp1.getEmployeeNumber());

        Employee emp2 = new Employee("Jane Smith");
        System.out.println("Employee Name: " + emp2.getName());
        System.out.println("Employee Number: " + emp2.getEmployeeNumber());

	}
}
