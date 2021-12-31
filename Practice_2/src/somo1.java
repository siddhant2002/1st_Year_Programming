
public class somo1 {

	public static void main(String[] args) {
		Triangle T1 = new Triangle();
		T1.area(1);
		Triangle T2 = new Triangle(7.2);
		T2.area(2);
		Triangle T3 = new Triangle(9.8, 5.8);
		T3.area(3);
	}
}
	class Triangle {
		double base;
		double height;
		Triangle(){
			base = 8;
			height = 5;
		}
		Triangle(double p){
			base = height = p;
		}
		Triangle(double a, double b){
			base = a;
			height = b;
		}
		void area(int i){
				System.out.println("The area of the triangle "+i+" is: "+ (0.5*base*height));
		}
	}
