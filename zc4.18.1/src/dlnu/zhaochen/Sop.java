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
				Sop.sop("请输入"+(min-1)+"到"+(max+1)+"之间的数字");
			}
		}
		catch(Exception e){
			String clear = in.next();
			Sop.sop(clear+"无效，请输入正确的数字");
		}
		}while (!(x >= min && x <= max));
		
		return x;
	}
}

