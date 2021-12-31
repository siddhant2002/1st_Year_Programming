
public class Try3 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[8]=5;
			a[5]=30/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
	}
}
