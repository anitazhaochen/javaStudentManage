package dlnu.zhaochen;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		LinkedList<Student> studentlist = new LinkedList<Student>();
		studentlist.add(new Student("2015081301","zhaochen","��",20,"����"));
		studentlist.add(new Student("2015081302","zhangsan","Ů",25,"������"));
		studentlist.add(new Student("2015081303","lisi","��",30,"����"));
		LinkedList<Course> courselist = new LinkedList<Course>();
		courselist.add(new Course("����1","123456789",4.5));
		courselist.add(new Course("����1","987654321",3));
		courselist.add(new Course("�������","78954621",5));
		LinkedList<Achievement> achlist = new LinkedList<Achievement>();
		achlist.add(new Achievement("123456789","2015081301",80.5));
		achlist.add(new Achievement("987654321","2015081302",92.5));
		achlist.add(new Achievement("78954621","2015081303",60));
		
		Operate operate = new Operate();
		for(Scanner in = new Scanner(System.in); ; ) {

			
	        Sop.sop("0.�˳�\n1.����ѧ����Ϣ\n2.ɾ��ѧ��\n3.�޸�ѧ����Ϣ\n4.��ʾ����ѧ����Ϣ\n5.��ѯѧ����Ϣ\n6.ͳ��ѧ������\n7.ͳ�Ƹ�����ѧ��������\n8.��ѯѧ���ɼ���ϸ\n9.ͳ�Ƹ���������\n10.�ɼ����а�");
				switch( Sop.InputNumber(0,11)) {
				case 1:
					operate.inputStudent(studentlist);
					break;
				case 2:
					Sop.sop("������Ҫɾ����ѧ������������ѧ�ţ�");
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
					Sop.sop("ѧ��������Ϊ��"+studentlist.size());
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
						Sop.sop("**********����������ѡ������********");
						break;
				}
	}
	}

}
