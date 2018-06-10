import java.util.Scanner;
public class Scan {
	 static int number;
	 static int locate;
	static String name;
	static int num;
	static String cancel;
	static int cancel_num;
	static String []S ={"---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t"};
	
	static String []A ={"---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t"};
	
	static String []B ={"---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t","---\t"};
	public static void number(){//시작
		Scanner sc = new Scanner(System.in);
			System.out.println("좌석구분  S[1] A[2] B[3]>>");
			locate = sc.nextInt();
			if (locate == 1){
				
				System.out.print("S>>");
			for(int i=0;i<10;i++){
				System.out.print(S[i]);
				
			
			}
			System.out.println("");
				System.out.print("이름>>");
				name=sc.next();
				System.out.print("번호>>");
				num=sc.nextInt();
				S[num-1]=name+"\t";
				
			}
			else if (locate == 2){
				
				System.out.print("A>>");
			for(int i=0;i<10;i++){
				System.out.print(A[i]);
				
			
			}
			System.out.println("");
			System.out.print("이름>>");
			name=sc.next();
			System.out.print("번호>>");
			num=sc.nextInt();
			A[num-1]=name+"\t";
			
			}
			else if (locate == 3){
				
				System.out.print("B>>");
			for(int i=0;i<10;i++){
				System.out.print(B[i]);
				
			
			}
			System.out.println("");
			System.out.print("이름>>");
			name=sc.next();
			System.out.print("번호>>");
			num=sc.nextInt();
			B[num-1]=name+"\t";
			
			}
			System.out.print("예약: 1, 조회:2, 취소:3, 끝내기:4>>");
			number= sc.nextInt();
			if(number==1){
				Scan.number();
			}
			else if(number==2){
				Scan.see();
			}
			else if(number==3){
				Scan.cancel();
			}
			else if(number==4){
				System.out.println("종료");
			}
		}//끝
	public static void see(){//시작
		 Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < S.length; i ++){
			System.out.print(S[i]);
			
		}
		System.out.println();
		for(int i = 0 ; i < S.length; i ++){
			System.out.print(A[i]);
		
		}
		System.out.println();
		for(int i = 0 ; i < S.length; i ++){
			System.out.print(B[i]);
		
		}
		System.out.println();
		System.out.print("예약: 1, 조회:2, 취소:3, 끝내기:4>>");
		number= sc.nextInt();
		if(number==1){
			Scan.number();
		}
		else if(number==2){
			Scan.see();
		}
		else if(number==3){
			Scan.cancel();
		}
		else if(number==4){
			System.out.println("종료");
		}
	}
		public static void cancel(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("좌석 S[1] A[2] B[3]>>");
			 cancel_num=sc.nextInt();
			 System.out.print("이름 입력>>");
			 cancel = sc.next();
			 if(cancel_num == 1){
			 for(int i = 0 ; i < S.length; i++ ){
				 if(S[i].equals(cancel+"\t")){
					 S[i]="---\t";
				 }
			 }
			 }
			 System.out.print("예약: 1, 조회:2, 취소:3, 끝내기:4>>");
				number= sc.nextInt();
				if(number==1){
					Scan.number();
				}
				else if(number==2){
					Scan.see();
				}
				else if(number==3){
					Scan.cancel();
				}
				else if(number==4){
					System.out.println("종료");
				}
			 
		}
	}

class Reservation extends Scan{
	 public void Reservation_Scan(){
		 
			
		 Scanner sc = new Scanner(System.in);
			System.out.println("명품콘서트홀 예약 시스템 입니다.");
			System.out.print("예약: 1, 조회:2, 취소:3, 끝내기:4>>");
			number= sc.nextInt();
			if(number==1){
				Scan.number();
			}
			else if(number==2){
				Scan.see();
			}
			else if(number==3){
				Scan.cancel();
			}
			else if(number==4){
				System.out.println("종료");
			}
			}
	public static void main(String [] args){
		Reservation a=new Reservation();
		
		a.Reservation_Scan();
	}
	}
