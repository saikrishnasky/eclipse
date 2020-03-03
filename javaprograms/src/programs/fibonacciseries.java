package programs;

public class fibonacciseries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34
		int a=0;
		int b=1;
		 int sum=0;
		//System.out.println(a+ ""+b);
		
		for( int i=2;i<10;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
	}

}
}
