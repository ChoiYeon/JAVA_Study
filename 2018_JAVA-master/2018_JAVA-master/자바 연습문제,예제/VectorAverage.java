import java.util.*;
public class VectorAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 0;
		double sum=0;
		Vector<Integer> v = new Vector<Integer>();
		while(i!=0){
			System.out.println("강수량 입력(0 입력시)종료");
			i=sc.nextInt();
			if(i==0){break;}
			v.add(i);
			int e=v.get(j);
			j++;
			for(int k = 0; k<j;k++){
			System.out.print(v.get(k)+" ");
			}
			System.out.println("");
			sum+=e;
			System.out.println("현재평균 : "+sum/v.size());
			
		}

	}

}
