
public class TerneryOperatorExample {

	public static void main2(String[] args) { // 랜덤 구하기
		double r1 = Math.random(); // [0. ~ 1)
		
		System.out.println(r1);
		System.out.println(r1*100);
		System.out.println((int)(r1*100));
		
	}
	
	
	public static void main(String[] args) { // [0~1) [ )는 미만을 의미
		int num = (int)(Math.random()*100);
		
		System.out.println(num%2==0 ? "짝수" : "홀수");
		System.out.println(num);
		
		
	}

}
