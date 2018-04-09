//程序3-6：一个简单的循环应用
/**
 * 输出100～200间所有能被3整除的整数
 * @author jerry
 *
 */
public class ForDemo {
	public static void main(String[]args){
		for(int i=100;i<200;i++){
			if(i%3==0){
				System.out.println(i+"\t");
			}
		}
		System.out.println("程序结束！");
	}
}
