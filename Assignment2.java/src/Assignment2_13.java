import java.util.*;
public class Assignment2_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long m,y,d;
		System.out.println("Enter the number of minutes: ");
		m=sc.nextLong();
		y=m/(60*24*365);
		d=m-(y*24*60*365);
		d=d/(24*60);
		System.out.println(m+" minutes is approximately equal to "+y+" years and "+d+" days");
	}

}
