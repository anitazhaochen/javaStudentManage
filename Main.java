package dlnu.zhaochen;

import java.util.Scanner;


public class Main {
	public static void main(String [] args){
	
	

		LinkList studentlist = new LinkList();
		Student student = new Student("2015081301","zhaochen","��",20,"����");
		Student student1 = new Student("2015081302","zhangsan","Ů",25,"������");
		Student student2 = new Student("2015081303","lisi","��",30,"����");
		studentlist.linkFirst(student);
		studentlist.linkFirst(student1);
		studentlist.linkFirst(student2);
		LinkList courselist = new LinkList();
		Course course = new Course("����1","123456789",4.5);
		Course course1 = new Course("����1","987654321",3);
		Course course2 = new Course("�������","78954621",5);
		courselist.linkFirst(course);
		courselist.linkFirst(course1);
		courselist.linkFirst(course2);
		LinkList achlist = new LinkList();
		Achievement ach = new Achievement("123456789","2015081301",80.5);
		Achievement ach1 = new Achievement("987654321","2015081302",92.5);
		Achievement ach2 = new Achievement("78954621","2015081303",60);
		achlist.linkFirst(ach);
		achlist.linkFirst(ach1);
		achlist.linkFirst(ach2);    //  ��ʼ������
		
	
				for(Scanner in = new Scanner(System.in); ; ) {

			
		        Sop.sop("0.�˳�\n1.����ѧ����Ϣ\n2.ɾ��ѧ��\n3.�޸�ѧ����Ϣ\n4.��ʾ����ѧ����Ϣ\n5.��ѯѧ����Ϣ\n6.ͳ��ѧ������\n7.ͳ�Ƹ�����ѧ��������\n8.��ѯѧ���ɼ���ϸ\n9.ͳ�Ƹ���������\n10.�ɼ����а�");
					switch( Sop.InputNumber(0,11)) {
					case 1:
						new Student().inputStudent(studentlist);
						break;
					case 2:
						Sop.sop("������Ҫɾ����ѧ������������ѧ�ţ�");
						String string = in.next();
						studentlist.delete(new Student(string,string));
						break;
					case 3:
						Sop.sop("����Ҫ�޸�ѧ����ѧ�Ż�������");
						 string = in.next();
	
						Student s = (Student) studentlist.find(new Student(string,string));
						s.revise();
						break;
						
					case 4:
						studentlist.showObj();
						break;
					case 5:
						Sop.sop("������Ҫ��ѧ������������ѧ�ţ�");
						 string = in.next();
						Student st = (Student) studentlist.find(new Student(string,string));
						Sop.sop(((Student)st).toString());
						break;
					case 6:
						Sop.sop("ѧ��������Ϊ��"+studentlist.size());
						break;
					case 7:
						new Student().countAge(studentlist);
						break;
					case 0:
						
						return ;
					case 8:
						Sop.sop("����ѧ��ѧ��");
						Sop.sop(achlist.find(new Achievement(in.next())));
						break;
					case 9:
						new Student().countNation(studentlist);
						break;
					case 10:
					 new Achievement().rankGrade(achlist);
					break;
					
						default:
							Sop.sop("**********����������ѡ������********");
							break;
					}
		}
	}
}
