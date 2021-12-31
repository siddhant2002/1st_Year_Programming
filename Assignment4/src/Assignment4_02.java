import java.util.*;
public class Assignment4_02 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int i,j,k,i1;
		i=Integer.parseInt(args[0]);
		for(i1=1;i1<=i;i1++)
		{
			j=i1%10;
			k=i1%100;
		if(j==1&&k!=11)
		{
			System.out.println(i1+"st hello");
		}
		else if(j==2&&k!=12)
		{
			System.out.println(i1+"nd hello");
		}
		else if(j==3&&k!=13)
		{
			System.out.println(i1+"rd hello");
		}
		else
		{
			System.out.println(i1+"th hello");
		}
		}
	}

}
