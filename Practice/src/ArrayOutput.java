import java.util.*;
public class ArrayOutput {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,56,64,3,2,34,23,23};
		int i=1;
		//System.out.println(arr[++i]);
		//System.out.println(arr[++i]++);
		//System.out.println(++arr[++i]);
		System.out.println(arr[++i] + ++arr[++i]);
		System.out.println(arr[i--] - --arr[i=2]);
	}
}
