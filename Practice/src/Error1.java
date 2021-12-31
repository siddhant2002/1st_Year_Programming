import java.util.*;
public class Error1 {

	public static void main(String[] args) {
		int i,j=0;
	       for(i=1;i<=5;i++)
	       {
	           A:
	           for(j=i+1;!(j<=5);j+=3)
	               if(i==3)
	               break A;
	               else if(j==5)
	               break;
	       }
	       System.out.println(++i+'c'+(i=++j+j++));
	}
}
