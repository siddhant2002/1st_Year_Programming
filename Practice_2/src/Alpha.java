class Comp {
int real ;
int img ;
void input(int p,int q){
real =p ;
img=q ;
}
void calculate(Comp C11 , Comp C22 ){
real =C11.real+C22.real ;
img=C11 . img+C22 . img ;
}
void display() {
	System.out.println(real+ " i" +img);
}
}
public class Alpha {
public static void main (String [] args ) {
Comp C1=new Comp() ;
Comp C2=new Comp() ;
C1.input(10,20);
C2.input(30,40);
Comp C3=new Comp();
C1.display();
C2.display();
C2.calculate(C1, C2 ) ;
System.out.println("The sum of C1 and C2 is :") ;
C2.display();
}}
