package advance;

public class Addition {
int x;
int y;
void add() {
	int add;
	add=x+y;
	System.out.println(add);
}

int add(int a,int b,int c) {
	int sum=a+b+c;
	return sum;
}

 void add(double e,double f,double g) {
	 double sum=e+f+g;
	 System.out.println(sum);
 }



public static void main(String[] args) {
	
	Addition  value = new Addition() ;
	value.x=10;
	value.y=5;
	value.add();
	int result= value.add(5, 10, 50);
	System.out.println(result);
	
	value.add(2.5, 3.6, 2.8);
	
	
	
	
}









}
