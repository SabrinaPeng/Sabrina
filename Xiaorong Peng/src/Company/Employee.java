package Company;

public class Employee {

	private String name;
	private String position;
	private int grade;
	private double baseSalary;
	private double extraHour;
	
	public Employee(String name, String position, int grade) {
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getGrade() {
		return grade;
	}

	public double baseSalary(String position, int grade) {
		if (position.equals("General Manager") || grade == 1) {
			this.baseSalary = 500000;
		}else if (position.equals("Manager") && grade == 2) {
			this.baseSalary = 150000;
		}else if (position.equals("Department director") && grade == 2) {
			this.baseSalary = 150000;
		}else if (position.equals("Accountant") && grade == 3) {
			this.baseSalary = 125000;
		}else if (position.equals("Sales Manager") && grade == 3) {
			this.baseSalary = 125000;
		}else if (position.equals("Employee Type1") && grade == 4) {
			this.baseSalary = 120000;
		}else if (position.equals("Employee Type2") && grade == 5) {
			this.baseSalary = 100000;
		}else if (position.equals("Employee Type3") && grade >= 6) {
			this.baseSalary = 90000;
		}
		return this.baseSalary;
	}
	
	public double getExtraHour() {
		return extraHour;
	}

	public void setExtraHour(double extraHour) {
		this.extraHour = extraHour;
	}
	
	public double extraBonus(String position, int grade) {
		if (position.equals("General Manager") || grade == 1) {
			return 1000 * this.getExtraHour();
		}else if (position.equals("Manager") && grade == 2) {
			return 250 * this.getExtraHour();
		}else if (position.equals("Department director") && grade == 2) {
			return 250 * this.getExtraHour();
		}else if (position.equals("Accountant") && grade == 3) {
			return 500 * this.getExtraHour();
		}else if (position.equals("Sales Manager") && grade == 3) {
			return 200 * this.getExtraHour();
		}else if (position.equals("Employee Type1") && grade == 4) {
			return 100 * this.getExtraHour();
		}else if (position.equals("Employee Type2") && grade == 5) {
			return 80 * this.getExtraHour();
		}else if (position.equals("Employee Type3") && grade >= 6) {
			return 50 * this.getExtraHour();
		}else {
			return 0;
		}
	}
	
	public double totalSalary() {
		return this.extraBonus(this.position, this.grade) + this.baseSalary(this.position, this.grade);
	}
	
	public double taxRate() {
		if (this.totalSalary() <= 300000) {
			return 0.1;
		}else {
			return 0.2;
		}
	}
	
	public double tax() {
		return this.totalSalary() * this.taxRate();
	}
	
	public double realSalary() {
		return this.totalSalary() * (1 - this.taxRate());
	}
	
}
