import java.util.*;
public class Number24 {

	public static void main(String[] args) {
		int i,j,k,l,n,a,b,c,d;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				for(k=1;k<=n;k++)
				{
					for(l=1;l<=n;l++)
					{
						a=(int)Math.pow(i,3);
						b=(int)Math.pow(j,3);
						c=(int)Math.pow(k,3);
						d=(int)Math.pow(l,3);
						if((a+b)==(c+d)&&(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l))
							System.out.println(i+" "+j+" "+k+" "+l);
					}
				}
			}
		}
	}
}
