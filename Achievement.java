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
	public void rankGrade(LinkList achlist){
		Object[] a = achlist.toArray();
		Achievement temp = new Achievement();
		for (int i =0;i<a.length-1 ;i++){
		if (((Achievement)a[i]).compare((Achievement)a[i+1]) == 1){
			temp = (Achievement) a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		}
		int i = 0;
		for (Object e:a){
			i++;
			Sop.sop("学号	"+((Achievement)e).id+"	姓名    "+"	平均成绩"+((Achievement)e).grade+"	名次	"+i);
		}
		
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
