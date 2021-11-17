import static java.lang.System.exit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		exit(0);
	}
}
