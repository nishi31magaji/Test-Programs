package LeetCode;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else {
			System.out.println("word is null");
		}

		int x = 121;
		String reverse = "";
		String normal = String.valueOf(x);
		for (int i = normal.length(); i >= 0; i--) {
			reverse = reverse + normal.charAt(i);
		}
		if(normal.equals(reverse)) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
