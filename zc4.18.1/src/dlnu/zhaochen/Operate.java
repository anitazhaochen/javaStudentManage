package dlnu.zhaochen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Operate {
	LinkedList<Student> studentlist;
	LinkedList<Achievement> achlist;
	LinkedList<Course> courselist;

	Operate() {
		
	}
	Operate(LinkedList<Student> studentlist,LinkedList<Achievement> achlist, LinkedList<Course> courselist) {
		this.courselist = courselist;
		this.achlist =achlist;
		this.studentlist = studentlist;
	}
		public void inputStudent(){
				
				
				for(Scanner in = new Scanner(System.in);;){
				String id;
				Sop.sop("学号：");
				id = in.next();
				if (id.equalsIgnoreCase("-1"))
					break;
				Sop.sop("姓名：");
				String name = in.next();
				Sop.sop("性别：");
				String sex = in.next();
				Sop.sop("年龄：");
				int age = (Sop.InputNumber(1, 120));
				Sop.sop("民族");
				String nation = in.next();
				studentlist.add(new Student(id,name,sex,age,nation));
				}
			}
		
		public void countAge(){
			
			Object[] student =  studentlist.toArray();
			int[] a = new int[100];
			int i = 0;
			for(i = 0; i < student.length ;i++) {
				a[((Student) student[i]).getAge()]++;
			}
			
			for(i=0; i<a.length; i++){
				
				if (a[i] != 0)
				Sop.sop("年龄为"+i+"的人数为"+a[i]);
			}
		}
		public void countNation(){
			Object[] student = studentlist.toArray();
			Nation[] a = new Nation[56];
			for (int i =0 ;i<a.length;i++)
			a[i] = new Nation();
			a[0].nation = ((Student) student[0]).getNation();
			a[0].count++;
			int flag = 0;
			int i = 1;
			for(int k = 1; k<student.length ;k++) {
				for(int j = i; j >= 0 ; j--)
				if (((Student)student[i]).getNation().equalsIgnoreCase(a[j].nation)) {
				a[j].count++;
				flag =1;
				}
				if (flag == 0){
					
					a[++i].nation = ((Student)student[i]).getNation();
					a[i].count++;
				}
			}
			
			for(i=0; i<a.length; i++){
				
				if (a[i].count != 0)
				Sop.sop("民族为	"+a[i].nation+"	的人数为	"+a[i].count);
			}
			
		}
		private class Nation {
			int count = 0;
			String nation;
		}
		
		public void rankGrade(){
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
				String id = ((Achievement)e).getId();
				Student stu = traversalStudent(id);
				Sop.sop("学号	"+((Achievement)e).id+"	姓名    "+stu.getName()+"	平均成绩"+((Achievement)e).grade+"	名次	"+i);
			}
			
		}
		public Student traversalStudent(String string){
			Iterator<Student> iterator = studentlist.iterator();
			
			while (iterator.hasNext()) {
				Student student = iterator.next();
				if (student.equals(new Student(string,string,null,0,null))) {
					return student;
				}
			}
			return null;
		}
		public Achievement traversalAch(String string) {
			
				Iterator<Achievement> achiterator = achlist.iterator();
				while (achiterator.hasNext()) {
					Achievement ach = achiterator.next();
					
					if (ach.equals(new Achievement(string)))
					return ach;
				}
					return null;
		}
		public Course traversalCourse(String string){
			Iterator<Course> iterator = courselist.iterator();
			
			while (iterator.hasNext()) {
				Course course = iterator.next();
				if (course.equals(new Course(string))) {
					return course;
				}
			}
			return null;
		}
		
		public void find(String name) {
			Student st = traversalStudent(name);
			String id = st.getId();
			Achievement ach = traversalAch(id);
			String subsno = ach.getSubjectsno();
			Course co   = traversalCourse(subsno);

			 Sop.sop("学号"+id+"\n姓名"+name+"\n课程号"+subsno+"\n课程名"+co.getName()+"\n成绩"+ach.getGrade()+"\n学分"+co.getCredit());
			
			
		}
}
