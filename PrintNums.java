

public class PrintNums{
	public static void main (String[]args){
		
	String rawinput = args[0];
	int input = Integer.parseInt(rawinput);		//because input args[] is a string
	
	logicMath(input);								
	
	}
	
	public static void logicMath (int input){
	
		if (input>=100 && input <1000) {										//range 1000
			int iHundred = input/100;
			String aHundred = numsNames[iHundred];
			System.out.print(aHundred + " hundred");

			int iTens = (input%100) /10;
			String aTens = tensNames[iTens];
			System.out.print(" "+ aTens);
				
			int iTillTw = (input%100) % 10;
			String aTillTw = numsNames[iTillTw];
			System.out.println(" " + aTillTw);
		}
		
		else if (input >=20 && input <100) {					//range from 20 till 100

			int iTens = (input%100) /10;						//take first part
			String aTens = tensNames[iTens];
			System.out.print(aTens);		
									
			int iTillTw = (input%100) % 10;						//take second part
			String aTillTw = numsNames[iTillTw];
			System.out.println(" " + aTillTw);
		}
		
		else if (input < 20){									//range till 20
			String tillTw = numsNames[input ];					//array with numbers 1-19
					
			System.out.println(tillTw);
		}
	
																//so we wont work with range>100
		else													//but we will get error for negative numbers
			System.out.println("This number is outside of the range");
												
	}
	
	private static String tensNames[] = {
		"",
		"ten",
		"twenty",
		"thirty",
		"forty",
		"fifty",
		"sixty",
		"seventy",
		"eighty",
		"ninety"
	};
	
	private static String numsNames[] = {
		"",
		"one",
		"two",
		"three",
		"four",
		"five",
		"six",
		"seven",
		"eight",
		"nine",
		"ten",
		"eleven",
		"twelve",
		"thirteen",
		"fourteen",
		"fifteen",
		"sixteen",
		"seventeen",
		"eighteen",
		"nineteen"
	};

}