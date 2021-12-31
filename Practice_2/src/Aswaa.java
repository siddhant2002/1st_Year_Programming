
public class Aswaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs nm=new Dogs();
		nm.printColor();
	}
}
	class Animal1
	{
		String color="white";
	}
	class Dogs extends Animal1
	{
		String color="black";
		void printColor()
		{
			System.out.println(color);
			System.out.println(super.color);
		}
	}
