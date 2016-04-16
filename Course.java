package dlnu.zhaochen;

public class Course {
	String subjectsno;
	String name;
	double credit;
	Course(){
		
	}
	
	Course(String subjectsno,String name,double credit){
		this.credit = credit;
		this.name = name;
		this.subjectsno = subjectsno;
	}
	
	public void setSubjectsno(String subjectsno){
		this.subjectsno = subjectsno;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCredit(double credit){
		this.credit = credit;
	}
	public String getSubjectsno(){
		return subjectsno;
	}
	public String getName(){
		return name;
	}
	public double getCredit(){
		return credit;
	}
	public String toString(){
		return subjectsno+"		"+name+"		"+credit;
	}
	
}
	


