import java.util.*;
public class Bitwise {

	public static void main(String[] args) {
		int arr[]= {1,2,5,5,2,3,1,3,1,2,5};
		int res=0;
		for(int i=0;i<arr.length;i++)
			res=res^arr[i];
	        System.out.println(res);
	        int mask=0x000F;
	        int value=0x2222;
	        System.out.println(mask&value);
	        try
	        {
	        	Float f1=new Float("3.0");
	        	int k1=f1.intValue();
	        	byte k2=f1.byteValue();
	        	double k3=f1.doubleValue();
	        	System.out.println(k1+k2+k3);
	        }
	        catch(NumberFormatException e)
	        {
	        	System.out.println("bad number");
	        }
	}
}
