package number92;
import java.util.*;
import number9.*;

public class MainWork {

	public static void main(String[] args) {
		
		Test nm=new Test();
		Sports kk=new Calculate();
		int a,b,c;
		nm.input();
		kk.input();
		a=nm.output();
		b=kk.output();
		System.out.println("The grand total mark is "+a+" and the grand total score is "+b);
	}
}
