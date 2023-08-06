package com.yodlee.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException {
public static void main(String[] args) {
	try {
		foo();
	}
	catch(IOException|JAXBException e) {
		e= new Exception();
	}
	catch(Exception e) {
		e=new Exception();
	}
}
public static void foo() throws IOException,JAXBException{
	
}
}
