package programs;

import java.util.HashSet;

public class findtheduplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*logic1
		String arr[]= {"java","python","baby","crazy","baby"};
		 boolean flag=false;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 
					 System.out.println("found the duplicate element : "+ arr[i]);
					 flag=true;
				 }
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println(" duplicate element not found ");
		 }*/
		
		//LOGIC2 BY USING HASHSET
		
		String arr[]= {"java","python","baby","crazy","baby"};
		HashSet <String>langs=new HashSet();
		 boolean flag=false;
		 for(String l:arr)
		 {
			 if(langs.add(l)==false)
			 {
				 System.out.println("found the duplicate : "
				 		+ ""+ l);
				 flag=true;
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println(" duplicate element not found ");
		 }
		
		
	}

}
