import java.util.Scanner;
public class Assignment4_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1000;
		System.out.print(i+" ");
		for(i=1001;i<=2000;i++)
		{
			if(i%5==0)
				System.out.println();
			    System.out.print(i+" ");
		}
	}

}
