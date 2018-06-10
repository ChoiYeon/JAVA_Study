import java.util.Scanner;
import java.util.Calendar;
public class TimeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cut;
		int i;
		int []last = new int [100];
		int nowtime[]=new int[100];
		int min=1000;
		int save=0;
		String result = null;
		String []a = new String[100];
		String key;
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.println("플레이어 이름 입력 하시고 ,더이상 없다면 x를 입력하세요");
		for(i = 0; i<a.length;i++){
			a[i]=sc.next();
			if(a[i].equals("x")){
				i=i--;
				break;
			}
			
		}
		key=sc.nextLine();
		for(int j=0;j<i;j++){
			System.out.println(a[j]+" 시작 Enter키 입력");
			
			 key=sc.nextLine();
			 Calendar cal = Calendar.getInstance();
			 nowtime[j]=cal.get(Calendar.SECOND);
			
				System.out.println("현제 초 시간 = "+nowtime[j]);
				System.out.println("10초 예상 후 Enter 키 입력 ");
			 
				
				key=sc.nextLine();
				Calendar cal1 = Calendar.getInstance();
				last[j]=cal1.get(Calendar.SECOND);
					System.out.println("현재 초 시간 = "+last[j]);
				
					cut=nowtime[j]+10;
					if(nowtime[j]>last[j]){
						last[j]+=60;
						last[j]=  last[j]-cut ;
						last[j]=Math.abs(last[j]);
					}
					else if(nowtime[j]<last[j]){
						last[j]= last[j]-cut;
						last[j]=Math.abs(last[j]);
					}
					else if(nowtime[j]==last[j]){
						last[j]=10;
					}
					
			
		}
		for(int j=0;j<i;j++){
			if(min>last[j]){
				min=last[j];
				result="우승자는 "+min+"의 오차를 가진"+a[j]+"입니다.";
			}
			else if(min==last[j]){
				result="누군가 비겼습니다.";
			}
		}
		for(int j=0;j<i;j++){
			System.out.println(a[j]+"의 오차는 "+last[j]+"입니다.");
		}
		System.out.println(result);
		
	}

}
