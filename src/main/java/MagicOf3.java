import java.util.Scanner;

/*1. Magic of 3

A number ending with 3 will have a multiple which is all 1. Eg­ multiple of 3 is 111 and of

13 is 111111. Given a number ending with 3 find its least multiple which is all 1. The

2 multiple of the given number can be beyond the range of int,long etc. Optimize for time.
*/

public class MagicOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		magicOf3(n);
	}

	private static void magicOf3(int n) {
		int rem = 1;
		System.out.print("1");
		while(rem > 0) {
			rem = (rem * 10 + 1) % n;
			System.out.print("1");
		}
	}
}
