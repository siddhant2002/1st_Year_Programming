import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		for(i=100;i<=1000;i++)
		{
			if(i%5==0&&i%6==0)
			{
				System.out.print(i+" ");
				c++;
			}
			if(c==10)
			{
				System.out.println();
				c=0;
			}
		}
	}

}
