
public class IfVeOperatorler {

	public static void main(String args []) {
		
		int a=10;
		int b=2;
		int c=25;
		
		if((a<c) && (a<b)) {
			System.out.println("A en küçük");
		}
		
		else if((c<a) && (c<b)) {
			System.out.println("c en küçük");
		}
		
		else {
			System.out.println("b en küçük");
		}
	}
}
