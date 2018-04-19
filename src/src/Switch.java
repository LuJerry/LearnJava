//程序3-5：switch多分支结构
public class Switch {
	public static void main(String[]args){
		int score=80;
		String level=null;
		char c=score>=80 && score<90? 'B'
				:score>=70 && score<80? 'C':score>=90? 'A'
						:score>=60 && score<70? 'D':'E';
		switch(c){
		case'B':
			level="良好";
			break;
		case'C':
			level="中等";
			break;
		case'A':
			level="优秀";
			break;
		case'D':
			level="合格";
			break;
		case'E':
			level="不合格";
			break;
		}
		System.out.println("转换后的成绩是:"+level);
	}
}
