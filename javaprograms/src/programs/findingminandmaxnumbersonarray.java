package programs;

public class findingminandmaxnumbersonarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 23, 877, 7827, 2, 982, 932, 28 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum number is" + max);
		for (int i = 1; i < a.length; i++) {
			if (a[i]< min) {
				min = a[i];
			}
		}
		System.out.println("maximum number is" + min);
	}

}
