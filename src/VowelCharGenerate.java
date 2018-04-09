//break和continue语句实例
/**
 * 随机生成字母，程序忽略元音字母A,E，I,O，U，只显示生成的每个元音字母，当
 * 碰到生成的字母为Q时或者出现的元音字母达到10个时，程序结束。
 * @author jerry
 *
 */
public class VowelCharGenerate {
	public static void main(String[]args){
		char ch='\0';
		int count=0;
		do{
			double x=Math.random()*100000;	//Math.random()随机产生一个0.0～1.0（不包含）的随机数
			int y=(int)x;
			char z=(char)(y%26+65);	//y%26得到的是0～25之间的整数，确保生成的字符ASCII码在65和90之间
			if(z=='Q'){
				break;
			}
			if(z!='A'&& z!='E'&& z!='I' && z!='O' && z!='U'){
				//如果产生的字母不是元音字母，则结束本次循环，进行循环条件判定
				continue;
			}
			System.out.println(z+"\t");
			count+=1;
		}while(count<10);
	}
}
