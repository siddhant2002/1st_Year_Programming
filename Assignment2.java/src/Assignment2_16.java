import java.util.*;
public class Assignment2_16 {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b,c,c1;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=(int)(Math.random()*(b-a)+1)+a;
c1=(int)(Math.random()*(b-a)+1)+a;
System.out.println("The sum of dice roll is "+(c+c1));

}

}
