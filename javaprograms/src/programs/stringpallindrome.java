package programs;

import java.util.Scanner;

public class stringpallindrome {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String str=sc.nextLine();
		
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println(str+" given name pallendrome");
		}
		else
		{
			System.out.println(str+" given name is not pallindrome");
		}*/
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");

	}

}
