import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("表示する回数を入力してください");
		int count = scanner.nextInt();
		while (count>0) {
			System.out.println("*");
			count --;
		}

	}

}
