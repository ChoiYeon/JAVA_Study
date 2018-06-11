
class Circle {
	
	int x,y,r;

	Circle(int x, int y, int r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public boolean equals(Object obj){
		Circle c = (Circle)obj;
		if(x==c.x&&y==c.y){
			return true;
		}
		else{return false;}
	}
	public String toString(){
		
		return "Circle("+x+","+y+")반지름"+r;
		
		
	}

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a :"+a);
		System.out.println("원 b :"+b);
		if(a.equals(b)){
			System.out.println("같은원");
		}
		else{
			System.out.println("다른원");
		}

	}

}
