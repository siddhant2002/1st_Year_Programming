import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c[]= {'c','a','r','b','o','n'};
		int i,j,k,l,m,n;
		String p="";
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				for(k=0;k<c.length;k++)
				{
					for(l=0;l<c.length;l++)
					{
						for(m=0;m<c.length;m++)
						{
							for(n=0;n<c.length;n++)
							{
								if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n)
								{
									p=p+c[i]+c[j]+c[k]+c[l]+c[m]+c[n];
									System.out.println(p);
									p="";
								}
							}
						}
					}
				}
			}
		}
	}
}
