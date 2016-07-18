class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x="+ x+", y="+y;
	}
	public Object clone(){
		Object obj = null;
		try {
			obj = super.clone();	// clone()은 반드시 예외 처리를 해주어야한다.
		} catch (CloneNotSupportedException e) {}
		
		return obj;
	}
}
public class CloneEx {
	public static void main(String[] args) {
		Point original = new Point(3, 4);
		Point copy = (Point)original.clone(); 	//복제 (clone)해서 새로운 객체를 생성.
		System.out.println(original);
		System.out.println(copy);
			
	}

}
