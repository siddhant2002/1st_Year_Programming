import java.io.*;
import java.util.*;
public class Yoo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(--t >= 0)
        {
              int n=Integer.parseInt(br.readLine());
              int a[]=new int[n];
              ArrayList<Integer> nm=new ArrayList<>();
              ArrayList<Integer> kk=new ArrayList<>();
              for(int i=0;i<n;i++)
              {
                    a[i]=Integer.parseInt(br.readLine());
                    if(a[i]%2==0)
                    {
                          nm.add(a[i]);
                    }
                    else if(a[i]%2==1)
                    {
                        kk.add(a[i]);  
                    }
              }
              if(nm.size()!=0||kk.size()!=0)
              {
            	  int j1=0,i,j;
            	  for(i=0,j=0;i<nm.size()&&j<kk.size();i++,j++)
            	  {
            		  a[j1++]=nm.get(i);
            		  a[j1++]=kk.get(j);
            	  }
            	  if(nm.size()>kk.size())
            	  {
            		  for(;i<nm.size();i++)
            		  {
            			  a[j1++]=nm.get(i);
            		  }
            	  }
            	  else
            	  {
            		  for(;j<kk.size();j++)
            		  {
            			  a[j1++]=kk.get(j);
            		  }
            	  }
              }
              int s=0;
              int b[]=new int[n];
              for(int i=0;i<n;i++)
              {
            	  b[i]=(a[i]+i+1)%2;
            	  s=s+b[i];
              }
              System.out.println(s);
        }
	}
}
