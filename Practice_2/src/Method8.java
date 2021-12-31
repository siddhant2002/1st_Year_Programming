import java.util.*;
public class Method8 {
		public static void main (String[] args)
		{
			Scanner in = new Scanner(System.in);
			int testCases = Integer.parseInt(in.nextLine());
			while(testCases>0){
				String pattern = in.nextLine();
	            int i,j,m=0;
	            char c1;
	            char c[]=new char[6];
	            int n[]=new int[6];
	            for(i=0;i<pattern.length();i++)
	            {
	                c1=pattern.charAt(i);
	                if(c1=='('||c1==')'||c1=='['||c1==']'||c1=='{'||c1=='}')
	                {
	                    for(j=0;j<m;j++)
	                    {
	                        if(c[j]==c1)
	                        break;
	                    }
	                    if(j==m)
	                    {
	                        c[m]=c1;
	                        n[m++]=1;
	                    }
	                    else
	                    n[j]=n[j]+1;
	                }
	            }
	            for(i=0;i<m;i++)
	            {
	                if(n[i]%2==0)
	                break;  
	            }
	            if(i==m)
	            System.out.println("Valid");
	            else
	            System.out.println("Invalid");
			}
		}
}
