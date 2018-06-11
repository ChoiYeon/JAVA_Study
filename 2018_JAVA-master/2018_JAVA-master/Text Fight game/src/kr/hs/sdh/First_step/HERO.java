package kr.hs.sdh.First_step;

public class HERO extends Unit{
	
	public void stat() {
		name="È¥Á¾";
		hp=700;
		AS = 2;
		str = 75;
		int mana=200;
		int magic = 50;
		int level = 10;
	}
		
	public void Attack() {
		System.out.println("Ã¨ÇÇ¾ð"+name+"ÀÇ °ø°Ý!");
		System.out.println("µ¥¹ÌÁö "+str+"À» ÁÜ");
	}
	public static void main(String[] args) {
		HERO hero = new HERO();
		hero.stat();
		
		
		

	}
		
		

	}

