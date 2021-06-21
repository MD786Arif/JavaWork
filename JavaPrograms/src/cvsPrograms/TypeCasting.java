package cvsPrograms;

public class TypeCasting {

	public static void main(String[] args) {
		
//		There are two types of type casting 
//		1 implicit type casting
//		for eg. when we convert lower data type into higher it is called implicit type casting vice 
//		versa for explicit type casting
		byte a = 20;
		int i = a;  // this has been done implicitly by the compiler
		
		int j = 30;
//		byte b = i;  // it throws an error 
		byte b = (byte)j;
//		similarly with all 
//		 data type variable1 = (dataType)variable;
		System.out.println(b);
		
		
		

	}

}
