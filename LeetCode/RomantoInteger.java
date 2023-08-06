package LeetCode;

public class RomantoInteger {
	int val(char ch) {
		if (ch == 'I')
			return 1;
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;
		else
			return -1;
	}

	// LVIII
	public int romanToInt(String s) {
		int num = 0;
		int s2 = 0;
		int s1 = 0;
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			s1 = val(s.charAt(i));
			if ((i + 1) < s.length()) {
				s2 = val(s.charAt(i + 1));
				if (s1 >= s2)
					total = total + s1;
				if (s1 < s2)
					total = total - s1;
			} else {
				total = total + s1;
			}
		}
		System.out.println(total);
		return total;
	}

	public static void main(String[] args) {
		RomantoInteger r = new RomantoInteger();
		r.romanToInt("LVIII");
	}
}
