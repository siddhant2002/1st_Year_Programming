
public class RoganSpecial {

	public static void main(String[] args) {
		int c=0,i,n=21;
		while(c!=20)
		{
			for(i=1;i<=20;i++)
			{
				if(n%i==0)
					c++;
			}
			if(c!=20)
			{
				n++;
				c=0;
			}
		}
		System.out.println(n);
	}
}
