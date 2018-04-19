//程序2-2：转义字符的应用
public class EspaceDemo {
	public static void main(String[]args){
		System.out.println("这是\u03c0");
		System.out.println("下面的数据输出是按照制表位控制的，每2个一行。");
		System.out.print(10+"\t"+20+"\n"+30+"\t"+40+"\n");
	}
}
