//shun xu cha zhao
public class SequenceSearchApp {
	public static void main(String[] args) {
		String[] arr={"zhangsan","lisi","wangermazi"};
		String temp=args[0];
		for(int i=0;i<arr.length;i++){
			if(temp.equals(arr[i])){
				System.out.println("");
				return;
			}
		}
		System.out.println(temp+"buzai arr jihezhong");
	}
}
