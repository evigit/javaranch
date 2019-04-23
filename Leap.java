class Leap {
	public static void main (String [] args) {
		String input = args[0];
		int year = Integer.parseInt(input);
		
		
		if (year%4==0){										//if even 4 then check next....
		
			if (year%100==0){									//if even 100 then check next....

				if (year%400==0){									//if even 400 then year is LEAP +++ (2000,1600)
					System.out.println("leap year!");}
				else												//if even 100 not even 400 then year is NOT LEAP ---(1800,1900)
					System.out.println("not leap year!");}			
			else												//if even 4 and not even 100 then year is LEAP +++ (2004,2008)
				System.out.println("leap year!");}				
		
	
		else												//if not even 4 then year is NOT LEAP +++(2001,2002,2003,2005)
			System.out.println("not leap year");			
	}
}

