class Person{
	long id;
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Person){
			return id == ((Person)obj).id;
		} else{
			return false;
		}
	}
	Person(long id){
		this.id = id;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(123456789L);
		Person p2 = new Person(123456789L);
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같다.");
		else
			System.out.println("p1과 p2는 다르다.");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같다.");
		else
			System.out.println("p1과 p2는 다르다.");
	}

}
