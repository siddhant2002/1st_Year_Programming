import java.util.*;
public class Assignment4_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=16;i<=2048;i*=2)
		{
			System.out.println(Math.log(i)+"\t"+i+"\t"+(i*Math.log(i))+"\t"+(i*i)+"\t"+(i*i*i)+"\t"+((int)(Math.pow(2,i))));
		}
	}
}
