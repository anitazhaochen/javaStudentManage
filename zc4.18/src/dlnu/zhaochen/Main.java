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
		courselist.add(new Course("高数1","123456789",4.5));
		courselist.add(new Course("物理1","987654321",3));
		courselist.add(new Course("程序设计","78954621",5));
		LinkedList<Achievement> achlist = new LinkedList<Achievement>();
		achlist.add(new Achievement("123456789","2015081301",80.5));
		achlist.add(new Achievement("987654321","2015081302",92.5));
		achlist.add(new Achievement("78954621","2015081303",60));
		
		Operate operate = new Operate();
		for(Scanner in = new Scanner(System.in); ; ) {

			
	        Sop.sop("0.退出\n1.输入学生信息\n2.删除学生\n3.修改学生信息\n4.显示所有学生信息\n5.查询学生信息\n6.统计学生人数\n7.统计各年龄学生的人数\n8.查询学生成绩明细\n9.统计各民族人数\n10.成绩排行榜");
				switch( Sop.InputNumber(0,11)) {
				case 1:
					operate.inputStudent(studentlist);
					break;
				case 2:
					Sop.sop("输入需要删除的学生的姓名或者学号：");
					String string = in.next();
					studentlist.remove(new Student(string,string));
					break;
				case 3:
					Student stu = operate.traversalStudent(studentlist);
					 stu.revise();
					
					break;
					
				case 4:
					Sop.sop(operate.traversalStudent(studentlist));
					break;
				case 5:
					Sop.sop(operate.traversalStudent(studentlist));
					break;
				case 6:
					Sop.sop("学生总人数为："+studentlist.size());
					break;
				case 7:
					operate.countAge(studentlist);
					break;
				case 0:
					
					return ;
				case 8:
				operate.traversalAch(achlist);
					break;
				case 9:
					operate.countNation(studentlist);
					break;
				case 10:
				 operate.rankGrade(achlist);
				break;
				
					default:
						Sop.sop("**********请输入所给选项数字********");
						break;
				}
	}
	}

}
