import java.util.*;
public class Field {
	static int random;
	static int Random;
	static int Progress;
	String thisStage;
	static int Gorandom;
	static int Citycnt=0;;
	
	static Scanner sc= new Scanner(System.in);
public static void Hello_Monster() throws InterruptedException {
		if(Progress<15&&Random==0) {
			Gorandom=(int) (Math.random() * 2) + 6;
			Monster.name="뒷골목 깡패";
			Monster.Str=3;
			Monster.Hp=10;
			Monster.EXP=2;
			Monster.Gold=Gorandom;
			Bag.iname="담배";
			random=(int) (Math.random() * 3) ;
		}
		else if(Progress==15) {
			Gorandom=(int) (Math.random() * 5) ;
			Monster.name="이름 좀 날린 뒷골목 깡패";
			Monster.Str=5;
			Monster.Hp=17;
			Monster.Gold=10;
			Monster.EXP=5;
			Bag.iname="시가";
			random=(int) (Math.random() * 3) ;

		}
		else if(Progress>15&&Random==1) {
			Gorandom=(int) (Math.random() * 5) + 10;
			Monster.name="고블린";
			Monster.Str=5;
			Monster.Hp=18;
			Monster.EXP=7;
			Monster.Gold=Gorandom;
			random=(int) (Math.random() * 3) ;
			if(random==2) {
				Bag.iname="고블린의 귀";
			}
			
		}
		else if(Progress>15&&Random==2) {
			Gorandom=(int) (Math.random() * 7) + 13;
			Monster.name="오크";
			Monster.Str=8;
			Monster.Hp=21;
			Monster.EXP=10;
			Monster.Gold=Gorandom;
			random=(int) (Math.random() * 5) ;
			if(random==4) {
				Bag.iname="오크의 방망이";
			
			}
		}
		System.out.println(Monster.name+"가(이) 나타났다!");
		Thread.sleep(1000);
		Fight.Turn();
	}

