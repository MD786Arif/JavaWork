package cvsPrograms;

public class VarArgs {

	static int sum(int ...arr) {
		int sum = 0;
		for(int item:arr) {
			sum+=item;
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sum(10,20,34,90,67,89));
		
		
		
		
	}

}
