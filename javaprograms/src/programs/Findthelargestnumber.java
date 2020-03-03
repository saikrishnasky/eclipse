package programs;

import java.util.Scanner;

public class Findthelargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("eneter the first number");
		int a=sc.nextInt();
		
		System.out.println("eneter the first number");
		int b=sc.nextInt();
		
		System.out.println("eneter the first number");
		int c=sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println(a+ "is the largest number");
		}
		
		if (b>a && b>c)
		{
			System.out.println(b+ "is the largest number");
		}
		if (c>b && c>a)
		{
			System.out.println(c+ "is the largest number");
		}
		
	}

}
