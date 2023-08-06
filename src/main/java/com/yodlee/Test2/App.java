package com.yodlee.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int status=4;
        System.out.println( "Hello World!" );
        if(status!=Status.DELETED_USER.intValue()) {
        	System.out.println("locked");
        }
    }
    
    
    public static String getStatus() {
    	String status="dkd";
    	int a=2;
    	int b=2;
    	if (a==b) return status;
    	return a==b ? "locked":status;
    }
    
   }
