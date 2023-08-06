package com.yodlee.Test2;

public class TVBuilderMain {
  public static void main(String[] args) {
	  TV tv1 = new TVBuilder().setBrandName("Sony").getTV();
	  System.out.println(tv1);
	  
	  TV tv2 = new TVBuilder().setScreenSize(55).getTV();
	  System.out.println(tv2);
}
}
