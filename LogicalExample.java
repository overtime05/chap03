
public class LogicalExample {

	public static void main(String[] args) {
		System.out.println("#####");
		System.out.println("# AND");
		System.out.println("#####");
		System.out.println("T && T = " + (true && true));
		System.out.println("T && F = " + (true && false));
		System.out.println("F && T = " + (false && true));
		System.out.println("F && F = " + (false && false));
		
		System.out.println("#####");
		System.out.println("# OR ");
		System.out.println("#####");
		System.out.println("T || T = " + (true || true));
		System.out.println("T || F = " + (true || false));
		System.out.println("F || T = " + (false || true)); 
		System.out.println("F || F = " + (false || false));  // OR은 하나라도 true면 true다
		
		
		System.out.println("#####");
		System.out.println("# XOR");
		System.out.println("#####");
		System.out.println("T ^ T = " + (true ^ true));
		System.out.println("T ^ F = " + (true ^ false));
		System.out.println("F ^ T = " + (false ^ true));
		System.out.println("F ^ F = " + (false ^ false));
		
		
	}

}
