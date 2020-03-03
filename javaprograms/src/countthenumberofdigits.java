import java.util.Scanner;

public class countthenumberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234567;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enetr number");
		int num=sc.nextInt();
		for(;numm>0;count++)
		{
			numm=numm/10;
		}
		System.out.println(count);*/
	}

}
