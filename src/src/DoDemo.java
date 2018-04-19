//程序3-9：用do语句输出50个能被3整除的数
public class DoDemo {
	public static void main(String[]args){
		int count=0;
		int i=100;
		do{
			if(i%3==0){
				count+=1;
				System.out.println(i+"\t");
			}
			i++;
		}while(count<50);
		System.out.println("程序结束！");
	}
}
