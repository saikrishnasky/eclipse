package programs;

public class Sumofdigitsinanumber {

	public static void main(String[] args) {
		int num=1213342828;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
