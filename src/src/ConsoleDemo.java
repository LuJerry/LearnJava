//程序2-7：利用Console类实现键盘输入
/**
 * java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。
 */
import java.io.Console;
public class ConsoleDemo {
	public static void main(String[]args){
		Console cons=System.console();
		//String account=cons.readLine("请输入帐号");	
		//char[]pwd=cons.readPassword("请输入密码");	
	}
}
