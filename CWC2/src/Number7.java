import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		int s,i;
		find(3,1);
	}
	static void find(int s, int i)
	{
		if(s==78)
			System.out.println(i);
		else
		{
			s=s+5;
			i++;
			find(s,i);
		}
	}
}
