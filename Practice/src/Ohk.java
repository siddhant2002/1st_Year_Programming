
public class Ohk {

	public static void main(String[] args) {
		int i,c=0,j;
		for(i=2;i<=10;i++)
		{
			for(j=1;j<=i;j++)
				if(i%j==0)
					c++;
			if(c==2)
				System.out.print(i+" ");
		}
	}

}
