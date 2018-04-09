//程序3-7：输出50个能被3整除的数
public class ForDemo50 {
	public static void main(String[]args){
		int count=0;
		for(int i=100;i<200;i++){
			count+=1;
			if(i%3==0){
				System.out.println(i+"\t");
			}
			if(count==50){
				break;
			}
		}
		System.out.println("程序结束！");
	}
}
