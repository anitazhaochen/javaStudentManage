package dlnu.zhaochen;

import java.util.Scanner;

public class Sop {
	public static <T>void sop(T t){
		System.out.println(t);
	}
	public static int InputNumber(int min,int max){
		int x = 0;
		Scanner in = new Scanner(System.in);
		do{
		try{
			x = in.nextInt();
			if(!(x >= min && x <= max)){
				Sop.sop("������"+(min-1)+"��"+(max+1)+"֮�������");
			}
		}
		catch(Exception e){
			String clear = in.next();
			Sop.sop(clear+"��Ч����������ȷ������");
		}
		}while (!(x >= min && x <= max));
		
		return x;
	}
}

