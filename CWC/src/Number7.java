import java.util.*;
public class Number7
{
    static int a[][] = new int[1001][1001];
     
    public static int check(String s, int i, int j)
    {
        if (i>j)
            return 1;
        if (a[i][j]!=-1)
            return a[i][j];
        if (s.charAt(i)!=s.charAt(j))
            return a[i][j]=0;
        return a[i][j]=check(s,i+1,j-1);
    }
      
    public static int display(String s)
    {
        for (int[] row: a)
        {
            Arrays.fill(row,-1);
        }
        int i,j,n,count=0;
        n = s.length();
        for (i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (check(s,i,j)!=0)
                	count++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a string");
    	String s=sc.nextLine();
        System.out.println("Number of palindromes are "+(display(s)+s.length()));
    }
}