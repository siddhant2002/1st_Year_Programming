import java.util.*;
public class GenC3 {

	public static void main(String[] args) {
		Product<String , Double> nm=new Product<String , Double>("Guni Shankar" , 132142.3532432);
		Product<Integer , Double> kk=new Product<Integer , Double>(32324313, 233244.4232432);
		Product<Integer , String> k=new Product<Integer , String>(5234134 , "Ravi Sharma");
		nm.showdata();
		kk.showdata();
		k.showdata();
	}
}
	class Product<T1 , T2>
	{
		T1 a;
		T2 b;
		Product(T1 a , T2 b)
		{
			this.a=a;
			this.b=b;
		}
		void showdata()
		{
			System.out.println("The informations are ");
			System.out.println(a);
			System.out.println(b);
		}
	}
