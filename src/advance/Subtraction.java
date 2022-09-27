package advance;

public class Subtraction extends Addition{

	
	void sub (int a, int c) {
		int s = a-c;
		System.out.println(s);
		
	}
	
	
	
	
	
	

	
	public static void main(String[] args) {
	Subtraction s1 = new Subtraction();
	
	s1.sub(100,25);
	System.out.println(s1.add(10, 10, 10));

	}

}
