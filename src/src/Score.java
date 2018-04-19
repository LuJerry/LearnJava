//程序3-4：多分支结构
public class Score {
	public static void main(String[]args){
		int score=85;
		String level=null;
		if(score>=90){
			level="优秀";
		}
		else if(score>=80 && score<90){
			level="良好";
		}
		else if(score>=70 && score<80){
			level="中等";
		}
		else if(score>=60 && score<70){
			level="及格";
		}
		else{
			level="不及格";
		}
		System.out.println("转换后的成绩为："+level);
	}
}
