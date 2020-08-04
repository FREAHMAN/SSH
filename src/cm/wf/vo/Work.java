package cm.wf.vo;

public class Work extends Members {
	private String company;
	private double salary;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "company是"+company+"salary是"+salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
