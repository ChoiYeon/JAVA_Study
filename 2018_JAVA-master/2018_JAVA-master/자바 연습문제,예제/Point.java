
public class Point {
	int i=0;
	int j=0;
	String c="black";
	
	public String toString(){
		String d="("+i+","+j+")";
		String result = c+"색의 "+d+"의 점";
		return result;
	}
	
	public void setXY(int i, int j){
		this.i=i;
		this.j=j;
	
	}
	public void setColor(String c){
		this.c=c;
	}

	
}

	class ColorPoint extends Point{
		ColorPoint(){
			
		}
		ColorPoint(int i, int j){
			this.i=i; this.j=j;
		}
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다");

		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다");
	}
}


