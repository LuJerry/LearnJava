//fei di fui fang fa qiu jie chen
public class Selectnjcs {
	static int fac(int n){
		int i=1,mult=1;
		while(i<=n){
			mult=mult*i;
			i++;
		}
		return mult;
	}
	public static void main(String[]args){
		int res=fac(15);
		System.out.println(res);
	}
}
