package nam;

public class Employee {
	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String toString()
	{
		StringBuilder sb=new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append("salary: ");
		sb.append(""+salary+">");
		return sb.toString();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
}


