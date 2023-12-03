import java.util.Random;

public class Employee {
	static Random random = new Random();
    static int randomNumber = random.nextInt(1000) + 1;
	private static int nextEmployeeNumber = randomNumber; // Starting employee number

    private int employeeNumber;
    private String name;

    public Employee(String name) {
        this.setName(name);
        this.employeeNumber = getNextEmployeeNumber();
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    private static int getNextEmployeeNumber() {
        return nextEmployeeNumber++;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
