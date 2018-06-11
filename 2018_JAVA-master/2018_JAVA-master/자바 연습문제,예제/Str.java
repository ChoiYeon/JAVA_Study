import java.util.Scanner;

public class Str {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		String b;
		System.out.println("문자열 입력 ");
		 String a=sc.nextLine();
		 for(int i=0;i<=a.length();i++){
			 b=a.substring(0,i);
		 System.out.println(a.substring(i)+b);
		 
		 }
	}

}
