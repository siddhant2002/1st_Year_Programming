import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String var=sc.next();
		try 
		{
			if(Integer.parseInt(var)<0)
			{
				int a=Integer.parseInt("Neagtive number");
			}
        	int a=Integer.parseInt(var);
        	System.out.println("Lucky number");
        }
        catch(NumberFormatException e){  
            System.out.println(e);  
        }
	}
}
