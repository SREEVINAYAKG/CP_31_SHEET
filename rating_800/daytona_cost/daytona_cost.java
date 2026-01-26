import java.util.Scanner;

public class daytona_cost {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			long n = scanner.nextLong();
			long k = scanner.nextLong(); 
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}

			boolean numberIsPresent = false; 
			for (int i = 0; i < n; i++) {
				if (a[i] == k) { 
					numberIsPresent = true; 
					break; 
				}
			}

			if (numberIsPresent) {
				System.out.println("YES"); 
			} else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}

