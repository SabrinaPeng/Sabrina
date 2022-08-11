package Company;

import java.util.ArrayList;

public class Department {

	private String name;
	private double budget;
	private double expenses;
	private double developExpenses;
	private ArrayList<Employee> emplpoyeeList;
	
	public Department(String name, double budget, ArrayList<Employee> list) {
		this.name = name;
		this.budget = budget;
		this.emplpoyeeList = list;
	}
	
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public String getName() {
		return name;
	}
	public double getBudget() {
		return budget;
	}
	public ArrayList<Employee> getEmplpoyeeList() {
		return emplpoyeeList;
	}
	public double getDevelopExpenses() {
		return developExpenses;
	}
	public void setDevelopExpenses(double developExpenses) {
		this.developExpenses = developExpenses;
	}

	
	
	public double budget() {
		double sumSalary = 0;
		for (Employee s: this.getEmplpoyeeList()) {
			sumSalary += s.totalSalary();
		}
		return sumSalary + this.getExpenses() + this.getDevelopExpenses();
	}

	
	
	public void printName() {
		System.out.println(this.getName());
		for (Employee e: this.getEmplpoyeeList()) {
			System.out.println("Name: " + e.getName() + "  Position: " + e.getPosition() + "  Bonus: " + e.extraBonus(e.getPosition(), e.getGrade()) +
								"  extra hours: " + e.getExtraHour() + "  total salary: " + e.totalSalary() + "  Tax: " + e.tax());
		}
	}
	
}
