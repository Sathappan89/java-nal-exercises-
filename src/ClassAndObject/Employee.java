package ClassAndObject;

public class Employee {

	/*
	 * Define a class named Employee with the following attributes: String name int
	 * age double salary double totalSalary (to keep track of the total salary of
	 * all employees)
	 * 
	 * In the main method: Create three Employee objects and initialize their
	 * properties with different values.
	 * 
	 * Print the details of each employee and the total salary of all employees.
	 * 
	 * Give a raise to one employee by increasing their salary, and update the total
	 * salary accordingly.
	 * 
	 * Create another Employee object with a different salary and update the total
	 * salary of all employees.
	 * 
	 * Print the details of the new employee and the updated total salary of all
	 * employees.
	 * 
	 */

	String name;
	int age;
	double salary;
	double totalSalary;

	public static void main(String[] args) {
		int TotalEmployee = 0;
		Employee e1 = new Employee();
		e1.name = "Weng";
		e1.age = 55;
		e1.salary = 2102.22;
		e1.totalSalary = 100000.00;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.totalSalary);
		TotalEmployee++;

		Employee e2 = new Employee();
		e2.name = "Cang";
		e2.age = 59;
		e2.salary = 1102.21;
		e2.totalSalary = 200000.00;
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.totalSalary);
		TotalEmployee++;

		Employee e3 = new Employee();
		e3.name = "Test";
		e3.age = 51;
		e3.salary = 3102.23;
		e3.totalSalary = 300000.00;
		System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " + e3.totalSalary);
		TotalEmployee++;

		e1.salary = 5432.01;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.totalSalary);

		Employee e4 = new Employee();
		e4.name = "Test";
		e4.age = 51;
		e4.salary = 3102.27;
		e4.totalSalary = 300000.00;
		System.out.println(e4.name + " " + e4.age + " " + e4.salary + " " + e4.totalSalary);
		TotalEmployee++;

		System.out.println("Total number of employee = " + TotalEmployee);

	}

}