	public static void Work() throws InterruptedException {
		if(Progress==0) {
			System.out.println();
			System.out.println("===============");
			System.out.println("STAGE 1 : 뒷 골 목");
			System.out.println("===============");
			System.out.println("! 이 스테이지에는 마을이 존재하지 않습니다!");
			System.out.println();
			Thread.sleep(2000);
			Progress++;
			Work();
		}
		if(Progress==16) {
			System.out.println();
			System.out.println("===============");
			System.out.println(" STAGE 2 : 초 원");
			System.out.println("===============");
			System.out.println();
			Thread.sleep(2000);
			Progress++;
			Work();
		}
		if(Progress<16) {
			if(Progress==15) {
				Hello_Monster();
			}
		System.out.println("현재 스테이지 : 뒷골목 <Stage1>");
		System.out.println("현재 진행도 15\\"+Progress);
		
		}
		if(Progress>15&&Progress<31) {
			System.out.println("현재 스테이지 : 초원 <Stage2>");
			System.out.println("현재 진행도 15\\"+(Progress-16));
		}
		System.out.println("w = 전진   t = 내정보   i = 인벤토리");
		String W=sc.next();
		if(W.equals("w")) {
			Stage();
		}
		else if(W.equals("t")) {
			Hero.Stat();
		}
		else if(W.equals("i")) {
			System.out.println("가방");
			Bag.viewitem();
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			Thread.sleep(1000);
			Work();
		}
		
	}
	public static void Stage() throws InterruptedException {
		if(Progress<15) {
			Random=(int) (Math.random() * 3) ;
			if(Random==0) {
				Hello_Monster();
			}
			Progress+=1;
			Hero.mana+=5;
			Work();
		}
		if(Progress==15) {
			System.out.println("스테이지 보스가 출현했습니다!");
			Hello_Monster();
		}
		if(Progress>15&&Progress<30) {
			Random=(int) (Math.random() * 7) + 1;
			if(Random==1||Random==2) {
				Hello_Monster();
			}
			else if(Random==7&&Citycnt<2) {
				System.out.println("마을을 발견하셨습니다!");
				Thread.sleep(1000);
				Citycnt++;
				City();
			}
			Progress+=1;
			Hero.mana+=3;
			if(Hero.mana>Hero.Mmana) {
				Hero.mana=Hero.Mmana;
			}
			Work();
			
		}
		
	}
	
static void City() throws InterruptedException {
	if(Citycnt==1) {
		System.out.println("마을엔 처음이신가요?");
		Thread.sleep(800);
		System.out.println("이 곳은 여행에 필요한 물품 혹은 장비를 구매하거나 잠시 쉬며 체력을 회복할 수 있는 장소입니다.");
		Thread.sleep(1000);
		System.out.println("아쉽게도 "+Hero.name+"님은 이곳에 오래 머물 시간이 없는 듯 하니 하나만 선택하셔서야겠네요.");
		Thread.sleep(1000);
		System.out.println("마을에 머무시는 동안 "+Hero.name+"님은 여관을 잡아 휴식을 취하거나, 상점 중 한 곳을 선택해 들어가 물건을 구매하시거나 파실 수 있습니다.");
		Thread.sleep(1000);
		System.out.println("상점은 크게 세곳으로 나뉘며 아이템 상점과 무기 상점, 방어구 상점으로 나뉘어있습니다.");
		Thread.sleep(1000);
		System.out.println("각 상점에서 파는 물건은 다르며 스테이지에 따라 물품의 질도 달라집니다.");
		Thread.sleep(1000);
		System.out.println("상점에 있는 물건은 몬스터를 잡아 획득한 Gold나 아이템을 판매하여 획득한 Gold로 사실 수 있습니다.");
		Thread.sleep(1000);
		System.out.println("만약 상점에 들리는 것을 포기하시고 여관에서 쉬신다면 골드를 지불하여 여관을 이용하실 수 있으며 이용료는 스테이지마다 달라집니다.");
		Thread.sleep(1000);
		System.out.println("여관을 이용하신 후에는 체력이 회복됩니다. ");
		Thread.sleep(1000);
		System.out.println("이상 즐거운 시간 되시길 바랍니다.");
		Thread.sleep(800);
		Citycnt=2;
	}
	else if(Citycnt==2) {
		System.out.println("마을에 오신것을 환영합니다.");
	}
	System.out.println("무엇을 이용하시겠습니까?");
	Thread.sleep(800);
	System.out.println("1.상점    2.여관  3.마을을 나간다.");
	String Cityc=sc.next();
	if(Cityc.equals("1")) {
		System.out.println("어느 상점을 이용하시겠습니까?");
		Thread.sleep(800);
		System.out.println("1.아이템 상점    2.무기 상점    3.방어구 상점");
		String giveMoney=sc.next();
		if(giveMoney.equals("1")) {
			Bag.buyitem();
		}
	}
	else if(Cityc.equals("2")) {
		System.out.println("여관을 이용하시겠습니까? 1.yes 2.no");
		String real = sc.next();
		if(real.equals("1")) {
			if(Hero.HGold-10<0) {
				System.out.println("돈이 부족하시군요 나가세요.");
				City();
			}
			else {
			System.out.println("여관을 이용하셨습니다.");
			random=(int) (Math.random() * 4)+1;
			if(random <3) {
				System.out.println("그럭저럭 잘 쉬었습니다.");
				Thread.sleep(800);
				System.out.println("체력이 1/3만큼 회복됩니다.");
				Thread.sleep(800);
				
				Hero.Hp+=((int)Hero.MHp/3);
				if(Hero.Hp>Hero.MHp) {
					Hero.Hp=Hero.MHp;
				}
				System.out.println("마을을 떠났습니다.");
				Thread.sleep(1000);
				Work();
			}
			else if(random==3) {
				System.out.println("세상 모든 것이 밝아 보입니다.");
				Thread.sleep(1000);
				System.out.println("이렇게 상쾌한 아침도 정말 오랫만인듯합니다.");
				Thread.sleep(1000);
				System.out.println("체력의 1/2이 회복됩니다.");
				Hero.Hp+=((int)Hero.MHp/2);
				if(Hero.Hp>Hero.MHp) {
					Hero.Hp=Hero.MHp;
				}
				System.out.println("마을을 떠났습니다.");
				Thread.sleep(1000);
				Work();
			}
			}
		}
		else if(real.equals("2")) {
			City();
		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	else if(Cityc.equals("3")) {
		Work();
	}
	else {
		System.out.println("잘못 입력하셨습니다.");
		City();
	}
	}

public static void main(String args[]) throws InterruptedException {
	Field a = new Field();
	a.Work();
}
}
