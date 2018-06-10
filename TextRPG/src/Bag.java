import java.util.*;
public class Bag {
	static String iname ;
	static int i=0;
	static Vector<String> bag = new Vector();
	static Scanner sc = new Scanner(System.in);
	public static void getitem() {
		if(i<5) {
		bag.add(iname);
		i++;
		}
		else {
			System.out.println("가방이 꽉 찼습니다.");
		}
	}
	public static void viewitem() throws InterruptedException {
		
		if(bag.size()==0) {
			System.out.println("현재 가방이 비어있습니다.");
		}
		else {
		for(int j=0;j<bag.size();j++) {
			System.out.print("|"+bag.get(j)+"|");
		}
		System.out.println();
		System.out.println("1.열람     2.사용  3.버리기  4.취소");
		String s= sc.next();
		if(s.equals("1")) {
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("원하는 아이템의 번호를 입력하세요.");
			int si=sc.nextInt();
			if(bag.get(si-1).equals("담배")) {
				System.out.println("뒷골목 깡패의 주머니에서 나온 물건");
				System.out.println("값어치는 얼마 안할 것 같다.");
				System.out.println("10 gold");
				viewitem();
			}
			else if(bag.get(si-1).equals("시가")) {
				System.out.println("이름 좀 날리는 뒷골목 깡패가 물고있던 시가");
				System.out.println("값어치는 얼마 안할 것 같다.");
				System.out.println("20 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("고블린의 귀")){
				System.out.println("고블린의 귀를 잘라낸 것");
				System.out.println("상점에 가서 팔면 돈을 준다.");
				System.out.println("20 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("오크의 방망이")) {
				System.out.println("오크가 사용하던 방망이");
				System.out.println("손에 맞지 않아 무기로 사용하긴 힘들 것 같다.");
				System.out.println("30 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("체력 포션")) {
				System.out.println("검붉은 액체가 들어있는 플라스크");
				System.out.println("마개에 달린 종이에는 너무 과용하지 마세요 라고 적혀있다.");
				System.out.println("사용시 체력이 회복된다.");
				System.out.println("0 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("마나 포션")) {
				System.out.println("청록색 액체가 들어있는 플라스크");
				System.out.println("마개에 달린 종이에는 너무 과용하지 마세요 라고 적혀있다.");
				System.out.println("사용시 마나가 회복된다.");
				System.out.println("0 gold");
				viewitem();
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				viewitem();
			}
			
			
		}
		if(s.equals("2")) {
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("원하는 아이템의 번호를 입력하세요.");
			int si1=sc.nextInt();
			 if (bag.get(si1-1).equals("체력 포션")) {
				 System.out.println("체력이 "+Hero.MHp/4+"만큼 회복되었습니다.");
				Hero.Hp+=(Hero.MHp/4);
				if(Hero.Hp>Hero.Mmana) {
					Hero.Hp=Hero.MHp;
				}
				viewitem();
			}
			else if (bag.get(si1-1).equals("마나 포션")) {
				System.out.println("마나가 "+Hero.Mmana/4+"만큼 회복되었습니다.");
				Hero.mana+=(Hero.Mmana/4);
				if(Hero.mana>Hero.Mmana) {
					Hero.mana=Hero.Mmana;
				}
				viewitem();
			}
			else {
				System.out.println("잘못입력하셨거나 사용할 수 없는 아이템입니다.");
			}
		}
		if(s.equals("3")) {
			Field.Work();
		}
		}
	}
	public static void buyitem() throws InterruptedException {
		System.out.println("아이템 상점에 온 것 을 환영해 BOY~~♂");
		System.out.println("1. 산다    2. 판다");
		String giveMoney1=sc.next();
		if(giveMoney1.equals("1")) {
			System.out.println("뭘 고를거야?");
			System.out.println();
			System.out.println("1.체력 포션 50G    2.마나 포션 70G");
			String buy = sc.next();
			if(buy.equals("1")) {
				if(i<5) {
					
					if(Hero.HGold-50<0) {
						System.out.println();
						System.out.println("어이쿠 돈이 없는걸? 나가줬으면해 당장 ");
						Field.City();
					}
					else {
						System.out.println();
					System.out.println("구매해줘서 고마워 Boy~~");
					iname="체력 포션";
					getitem();
					Hero.HGold-=50;
					buyitem();
					}
				}
				else if(i>4) {
					System.out.println("어이쿠 이미 가방이 묵직한데? 비우고 오는게 어때?");
					buyitem();
				}
		}
			else if(buy.equals("2")) {
				if(i<5) {
					
					if(Hero.HGold-100<0) {
						System.out.println();
						System.out.println("어이쿠 돈이 없는걸? 나가줬으면해 당장 ");
						Field.City();
					}
					else {
						System.out.println();
					System.out.println("구매해줘서 고마워 Boy~~");
					iname="마나 포션";
					getitem();
					Hero.HGold-=100;
					buyitem();
					}
				}
				else if(i>4) {
					System.out.println("어이쿠 이미 가방이 묵직한데? 비우고 오는게 어때?");
					buyitem();
				}
		}
		else if(giveMoney1.equals("2")) {
			System.out.println("뭘 팔 생각이야?");
		}
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("원하는 아이템의 번호를 입력하세요.");
			int si1=sc.nextInt();
			if(bag.get(si1-1).equals("담배")) {
				bag.remove(si1-1);
				System.out.println("10 gold를 획득했습니다.");
				viewitem();
			}
			else if(bag.get(si1-1).equals("시가")) {
				bag.remove(si1-1);
				System.out.println("20 gold를 획득했습니다.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("고블린의 귀")){
				bag.remove(si1-1);
				System.out.println("20 gold를 획득했습니다.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("오크의 방망이")) {
				bag.remove(si1-1);
				System.out.println("30 gold를 획득했습니다.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("체력 포션")) {
				bag.remove(si1-1);
				System.out.println("0 gold를 획득했습니다.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("마나 포션")) {
				bag.remove(si1-1);
				System.out.println("0 gold를 획득했습니다.");
				viewitem();
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				viewitem();
			}
		}
		
	}
}
