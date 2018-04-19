//程序2-6：利用Scanner类实现键盘输入
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数，敲回车结束");
		int num=sc.nextInt();
		System.out.println("你输入了一个："+num);
		System.out.println("请输入一个字符串，敲回车结束");
		String s=sc.next();
		System.out.println("你输入了字符串："+s);
		sc.close();
	}
}
