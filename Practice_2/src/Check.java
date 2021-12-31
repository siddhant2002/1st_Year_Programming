import java.util.*;
public class Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nm=new ArrayList<>();
		int i;
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
			nm.add(sc.nextInt());
		}
		for(i=0;i<nm.size()-1;i++)
        {
            if(nm.get(i)==nm.get(i+1))
            {
                nm.remove(i);
                i--;
            }
        }
		for(i=0;i<nm.size();i++)
		{
			System.out.print(nm.get(i)+" ");
		}
	}
}
