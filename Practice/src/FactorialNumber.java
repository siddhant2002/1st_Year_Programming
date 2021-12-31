import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i = 1, num;
		boolean b = false;
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		while (num != 1) {
			if (num % i == 0) {
				num = num / i;
				i++;
				b = true;
				continue;
			} else {
				b = false;
				break;
			}

		}
		System.out.println(b);
	}
}
