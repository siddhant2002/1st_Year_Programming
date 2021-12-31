import java.util.*;
public class Assignment2_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3,s1,s2,s3,s,area;
		System.out.println("Enter the points");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		s1=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		s2=Math.sqrt((Math.pow((x3-x2),2)+Math.pow((y3-y2),2)));
		s3=Math.sqrt((Math.pow((x1-x3),2)+Math.pow((y1-y3),2)));
		s=s1+s2+s3;
		s/=2;
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println(area);
	}

}
