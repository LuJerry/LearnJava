/**
 *功能:实现接受三个班级各四名学生的成绩，然后计算各个班级学生成绩的平均分
 * @author jerry
 *知识点:二重循环，外层循环控制班级的数量，内层循环控制班级内学生的数量
 */
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		int classNum=3;
		int stuNum=4;
		int score=0;
		double avg=0;
		int sum=0;
		for(int i=1;i<=classNum;i++){
			sum=0;
			System.out.println("***请输入第"+i+"个班级的学生成绩***");
			for(int j=1;j<=stuNum;j++){
				Scanner input = new Scanner(System.in);
				System.out.print("请输入第"+j+"个学生成绩:");
				score=input.nextInt();
				sum=sum+score;
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级的平均分为："+avg);
		}
	}
}
