package programs;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		int onum=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}

		//System.out.println(rev);
		
		if(onum==rev)
		{
			System.out.println("given number is pallindrom");
		}
		else
		{
			System.out.println("not a pallindrome");
			}
	}

}
