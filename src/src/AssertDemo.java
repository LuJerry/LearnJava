//程序3-13：一个简单的断言应用
import java.util.Scanner;
public class AssertDemo {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int score=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入一个0～100以内的整数：");
			score=sc.nextInt();
			assert(score<=100&&score>=0):"输入了错误的成绩";
		}
	}
}
