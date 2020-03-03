package programs;

public class reversestring {

	public static void main(String[] args) {
	// logic 1 by usiing concatination operator
		
		String s= "king";
		String rev =" ";
		
		/*int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);*/
		
	// logic 2 using chararray
		 
		/*char a[]=s.toCharArray();
		int len=a.length;
		
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
	// lohic 3 by using string buffer
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer k=sb.reverse();
		System.out.println(k);
	}

}
