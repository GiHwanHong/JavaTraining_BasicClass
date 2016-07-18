class Hand{
	String Kind;
	int number;
	
	public Hand() {
		this("Hand Cream", 1);
	}
	public Hand(String kind, int number){
		this.Kind = kind;
		this.number = number;
	}
	
	public String toString(){
		//Hand인스턴스의 kind와 number를 문자열 형태로 반환.
		return "Kind: " + Kind + ", number: "+ number;
	}
}
public class ToStringEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand h1 = new Hand();
		Hand h2 = new Hand("finger", 10);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
	}

}
