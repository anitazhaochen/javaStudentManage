package dlnu.zhaochen;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		LinkedList<Student> studentlist = new LinkedList<Student>();
		studentlist.add(new Student("2015081301","zhaochen","男",20,"汉族"));
		studentlist.add(new Student("2015081302","zhangsan","女",25,"纳西族"));
		studentlist.add(new Student("2015081303","lisi","男",30,"回族"));
		LinkedList<Course> courselist = new LinkedList<Course>();
		courselist.add(new Course("123456789","高数1",4.5));
		courselist.add(new Course("987654321","物理1",3));
		courselist.add(new Course("78954621","程序设计",5));
		LinkedList<Achievement> achlist = new LinkedList<Achievement>();
		achlist.add(new Achievement("123456789","2015081301",80.5));
		achlist.add(new Achievement("987654321","2015081302",92.5));
		achlist.add(new Achievement("78954621","2015081303",60));
		
		Operate operate = new Operate(studentlist,achlist,courselist);
		for(Scanner in = new Scanner(System.in); ; ) {

			
	        Sop.sop("0.退出\n1.输入学生信息\n2.删除学生\n3.修改学生信息\n4.显示所有学生信息\n5.查询学生信息\n6.统计学生人数\n7.统计各年龄学生的人数\n8.查询学生成绩明细\n9.统计各民族人数\n10.成绩排行榜");
				switch( Sop.InputNumber(0,11)) {
				case 1:
					operate.inputStudent();
					break;
				case 2:
					Sop.sop("输入需要删除的学生的姓名或者学号：");
					String string = in.next();
					studentlist.remove(new Student(string,string));
					break;
				case 3:
					Sop.sop("输入要修改学生的学号或姓名：");
					 string = in.next();
					Student stu = operate.traversalStudent(string);
					 stu.revise();
					
					break;
					
				case 4:
					Sop.sop("输入要修改学生的学号或姓名：");
					string = in.next();
					Sop.sop(operate.traversalStudent(string));
					break;
				case 5:
					Sop.sop("输入要修改学生的学号或姓名：");
					 string = in.next();
					operate.find(string);
					break;
				case 6:
					Sop.sop("学生总人数为："+studentlist.size());
					break;
				case 7:
					operate.countAge();
					break;
				case 0:
					
					return ;
				case 8:
					Sop.sop("输入学生姓名");
					String name;
					name = in.next();
				operate.find(name);
					break;
				case 9:
					operate.countNation();
					break;
				case 10:
				 operate.rankGrade();
				break;
				
					default:
						Sop.sop("**********请输入所给选项数字********");
						break;
				}
	}
	}

}
