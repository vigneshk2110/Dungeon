package recursion;

public class NthPower2 {

	public static void main(String[] args) {

		System.out.println(power2toN(4));

	}

	private static int power2toN(int n) {

		if (n == 0) {
			return 1;
		}
		return 2*power2toN(n-1);
	}
}
