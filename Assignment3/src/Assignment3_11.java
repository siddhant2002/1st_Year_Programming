import java.util.*;
public class Assignment3_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double h,w,bmi;
		System.out.println("Enter your weight and height");
		w=sc.nextDouble();
		h=sc.nextDouble();
		bmi=w/(Math.pow(h,2));
		if(bmi<18.5)
		{
			System.out.println("Under weight");
		}
		else if(bmi>=18.5&&bmi<=24.9)
		{
			System.out.println("Normal weight");
		}
		else if(bmi>=25&&bmi<=29.9)
		{
			System.out.println("Over weight");
		}
		else if(bmi>=30)
		{
			System.out.println("Obese");
		}
	}
}
