package programs;

public class charecteroccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="my name is sai krishna yadav";
		// want know the total number of a's predent in the stirng
		
		int count =name.length();
		String acount=name.replaceAll("m","");
		int counta=acount.length();
		int thechar_occurence=count - counta;
		System.out.println("the number of times it paced in is :"+ thechar_occurence);
	}
	

}
