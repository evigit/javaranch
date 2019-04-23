

public class Grains {
	public static void main(String[]args){
		
		double grainSum=0;
		int iFirst=1;
		double grainPow = 1;
		System.out.println("square " + iFirst + ":  " + grainPow + " grain");
			
			for (int i=1;i<65;i++){
			grainPow =  Math.pow(2,i);		
			grainSum = grainSum+grainPow;
			
			System.out.println("square " + i + " :  " + grainPow + " grains or its " + ((grainPow/15)/1000) + " kg...");
			
			}
			System.out.println();
			System.out.println(grainSum + " grains of wheat...");
			System.out.println();
			System.out.println("One grain equal 64mg and 15 grains equal 1 gram...");
			System.out.println();
			System.out.println("So, there are " + ((grainSum/15)/1000) + " kg is the mass of these grains");
	}
}
