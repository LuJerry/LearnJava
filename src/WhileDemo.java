//程序3-8：用while输出50个能被3整除的数
public class WhileDemo {
	public static void main(String[]args){
		int count=0;
		int i=100;
		while(count<50){
			if(i%3==0){
				System.out.println(i+"\t");
				count+=1;
			}
			i++;
		}
		System.out.println("程序结束！");
	}
}
