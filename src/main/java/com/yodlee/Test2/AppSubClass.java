package com.yodlee.Test2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AppSubClass extends App {
public AppSubClass(String str)  {
	super("abc");
	System.out.println("sdfs");
}

public static void main(String[] args){
	
	AppSubClass a = new AppSubClass("nishi");
	try {
	 String car =	a.getCar();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(AppSubClass.a);
	
}
public void foo() throws FileNotFoundException{
	
}
String getCar() throws Exception {
return null;	
}
void getColor() throws Exception {
	throw new Exception();
}

}
