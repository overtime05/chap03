
public class Exercise6 {

	public static void main(String[] args) {

		int num =(int)(Math.random()*5000 + 100);
		
		num = (num/100%100);
		num = (num /10);
		
		System.out.println(num);
		
		
	}

}
