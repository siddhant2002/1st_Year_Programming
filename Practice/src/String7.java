
public class String7 {

	public static void main(String[] args) {
			String s,t;
			int k9=7;
			s=t="";
			if(s.length()<k9||t.length()<k9)
				System.out.println( "No");
		        else
		        {
		            int i,l,l1,k1=0;
		            for(i=0;i<Math.min(s.length(),t.length());i++)
		            {
		                if(s.charAt(i)!=t.charAt(i))
		                break;
		            }
		            if(i==Math.max(s.length(),t.length()))
		            {
		            	System.out.println( "Yes");
		            }
		            else
		            {
		                k1=(s.length()-i)+(t.length()-i);
		                if(k1<=k9)
		                System.out.println( "Yes");
		                else
		                System.out.println( "No");
		            }
		        }
			char c[]=new char[s.length()];
	        int n[]=new int[s.length()];
	        int i,j,m=0;
	        String p="";
			for(i=0;i<s.length();i++)
	        {
	            for(j=0;j<m;j++)
	            {
	                if(c[j]==s.charAt(i))
	                break;
	            }
	            if(j==m)
	            {
	                c[m]=s.charAt(i);
	                n[m++]=1;
	            }
	            else
	            n[j]=n[j]+1;
	        }
			for(i=0;i<m;i++)
			{
				System.out.println(c[i]+"  "+n[i]);
			}
		    }
}
