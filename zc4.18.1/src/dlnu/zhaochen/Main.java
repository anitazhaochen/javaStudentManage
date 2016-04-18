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
		courselist.add(new Course("123456789","����1",4.5));
		courselist.add(new Course("987654321","����1",3));
		courselist.add(new Course("78954621","�������",5));
		LinkedList<Achievement> achlist = new LinkedList<Achievement>();
		achlist.add(new Achievement("123456789","2015081301",80.5));
		achlist.add(new Achievement("987654321","2015081302",92.5));
		achlist.add(new Achievement("78954621","2015081303",60));
		
		Operate operate = new Operate(studentlist,achlist,courselist);
		for(Scanner in = new Scanner(System.in); ; ) {

			
	        Sop.sop("0.�˳�\n1.����ѧ����Ϣ\n2.ɾ��ѧ��\n3.�޸�ѧ����Ϣ\n4.��ʾ����ѧ����Ϣ\n5.��ѯѧ����Ϣ\n6.ͳ��ѧ������\n7.ͳ�Ƹ�����ѧ��������\n8.��ѯѧ���ɼ���ϸ\n9.ͳ�Ƹ���������\n10.�ɼ����а�");
				switch( Sop.InputNumber(0,11)) {
				case 1:
					operate.inputStudent();
					break;
				case 2:
					Sop.sop("������Ҫɾ����ѧ������������ѧ�ţ�");
					String string = in.next();
					studentlist.remove(new Student(string,string));
					break;
				case 3:
					Sop.sop("����Ҫ�޸�ѧ����ѧ�Ż�������");
					 string = in.next();
					Student stu = operate.traversalStudent(string);
					 stu.revise();
					
					break;
					
				case 4:
					Sop.sop("����Ҫ�޸�ѧ����ѧ�Ż�������");
					string = in.next();
					Sop.sop(operate.traversalStudent(string));
					break;
				case 5:
					Sop.sop("����Ҫ�޸�ѧ����ѧ�Ż�������");
					 string = in.next();
					operate.find(string);
					break;
				case 6:
					Sop.sop("ѧ��������Ϊ��"+studentlist.size());
					break;
				case 7:
					operate.countAge();
					break;
				case 0:
					
					return ;
				case 8:
					Sop.sop("����ѧ������");
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
						Sop.sop("**********����������ѡ������********");
						break;
				}
	}
	}

}
