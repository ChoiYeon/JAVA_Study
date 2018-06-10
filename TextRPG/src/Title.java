import java.util.*;
public class Title {

	public void Main() throws InterruptedException{
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("-----■■■■■■■■■-----------■■■■■■■■■■----------■■■■■■■■■■■-----------");
		System.out.println("----■---------■---------■----------■--------■-----------■----------");
		System.out.println("----■----------■--------■-----------■------■-------------■---------");
		System.out.println("----■----------■--------■-----------■-----■------------------------");
		System.out.println("----■---------■---------■----------■------■------------------------");
		System.out.println("----■■■■■■■■■■----------■■■■■■■■■■■-------■------------------------");
		System.out.println("----■--------■----------■-----------------■--------■■■■■■■---------");
		System.out.println("----■---------■---------■-----------------■---------------■--------");
		System.out.println("----■----------■--------■------------------■--------------■--------");
		System.out.println("----■-----------■-------■-------------------■------------■---------");
		System.out.println("----■------------■------■--------------------■■■■■■■■■■■■----------");
		System.out.println("                                                                   ");
		System.out.println("                     ────────────────────                          ");
		System.out.println("                    |  1.   게임 시작                |                         ");
		System.out.println("                    |  2.   게임 설명                |                         ");
		System.out.println("                     ────────────────────		                   ");
		System.out.print("                             >>");
		choice=sc.nextInt();
		if(choice == 1) {
			System.out.println("게임을 시작합니다 .");
			Thread.sleep(1000);
			Field.Work();
			
		}
		else if(choice == 2) {
			Game_description();
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			Thread.sleep(1000);
			Main();
		}
	}
		public void	Game_description() throws InterruptedException {
			System.out.println("이 게임은 운 요소가 작용합니다.");
			Thread.sleep(2000);
			System.out.println("게임 설명을 시작하겠습니다.");
			Thread.sleep(2000);
			System.out.println("이 게임은 각 스테이지를 전진하며 몬스터를 잡고 ");
			Thread.sleep(2000);
			System.out.println("경험치를 얻어 레벨을 올릴 수 있습니다.");
			Thread.sleep(2000);
			System.out.println("레벨이 상승하면 스텟이 상승하며");
			Thread.sleep(2000);
			System.out.println("레벨이 일정량 달성시 스킬이 하나 하나 해금이 되며");
			Thread.sleep(2000);
			System.out.println("해당 스킬을 사용할 수 있게됩니다.");
			Thread.sleep(2000);
			System.out.println("스테이지를 전진하다보면 스테이지당 한 번 마을이 등장하며");
			Thread.sleep(2000);
			System.out.println("마을에서는 몬스터를 잡아 획득한 Gold로 아이템 혹은 무기 , 방어구를");
			Thread.sleep(2000);
			System.out.println("구매하실 수 있습니다.");
			Thread.sleep(2000);
			System.out.println("또한 각 스테이지의 마지막에는 보스가 존재하며 보스는 필드 몬스터보다 월등히 강합니다.");
			Thread.sleep(2000);
			System.out.println("<꼭 지침하세요!>");
			Thread.sleep(2000);
			System.out.println("현재 이 게임은 미완성입니다! ");
			Thread.sleep(2000);
			Main();
		}

}
