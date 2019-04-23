public class EvenOrOdd {
	public static void main(String[]args) {
		
		String inputArgs = args[0];
		int iArgs = Integer.parseInt(inputArgs);
		
		if ((iArgs%2)==0) {
		System.out.print("even");
		}
		
		else {
		System.out.print("odd");	
		}
	}
}