
public class Times{
	public static void main(String[]args){
		
		int aArray[] = {0,1,2,3,4,5,6,7,8,9};			//our only array with number from 0 till 9
		
		System.out.print(leftText(" ", 3));							//make a \t at row #1
		
		for (int iHor=0;iHor<aArray.length;iHor++)
		{
			System.out.print(leftText(String.valueOf(aArray[iHor]),3));		//print horizontal row at row #1	
		}
		
		System.out.println();
		
		for (int i=0;i<aArray.length;i++)
		{
			System.out.print(leftText(String.valueOf(aArray[i]), 3));					//print #1 column just a numbers in array
			
			for(int multiplier=0;multiplier<10; multiplier++)
				System.out.print(leftText(String.valueOf(aArray[i]*multiplier), 3));	//print 10 other columns
				System.out.println();							//print \n, making illusion of columns
		}
		
	}	
	static String leftText( String s , int newLen )
	{
	 while ( s.length() < newLen )
	{
		 s += " ";
	}
	return s ;
	}

	
}