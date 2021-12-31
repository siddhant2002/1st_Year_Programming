import java.io.*;
import java.util.*;
public class Q_1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		System.out.println("Enter number of test cases");
		t=Integer.parseInt(br.readLine());
		List<String> oo=new ArrayList<>();
		for(int i=1;i<=t;i++)
		{
			String s=br.readLine();
			s=s.trim();
			oo.add(s);
		}
		for(int i=1;i<=t;i++)
		{
			HashMap<Character,Integer> nm=new HashMap<>();
			String s=oo.get(i-1);
			int k=s.length();
			int x=0,v=0;
			for(int j=0;j<k;j++)
			{
				if(check(s.charAt(j)))
					x++;
				else
					v++;
				if(nm.containsKey(s.charAt(j)))
					nm.put(s.charAt(j), nm.get(s.charAt(j))+1);
				else
					nm.put(s.charAt(j),1);
			}
			if(nm.size()==1)
			{
				System.out.println("Case #"+(i)+": 0");
				continue;
			}
			else if(nm.size()==s.length()&&(v==0||x==0))
			{
				System.out.println("Case #"+(i)+": "+(nm.size()));
			}
			else  if(x==v)
			{
				k=Integer.MIN_VALUE;
				char c=' ';
				for(char h: nm.keySet())
				{
					if(nm.get(h)>k)
					{
						k=nm.get(h);
						c=h;
					}
				}
				k=s.length();
				int d=0;
				if(check(c))
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=2;
							else
								d+=1;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
				else
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=1;
							else
								d+=2;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
			}
			else if(x>v)
			{
				k=Integer.MIN_VALUE;
				char c=' ',c1=' ';
				int u=0;
				for(char h: nm.keySet())
				{
					if(nm.get(h)>k)
					{
						k=nm.get(h);
						c=h;
						u=k;
					}
					if(!(check(h))&&u==k)
						c1=h;
				}
				c=c1;
				k=s.length();
				int d=0;
				if(check(c))
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=2;
							else
								d+=1;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
				else
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=1;
							else
								d+=2;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
			}
			else if(v>x)
			{
				k=Integer.MIN_VALUE;
				char c=' ',c1=' ';
				int u=0;
				for(char h: nm.keySet())
				{
					if(nm.get(h)>k)
					{
						k=nm.get(h);
						c=h;
						u=k;
					}
					if((check(h))&&u==k)
						c1=h;
				}
				c=c1;
				k=s.length();
				int d=0;
				if(check(c))
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=2;
							else
								d+=1;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
				else
				{
					for(int j=0;j<k;j++)
					{
						if(s.charAt(j)!=c)
						{
							if(check(s.charAt(j)))
								d+=1;
							else
								d+=2;
						}
					}
					System.out.println("Case #"+(i)+": "+d);
				}
			}
		}
	}
	static boolean check(char c)
	{
		return c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	}
}
