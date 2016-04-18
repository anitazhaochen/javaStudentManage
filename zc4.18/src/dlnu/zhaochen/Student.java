package dlnu.zhaochen;



import java.util.Scanner;

public class Student {
	private String id;
	private String name;
	private String sex;
	private int age;
	private String nation;
	Student(){
		
	}
	Student(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	Student(String id ,String name ,String sex, int age,String nation) {
		this.age = age;
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		
	}
	public int getAge(){
		return age;
	}
	public String getNation() {
		return nation;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getSex(){
		return sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setNation(String nation){
		this.nation = nation;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public boolean equals(Object student){
		Student other = (Student)student;
		return this.id.equalsIgnoreCase( other.id)||this.name.equalsIgnoreCase(other.name);
	}
	
	public String toString(){
		return id+"  "+name+"  "+sex+"   "+age+"   "+nation;
	}
	
	
	public void show(){
		Sop.sop("name= "+name);
		Sop.sop("id= "+id);
		Sop.sop("sex= "+sex);
		Sop.sop("age= "+age);
	}
	
	public void revise(){
		Scanner in = new Scanner(System.in);
		
	Sop.sop("1.�޸�ѧ��\n2.�޸�����\n3.�޸��Ա�\n4.�޸�����");
	
	int op = Sop.InputNumber(1,4);
		switch(op){
		case 1:
			Sop.sop("�����޸ĺ��ѧ�ţ�");
			setId(in.next());
			break;
		case 2:
			Sop.sop("�����޸ĺ��������");
			setName(in.next());
			break;
		case 3:
			Sop.sop("�����޸ĺ���Ա�");
			setSex(in.next());
			break;
		case 4:
			Sop.sop("�����޸ĺ�����䣺");
			setAge(Sop.InputNumber(0,120));
			break;
			default :
				Sop.sop("�������");
			break;
		}
	}
	
	
	
}

