import java.util.*;
class Number5
	{
	    static ArrayList<String>
	    rA(String A)
	    {
	        if (A.length()<3||A.length()>12)
	            return new ArrayList<>();
	        return work(A);
	    }
	 
	    static ArrayList<String>
	    work(String s)
	    {
	        ArrayList<String> l=new ArrayList<String>();
	        int size = s.length();
	        String s1 = s;
	        for (int i=1;i<size-2;i++) 
	        {
	            for (int j=i+1;j<size-1;j++) 
	            {
	                for (int k=j+1;k<size;k++) 
	                {
	                	s1=s1.substring(0, k)+ "."+s1.substring(k);
	                	s1=s1.substring(0, j)+ "."+s1.substring(j);
	                	s1=s1.substring(0, i)+ "."+s1.substring(i);
	 
	                    if (isValid(s1)) {
	                        l.add(s1);
	                    }
	                    s1=s;
	                }
	            }
	        }
	        Collections.sort(l, new Comparator<String>() {
	            public int compare(String o1, String o2)
	            {
	                String a1[]=o1.split("[.]");
	                String a2[]=o2.split("[.]");
	 
	                int result=-1;
	                for (int i=0; i < 4&&result!=0;i++) 
	                {
	                    result=a1[i].compareTo(a2[i]);
	                }
	                return result;
	            }
	        });
	        return l;
	    }
	    private static boolean isValid(String ip)
	    {
	        String a[]=ip.split("[.]");
	        for(String s : a) {
	            int i=Integer.parseInt(s);
	            if(s.length()>3||i<0||i>255)
	            {
	                return false;
	            }
	            if(s.length()>1&&i==0)
	                return false;
	            if(s.length()>1&&i!=0
	                && s.charAt(0)=='0')
	                return false;
	        }
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        System.out.println(rA("25525511135").toString());
	    }
	}