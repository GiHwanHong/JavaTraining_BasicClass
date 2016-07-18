public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(20);
		
		if(v1.equals(v2)){
			System.out.println("v1과 v2는 same");
		} else { 
			System.out.println("v1과 v2는 other");
		}
		
		v2 =v1;
		
		if(v1.equals(v2)){
			System.out.println("v1과 v2는 same");
		} else{
			System.out.println("v1과 v2는 other");
		}
	}
}

class Value{
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}