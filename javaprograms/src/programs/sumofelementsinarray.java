package programs;

public class sumofelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//logic 1
		int a[]= {45,54,1,5};
		int sum =0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);

}
}
