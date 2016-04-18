package dlnu.zhaochen;

public class Achievement {
	
	String subjectsno;
	String id;
	double grade;
	static int rank = 1;
	Achievement(){
		
	}
	Achievement(String id){
		this.id = id;
	}
	
	Achievement(String subjectsno,String id,double grade){
		this.id = id;
		this.subjectsno = subjectsno;
		this.grade = grade;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setSubjectsno(String subjectsno){
		this.subjectsno = subjectsno;
	}
	
	public void setGrade(double grade){
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	
	public String getSubjectsno(){
		return subjectsno;
	}
	
	public double getGrade(){
		return grade;
	}
	
	public String toString(){
		return "课程号"+subjectsno+"	学生学号"+id+"	分数"+grade;
	}
	public boolean equals(Object o) {
		return ((Achievement)o).id.equalsIgnoreCase(this.id);
	}
	
	
	
	public int compare(Achievement ach) {
		if (ach.equals(this)){
			return 0;
		}
		else {
			return ach.grade>this.grade?1:-1;
		}
	}

}
