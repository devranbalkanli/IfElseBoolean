
public class IfVeOperatorler {

	public static void main(String args []) {
		
		int a=10;
		int b=2;
		int c=25;
		
		if((a<c) && (a<b)) {
			System.out.println("A en k���k");
		}
		
		else if((c<a) && (c<b)) {
			System.out.println("c en k���k");
		}
		
		else {
			System.out.println("b en k���k");
		}
	}
}
