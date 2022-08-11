package Company;

import java.util.ArrayList;

public class testMain {

	public static void main(String[] args) {

		ArrayList<Employee> ManageDepart = new ArrayList<Employee>();
		ArrayList<Employee> AccDepart = new ArrayList<Employee>();
		ArrayList<Employee> SalesDepart = new ArrayList<Employee>();
		ArrayList<Employee> ITDepart = new ArrayList<Employee>();
		
		// the whole department
		
		Employee em1 = new Employee("Elias", "Manager", 2);
		Employee em2 = new Employee("Bob", "Department director", 2);
		Employee em3 = new Employee("Song", "General Manager", 1);
		Employee em4 = new Employee("Anny", "Accountant", 3);
		Employee em5 = new Employee("Stephan", "Sales Manager", 3);
		Employee em6 = new Employee("Sophia", "Employee Type1", 4);
		Employee em7 = new Employee("Jessica", "Employee Type2", 5);
		Employee em8 = new Employee("Andy", "Employee Type3", 6);
		Employee em9 = new Employee("Markus", "Employee Type3", 7);
		
		em1.setExtraHour(12);
		em2.setExtraHour(0);
		em3.setExtraHour(20);
		em4.setExtraHour(56);
		em5.setExtraHour(20);
		em6.setExtraHour(25);
		em7.setExtraHour(80);
		em8.setExtraHour(2.5);
		em9.setExtraHour(7.8);
		
		//management department
		Department d1 = new Department("Management Department", 1000000, ManageDepart);
		d1.setDevelopExpenses(70000);
		
		ManageDepart.add(em1);
		ManageDepart.add(em2);
		
		System.out.println("budget the company needs: " + d1.budget());
		d1.printName();
		
		//accounting department
		Department d2 = new Department("Accounting Department", 1000000, AccDepart);
		AccDepart.add(em3);
		AccDepart.add(em7);
		
		d2.printName();
		
		//sales department
		Department d3 = new Department("Sales Department", 1000000, SalesDepart);
		SalesDepart.add(em5);
		SalesDepart.add(em6);
		d3.printName();

		// it department
		Department d4 = new Department("IT Department", 1000000, ITDepart);
		ITDepart.add(em4);
		ITDepart.add(em8);
		ITDepart.add(em9);
		d4.printName();
	}

}
