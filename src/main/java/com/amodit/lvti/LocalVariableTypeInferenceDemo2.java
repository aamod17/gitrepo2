package com.amodit.lvti;

public class LocalVariableTypeInferenceDemo2 {
	
	//var num = 10;// var is not allowed here
	// copied the code from LocalVariableTypeInferenceDemo 
	public static void main(String[] args) {
		
		var x = 10;
		x = 11;
		
		var stringName = (String)null;
		stringName = "Ronny";
		var name = "Ram";
		var y = 11.8;
		var z =  'a';
		System.out.println(x);
		System.out.println(name);
		System.out.println(y);
		System.out.println(z);

		

	}

}
