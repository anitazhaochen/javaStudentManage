package dlnu.zhaochen;

import java.util.Scanner;


public class Main {
	public static void main(String [] args){
	
	

		LinkList studentlist = new LinkList();
		Student student = new Student("2015081301","zhaochen","男",20,"汉族");
		Student student1 = new Student("2015081302","zhangsan","女",25,"纳西族");
		Student student2 = new Student("2015081303","lisi","男",30,"回族");
		studentlist.linkFirst(student);
		studentlist.linkFirst(student1);
		studentlist.linkFirst(student2);
		LinkList courselist = new LinkList();
		Course course = new Course("高数1","123456789",4.5);
		Course course1 = new Course("物理1","987654321",3);
		Course course2 = new Course("程序设计","78954621",5);
		courselist.linkFirst(course);
		courselist.linkFirst(course1);
		courselist.linkFirst(course2);
		LinkList achlist = new LinkList();
		Achievement ach = new Achievement("123456789","2015081301",80.5);
		Achievement ach1 = new Achievement("987654321","2015081302",92.5);
		Achievement ach2 = new Achievement("78954621","2015081303",60);
		achlist.linkFirst(ach);
		achlist.linkFirst(ach1);
		achlist.linkFirst(ach2);    //  初始化程序
		
	
				for(Scanner in = new Scanner(System.in); ; ) {

			
		        Sop.sop("0.退出\n1.输入学生信息\n2.删除学生\n3.修改学生信息\n4.显示所有学生信息\n5.查询学生信息\n6.统计学生人数\n7.统计各年龄学生的人数\n8.查询学生成绩明细\n9.统计各民族人数\n10.成绩排行榜");
					switch( Sop.InputNumber(0,11)) {
					case 1:
						new Student().inputStudent(studentlist);
						break;
					case 2:
						Sop.sop("输入需要删除的学生的姓名或者学号：");
						String string = in.next();
						studentlist.delete(new Student(string,string));
						break;
					case 3:
						Sop.sop("输入要修改学生的学号或姓名：");
						 string = in.next();
	
						Student s = (Student) studentlist.find(new Student(string,string));
						s.revise();
						break;
						
					case 4:
						studentlist.showObj();
						break;
					case 5:
						Sop.sop("输入需要的学生的姓名或者学号：");
						 string = in.next();
						Student st = (Student) studentlist.find(new Student(string,string));
						Sop.sop(((Student)st).toString());
						break;
					case 6:
						Sop.sop("学生总人数为："+studentlist.size());
						break;
					case 7:
						new Student().countAge(studentlist);
						break;
					case 0:
						
						return ;
					case 8:
						Sop.sop("输入学生学号");
						Sop.sop(achlist.find(new Achievement(in.next())));
						break;
					case 9:
						new Student().countNation(studentlist);
						break;
					case 10:
					 new Achievement().rankGrade(achlist);
					break;
					
						default:
							Sop.sop("**********请输入所给选项数字********");
							break;
					}
		}
	}
}
