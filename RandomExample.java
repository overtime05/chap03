
public class RandomExample {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		// 1. 주사위 [1-6]
		
		System.out.println(Math.random()*6);
		// [0~6) 0~5까지밖에 나오지않는다.
		// 그래서 아래처럼 수정 
		
		System.out.println((int)(Math.random()*6) + 1);
		// 1~6까지 나온다.
		
		// 2. [30-37]
		// [0-7] + 30 ==> [30-37]
		System.out.println((int)(Math.random()*8) + 30);
		
		// 3. [A-Z] 알파벳 넣기
		// [0-25] + 'A' 
		char ch = (char)(Math.random()*26 + 'A');
		System.out.println(ch);

		// 4. [1-45]
		// [0-44] + 1
		System.out.println((int)(Math.random()*45) + 1);
		
	}

}
