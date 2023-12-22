import java.util.Random;
public class main {
	static final int START_EMPLOYEE_NUMBER = 1000;
	
	public static void main(String[] args) {
	Employee emp1 = new Employee(0, 0, START_EMPLOYEE_NUMBER); 
        Employee emp2 = new Employee(0, 0, emp1.getNextEmployeeNumber()); 
        Employee emp3 = new Employee(0, 0, emp1.getNextEmployeeNumber());
        
        emp1.setHoursWorked(10);
        emp1.setHourlyWage(20);
        
        emp2.setHoursWorked(8);
        emp2.setHourlyWage(15);
        
        emp3.setHoursWorked(9);
        emp3.setHourlyWage(18);
        

        
		
        System.out.println("Employee 1 Record:");
        System.out.println(emp1);

        System.out.println("\nEmployee 2 Record:");
        System.out.println(emp2);
        
        System.out.println("\nEmployee 3 Record:");
        System.out.println(emp3);

        
        
        System.out.println("\nDemonstrating equals method:");
        System.out.println("Employee 1 equals Employee 2: " + emp1.equals(emp2));
        System.out.println("Employee 2 equals Employee 3: " + emp2.equals(emp3));
        
        
        
        System.out.println("\nGetters and setters demonstration :");
        System.out.println("Previous hourly wage of Employee 1: " + emp1.getHourlyWage());
        emp1.setHourlyWage(25.0);
        System.out.println("Updated hourly wage of Employee 1: " + emp2.getHourlyWage());
        
        System.out.println("Previous hourly wage of Employee 2: " + emp2.getHourlyWage());
        emp1.setHourlyWage(25.0);
        System.out.println("Updated hourly wage of Employee 2: " + emp2.getHourlyWage());
        
        System.out.println("Previous hourly wage of Employee 3: " + emp3.getHourlyWage());
        emp1.setHourlyWage(25.0);
        System.out.println("Updated hourly wage of Employee 3: " + emp3.getHourlyWage());
        
    }
}
