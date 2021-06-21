package cvsPrograms;

public class ScopeOfVariables {
	
	static void sum() {
		int p1 = 78; // we cannot access these variables , outside this method because it scope is limited to this method
		int p2 = 89; //
		int sum = p1+p2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int x = 69;   //the scope of this variable is throughout this program
		while(x<70) {
			int y = 20; // the scope of this variable is within this while loop
			System.out.println(y);
			x++;
		}
		sum();
//		System.out.println(y);  we cannot acces this that variable from here
		
		

	}

}
