import java.util.*;
public class Anjj {

	public static void main(String[] args) {
		System.out.println(get(52));
	}
	static int get(int n)
	{
		int cnt=0,f=1;
		while(n>0)
		{
			n-=f;
			cnt+=1;
			f^=1;
		}
		return cnt;
	}
}
