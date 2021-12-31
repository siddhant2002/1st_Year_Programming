import java.util.*;

public class Array10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		int a2[] = new int[7] ;
		for(int j= 0; j < 7; j++) {
			a2[j] = scanner.nextInt();
		}
		int y,z;
		int b[]=new int[7];
		for(y=0,z=a2.length-1;z>=0;z--,y++)
		{
			b[y]=a2[z];
		}
		for(int i =0; i < 7; i++) {
			System.out.println(b[i]);
		}
		scanner.close();
	}

}
