
public class Monster {
	static String name;
	static int Hp;
	static int Str;
	static int Magic;
	static int Speed;
	static int Gold;
	static int EXP;
	static int RandomG;
	public static void attack() throws InterruptedException {
		System.out.println(name+"의 공격!");
		System.out.println();
		Thread.sleep(1000);
		Hero.Hp-=(Hero.Armor-Monster.Str);
		System.out.println(name+"의 공격으로 "+Hero.name+"(이)가 "+Str+"의 데미지를 입었습니다.");
		Thread.sleep(1000);
		System.out.println();
		if(Hero.Hp<=0) {
			System.out.println();
			System.out.println();
			System.out.println();
			Hero.DIE();
		}
	}
	public static void Gattack(Monster monster) throws InterruptedException {
		System.out.println("몬스터"+name+"의 공격!");
		System.out.println();
		Thread.sleep(1000);
		RandomG=(int) (Math.random() * 2)+1 ;
		if(RandomG==1) {
			Thread.sleep(500);
			System.out.println("방어를 성공했습니다!");
			System.out.println();
			if(Hero.Hp<=0) {
				System.out.println();
				System.out.println();
				System.out.println();
				Hero.DIE();
			}
		}
		if(RandomG==2) {
			System.out.println("방어를 했지만 일부 데미지를 받았습니다.");
			Thread.sleep(500);
			System.out.println();
			System.out.println(name+"의 공격으로 "+Hero.name+"(이)가 "+Str/3+"의 데미지를 입었습니다.");
			Hero.Hp-=Monster.Str/3;
		}
	}

	}
	
	

