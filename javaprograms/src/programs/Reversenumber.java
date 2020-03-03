package programs;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");

		int num = sc.nextInt();
		/*
		 * logic 1 int rev = 0;
		 *  while (num != 0)
		 * 
		 * { rev = rev * 10 + num % 10;
		 *  num = num / 10; }
		 */

		/*
		 * logic 2 *using string buffer
		 *  StringBuffer sb=new StringBuffer(String.valueOf(num));
		 *  StringBuffer rev=sb.reverse();
		 * System.out.println(rev);
		 */
		// logic 3 stringbuilder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);

	}

}
