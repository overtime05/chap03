
public class BitShiftExample {

	public static void main(String[] args) {
		int num = 0b0000_0001;
		
		
		int result1 = num << 1; // 2
		/*
		 *   00000001
		 *   << 1
		 *   ========  왼쪽으로 민다.
		 *   00000010
		 */
		
		int result2 = num << 2; // 4
		/*
		 *   00000001
		 *   << 2
		 *   ========  두번을 왼쪽으로 민다.
		 *   00000100
		 */
		
		int result3 = num << 4; // 16
		/*
		 *   00000001
		 *   << 4
		 *   ========  네번을 왼쪽으로 민다.
		 *   00010000
		 */
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
