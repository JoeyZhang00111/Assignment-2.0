import java.util.Random;
public class main {
	static final int START_EMPLOYEE_NUMBER = 1000;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(20, 10, START_EMPLOYEE_NUMBER); 
        Employee emp2 = new Employee(15, 8, emp1.getNextEmployeeNumber()); 
//        emp2.setHoursWorked(50);
//        emp2.setHourlyWage(15.3);

        
		
        System.out.println("Employee 1 Record:");
        System.out.println(emp1);

        System.out.println("\nEmployee 2 Record:");
        System.out.println(emp2);

        // Demonstrating equals method
        System.out.println("\nEquality Check:");
        System.out.println("Employee 1 equals Employee 2: ");
        System.out.println("Employee 1 equals Employee 1: ");

       
    }
}
