package cm.wf.vo;

public class Student extends Members {
	
	private String school;
	private Double score;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "school为"+school+"score为"+score ;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

}
