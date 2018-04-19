//程序2-5：字符串的比较
public class StringDemo {
	public static void main(String[]args){
		String s1="Morning!";
		String s2="morning!";
		boolean eq1=s1.equals(s2);
		System.out.println("\"Morning\".equals(\"morning\")结果是"+eq1);
		boolean eq=s1.equalsIgnoreCase(s2);
		System.out.println("\"Morning\".equalsIgnoreCase(\"morning\")结果是"+eq);
		int res=s1.compareTo(s2);
		System.out.println("\"Morning\".compareTo(\"morning\")结果是"+res);
	}
}
