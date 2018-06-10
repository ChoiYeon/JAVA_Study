
public class Hero{
	static int PHp;
	static int MHp=50;
	static int Hp=50;
	static int Str=5;
	static int Magic=5;
	static double Speed=1;
	static int Armor=1;
	static int Level=1;
	static int Mmana=15;
	static int Pmana;
	static int mana=15;
	static int bag=5;
	static String name="주인공";
	static Hero hero;
	static int Cool;
	static int HGold;
	static int HEXP;
	static int UP = 10;
	
	public static void Levelup() throws InterruptedException {
		if(HEXP>=UP) {
			System.out.println();
			System.out.println();
			System.out.println("LEVEL UP!");
			System.out.println();
			System.out.println();
			Thread.sleep(1000);
			Level+=1;
			if(Level<=2) {
				System.out.println("레벨 >> "+Level);
				System.out.println("최대 hp >> "+MHp*0.5+"↑");
				System.out.println("공격력 >> "+Str*1.7+"↑");
				System.out.println("스피드 >> "+1+"↑");
				System.out.println("마나 >> "+10+"↑");
				System.out.println("마법력 >> "+10+"↑");
				System.out.println("다음 레벨업까지 필요한 경험치 >>"+(int) (UP*2));
				PHp=MHp;
				Pmana=Mmana;
				MHp=(int) (MHp+(MHp*0.5));
				Str+=Str*1.7;
				Speed+=1;
				Mmana+=10;
				Magic+=10;
				UP=(int) (UP*2);
				Hp+=MHp-PHp;
				mana+=Mmana-Pmana;
			}
			else {
				System.out.println("레벨 >> "+Level+1);
				System.out.println("최대 hp >> "+MHp*0.5+"↑");
				System.out.println("공격력 >> "+Str*1.3+"↑");
				System.out.println("스피드 >> "+1+"↑");
				System.out.println("마나 >> "+10+"↑");
				System.out.println("다음 레벨업까지 필요한 경험치 >>"+(int) (UP*2));
				PHp=MHp;
				Pmana=Mmana;
				Str+=(int)Str*1.3;
				Speed+=1;
				mana+=10+(Magic*1.2);
				Magic+=15;
				UP=(int) (UP*2);
				MHp=(int) (MHp+(MHp*0.3));
				Hp+=MHp-PHp;
				mana+=Mmana-Pmana;
			}
			if(Level==2) {
				System.out.println("[기술]후려치기를 배우셨습니다.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("후려치기는 자신의 체력을 10만큼 소비하여 사용하는 기술입니다.");
				Thread.sleep(1000);
				System.out.println("사용시 적에게 강한 물리피해를 줍니다.");
			}
			if(Level==3) {
				System.out.println("[마법]파이어볼 배우셨습니다.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("파이어 볼은 자신의 마나 10을 소비하여 사용하는 마법입니다.");
				Thread.sleep(1000);
				System.out.println("사용시 적에게 자신의 마법력 만큼의 데미지를 줍니다.");
			}
			
		}
	}
	public static void Stat() throws InterruptedException {
		System.out.println("이름 : "+name);
		System.out.println("체력 : "+MHp+"\\"+Hp);
		System.out.println("마나 : "+Mmana+"\\"+mana);
		System.out.println("레벨: : "+Level);
		System.out.println("공격력 : "+Str);
		System.out.println("마법력 : "+Magic);
		System.out.println("방어력 : "+Armor);
		System.out.println("스피드 : "+Speed);
		System.out.println("소지 골드 : "+HGold);
		System.out.println("다음 레벨까지 남은 EXP : "+(UP-HEXP));
		System.out.println("현재 가방의 최대 칸 : "+bag);
		Field.Work();
	}
	public static void DIE() {
		System.out.println(" 당신은 사망하셨습니다.");
		System.out.println("   Game Over   ");
		
	}

	public static void Garde(Monster monster) throws InterruptedException {
		System.out.println(Hero.name+"가(이) 방어를 시전했습니다 !");
		Monster.Gattack(monster);
		Fight.Turn();
		
	}


	

	public static void Attack(Monster monster) throws InterruptedException {
		System.out.println();
		System.out.println(name+"의 공격!");
		System.out.println();
		Thread.sleep(1000);
		System.out.println(monster.name+"에게 데미지 "+Str+"을  줬습니다.");
		System.out.println();
		Thread.sleep(1000);
		monster.Hp-=Str;
		if(monster.Hp>0) {
			Monster.attack();
		}
			Fight.Turn();
			
	}
	public static void QAttack(Monster monster) throws InterruptedException {
		System.out.println("<기술>"+name+"의 후려치기");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("몬스터"+monster.name+"에게 데미지 "+Str*1.3+"을 줬습니다.");
		System.out.println();
		Thread.sleep(1000);
		monster.Hp-=Str*1.3;
		Hp-=10;
		if(monster.Hp>0) {
			Monster.attack();
		}
			Fight.Turn();
	}
	public static void WAttack(Monster monster) throws InterruptedException {
		if(Cool==0) {
		System.out.println("<마법>"+name+"의 파이어 볼!");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("10만큼의 마나를 사용해 몬스터"+monster.name+"에게 데미지 "+Magic+"을 줬습니다.");
		monster.Hp-=Magic;
		Thread.sleep(1000);
		System.out.println("당신의 남은 마나는 "+mana+"입니다.");
		System.out.println();
		if(monster.Hp>0) {
			Monster.attack();
		}
		Fight.Turn();
		}
	}
	public void EAttack(Monster monster) throws InterruptedException {
		System.out.println(name+"의 회복!");
		System.out.println();
		System.out.println(name+"의 체력이 150만큼 회복됩니다.");
		System.out.println();
		mana-=30;
		Hp+=150;
		Fight.Turn();
		
	}
	public void RAttack(Monster monster) {
		System.out.println("챔피언"+name+"의 궁극기!");
		System.out.println("몬스터"+monster.name+"에게 데미지 "+Str*5+"을(를) 줌");
		monster.Hp-=Str*5;
		
	}
	

}
