package capgemini.java;

import java.util.Scanner;

import org.omg.CosNaming._NamingContextExtStub;

class Details {

	private String name;
	private int iD;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeInfo   ||  Name of Employee= " + name + "  ||  *Employee ID= " + iD + "  ||  *Employee salary= "
				+ salary + "  ||";

	}

	Details() {

	}

	public Details(String name, int iD, int salary) {
		super();
		this.name = name;
		this.iD = iD;
		this.salary = salary;

	}

}

public class Application1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Details[] empinfo = {};

		while (true) {
			System.out.println("Enter 1 for creating the list of Employees : ");
			System.out.println("Enter 2 for Employee Information :");
			System.out.println("Enter 3 for Searching Employee : ");
			System.out.println("Enter 4 for deleting Employee :  ");
			System.out.println("Enter 5 for minimum salary : ");
			System.out.println("Enter 6 for maximum salry : ");
			System.out.println("Enter 14 to exit");

			int option = sc.nextInt();

			if (option == 1) {
				System.out.println("Enter the number of Employee you want to add: ");
				int number = sc.nextInt();
				empinfo = new Details[number];

				for (int i = 0; i < number; i++) {

					System.out.println("Enter employee name :");
					String name = sc.next();
					System.out.println("Enter employye id :");
					int iD = sc.nextInt();
					System.out.println("Enter Salary :");
					int salary = sc.nextInt();

					empinfo[i] = new Details(name, iD, salary);

				}
			}
			if (option == 2) {
				for (int i = 0; i < empinfo.length; i++) {
					if (empinfo[i].getiD() != 0) {
						System.out.println(empinfo[i]);
					}
				}
			}
			
			if(option == 3) {
				System.out.print("Enter name which you want to search: ");
				String name = sc.next();
				boolean flag = true;
				for (int i = 0; i < empinfo.length; i++) {
					if (empinfo[i].getName().equalsIgnoreCase(name)) {
						System.out.println("Employee Found: " + empinfo[i].toString());
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Record not found");
				}
			}
			
			if(option == 4) {
				boolean flag = true;
				for (int i = 0; i < empinfo.length; i++) {
					System.out.println(empinfo[i]);
				}
				System.out.print("Enter the id of employee for which you want to delete: ");
				int id = sc.nextInt();
				for (int i = 0; i < empinfo.length; i++) {
					if (empinfo[i].getiD() == id) {
						System.out.println("Deleting record " + empinfo[i].toString());
						empinfo[i] = new Details();
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("No matching ID found");
				}
			}
			if(option == 5) {
				double min = empinfo[0].getSalary();
				for (int i = 0; i < empinfo.length; i++) {
					if (empinfo[i].getSalary() < min) {
						min = empinfo[i].getSalary();
					}
				}
				System.out.print("Minimum salary paid to employee is: " + min);
			}
			
			if(option == 6) {
				double max = empinfo[0].getSalary();
				for (int i = 0; i < empinfo.length; i++) {
					if (empinfo[i].getSalary() > max) {
						max = empinfo[i].getSalary();
					}
				}
				System.out.print("Maximum salary paid to employee is: " + max);
			}

			if(option == 14) {
				System.out.println("Thank you for using our service!");
				break;
			}
		}

	}
}
