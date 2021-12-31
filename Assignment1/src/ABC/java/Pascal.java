package ABC.java;

public class Pascal {

	public static void main(String[] args) {
		int i,r=1,k,b=4,dup,d;
		for(i=1;i<=5;i++,b--)
		{
			for(k=1;k<=b;k++)
			{
				System.out.print(" ");
			}
			dup=r;
			while(dup!=0)
			{
				d=dup%10;
				System.out.print(d);
				System.out.print(" ");
				dup/=10;
			}
			System.out.println();
			r*=11;
		}
	}

}
