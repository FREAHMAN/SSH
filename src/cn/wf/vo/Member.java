package cn.wf.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Member implements Serializable {
	private String mid;
	private String name;
	private Integer age;
	private String sex;
	private Date birthday;
	private Double salary;
	private String note;
	public String getMid() {
		return mid;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public Double getSalary() {
		return salary;
	}
	public String getNote() {
		return note;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday
				+ ", salary=" + salary + ", note=" + note + "]\n";
	}
	
	
}
