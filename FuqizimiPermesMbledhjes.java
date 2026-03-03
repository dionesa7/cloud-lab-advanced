package Java1;

import java.util.Scanner;

public class FuqizimiPermesMbledhjes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("a = ");
		int a = s.nextInt();
		System.out.print("b = ");
		int b = s.nextInt();
		
//		int acc = 0;
//		int accI = a;
//		for(int i = 1; i < b; i++) {
//			acc = 0;
//			for(int j = 1; j <= a; j++) {
//				acc += accI;
//			}
//			accI = acc;
//			System.out.println(acc);
//		}
		
		int acc = 0, accI = 1;
		for(int i = 1; i <= b; i++) {
			acc = 0;
			for(int j = 1; j <= a; j++) {
				acc += accI;
			}
			System.out.println(acc);
			accI = acc;
		}
		
		System.out.println(a + " ^ " + b + " = " + acc);
		s.close();
	}
}