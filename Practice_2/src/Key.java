import java.util.*;
public class Key {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,number;
		System.out.println("Enter the number");
		number=sc.nextInt();
        if(number<5)
        {System.out.println("Invalid Value");}
 
        for(i=1;i<=number;++i){
            for(j=1;j<=number;j++){
                if(i==number || i==1) 
                    System.out.print("*");
                else if(j==number || j==1)
                    System.out.print("*");
                else if(j==i)            
                    System.out.print("*");
                else if(j==(number+1-i))  
                    System.out.print("*");
                else System.out.print(" "); 
            }
            System.out.println("");       
        }
	}

}
