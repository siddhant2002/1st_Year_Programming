
public class Number4 {

	public static void main(String[] args) {
		Box<String> nm=new Box<String>(null);
		Box<String> a=nm;
		Box<String> b=nm;
		a.set("Rajesh");
		a.get();
		b.set("Sanjog");
		b.get();
		Box<Integer> kk=new Box<Integer>(0);
		Box<Integer> a1=kk;
		Box<Integer> b1=kk;
		a1.set(32);
		a1.get();
		b1.set(243);
		b1.get();
		Box<Object> k=new Box<Object>(null);
		Box<Object> a2=k;
		Box<Object> b2=k;
		a2.set("Ayush");
		a2.get();
		b2.set(754);
		b2.get();
	}
}
	class Box<T>
	{
		T var;
		Box(T a)
		{
			var=a;
		}
		void set(T a)
		{
			var=a;
		}
		void get()
		{
			System.out.println(var);
		}
	}
