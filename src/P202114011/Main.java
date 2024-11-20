package P202114011;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		out.println("202114011 오수경");
		out.println(Hello.sum(10));
		out.println(Hello.sum(100));
		out.println(Hello.sum(1000));
		out.println(Sansu.max(new int[] {8, 5, 6, 9, 4, 1, 7, 10, 3, 2,}));
		out.println(Sansu.max(new int[] {-2, 5, 6, 9, -6, 1, 7, 2, 8, 10}));
	}
}