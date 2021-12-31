import java.util.*;
public class SquareN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k,p=1,j; 
		double j1;
		System.out.println("Enter the value of k");
		k=sc.nextInt();
        int ar[]=new int[k];
        System.out.println("Enter "+k+" numbers");
        for(j=0;j<k;j++)
        {
            ar[j]=sc.nextInt();
            p=p*ar[j];
        }
        System.out.println(p);
        for(j1=4;;j1++)
        {
            if(p%j1==0)
            {
            	if(j1%Math.sqrt(j1)==0.0)
            		break;
            }
        }
        System.out.println((int)Math.sqrt(j1));
	}

}
