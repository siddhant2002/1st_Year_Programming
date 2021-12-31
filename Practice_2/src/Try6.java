import java.io.*;
public class Try6 {
	void m() throws IOException
	{
		throw new IOException("device error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	public static void main(String args[])
	{
		Try6 nm=new Try6();
		nm.p();
		System.out.println("Normal flow");
	}
}
