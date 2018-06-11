import java.util.*;
public class Fight {
	static Scanner sc = new Scanner(System.in);
	private static Monster monster;
	static Hero hero;
	public static void Turn() throws InterruptedException{
		if(monster.Hp<=0) {
			System.out.println("몬스터가 쓰러졌습니다 ! ");
			Thread.sleep(1000);
			System.out.println("Gold "+ monster.Gold+"와 경험치"+monster.EXP+"를 획득하셨습니다!");
			Hero.HGold+=monster.Gold;
			Hero.HEXP+=monster.EXP;
			if(Field.random==2) {
				Bag.getitem();
				System.out.println();
				System.out.println(Bag.iname+"을 획득하셨습니다.");
			}
			Thread.sleep(1000);
			Hero.Levelup();
			System.out.println();
			Field.Progress+=1;
			Field.Work();
		}
		else if(monster.Hp>0) {
			
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("당신의 HP = "+Hero.Hp);
		System.out.println("몬스터의 남은 HP = "+Monster.Hp);
		System.out.println("1.전투 2.방어 3.가방 4.도망5.tset");
		String c=sc.next();
		
		
		if(c.equals("1")) {
			
			cfight(hero);
		}
		else if (c.equals("2")) {
			Hero.Garde(monster);
		}
		else if (c.equals("3")) {
			
		}
		else if(c.equals("4")) {
			System.out.println("도망치셨습니다.");
			Field.Progress+=1;
			Field.Work();
		}
		else if(c.equals("5")) {
			Hero.HEXP+=20;
			Hero.Levelup();
		}
		else{
			System.out.println();
			System.out.println("잘못 입력하셨습니다!");
			System.out.println();

			Turn();
		}
		}
	}
	public static void cfight(Hero hero) throws InterruptedException {
		System.out.println();
		System.out.println("어떻게 공격하시겠습니까?");
		
		System.out.println("1. 기술    2. 마법  3. 기본 공격  ");
		int p=sc.nextInt();
		if(p==1) {
			if(Hero.Level<2) {
				System.out.println("아직 습득한 스킬이 존재하지 않습니다!");
				cfight(hero);
			}
			else if(Hero.Level>=2) {
				System.out.println("어떤 스킬을 사용하시겠습니까?");
				System.out.println("1.후려치기  2.돌아가기");
				System.out.print(">>");
				int choose = sc.nextInt();
				if(choose==1) {
					Hero.QAttack(monster);
				}
				else if(choose==2) {
					cfight(hero);
				}
			}
		}
		else if(p==2) {
			if(Hero.Level<3) {
			System.out.println("아직 습득한 마법이 존재하지 않습니다!");
			cfight(hero);
			}
			else if(Hero.Level>=2) {
				System.out.println("어떤 마법을 사용하시겠습니까?");
				System.out.println("1.파이어 볼  2.돌아가기");
				System.out.print(">>");
				int choose = sc.nextInt();
				if(choose==1) {
					Hero.WAttack(monster);
				}
				else if(choose==2) {
					cfight(hero);
				}
			}
		}
		else if(p==3) {
			hero.Attack(monster);
		}
		else {
			System.out.println();
			System.out.println("잘못 입력하셨습니다!");
			System.out.println();
			Thread.sleep(2000);
			Turn();
		}
	}
}
