package LeetCode;

public class Hackerearth {
 public static void main(String[] args) {
	checkId((h,l) -> h.append(l).isEmpty(),5);
}
 private static void checkId(Hacker hackster,int height) {
	 if(hackster.show(height, 10))
		 System.out.println("Hacker");
	 else
		 System.out.println("Earth");
 }
}
