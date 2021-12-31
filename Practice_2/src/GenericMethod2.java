public class GenericMethod2 {
<T> void swap (T var1 , T var2 ){
System.out.println("Be for swapping the values are") ;
System.out.println(var1);
System.out.println(var2);
T temp ;
temp = var1 ;
var1 = var2 ;
var2 = temp ;
System.out.println("After swapping the values are");
System.out.println(var1);
System.out.println(var2);
}
public static void main (String [] args){
GenericMethod2 obj1 = new GenericMethod2 () ;
obj1.swap(10,20);
obj1.swap(9.2,9.4) ;
obj1.swap ("RAJA","RANI") ;
}
}
