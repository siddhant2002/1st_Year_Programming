//import java.util.*;
//import java.util.Arrays;
//import java.util.Scanner;
//public class Number {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n,i,a;
//		n=sc.nextInt();
//		String y[]=new String[n];
//		for(i=0;i<n;i++)
//		{
//			y[i]=sc.next();
//		}
//		n=sc.nextInt();
//		Bicycle[] nm=new Bicycle[n];
//		for(i=0;i<n;i++)
//		{
//			a=sc.nextInt();
//			nm[i]=findBicycleByAge(y,a);
//			
//		}
//	}
//}
//class Bicycle
//{
//	public static Bicycle[] findBicycleByAge(Bicycle ar[] , int age)
//	{
//		Scanner sc=new Scanner(System.in);
//		int a;
//		System.out.println("Enter the age");
//		a=sc.nextInt();
//		Bicycle [] arr=new Bicycle[ar.length];
//		if(a<=age)
//		{
//			for(int i=0;i<ar.length-1;i++)
//			{
//				for(int j=0;j<ar.length-i-1;j++)
//				{
////					if(Arrays.equals(ar[j], ar[j+1]))
////					{
////						Bicycle p=ar[j];
////						ar[j]=ar[j+1];
////						ar[j+1]=p;
////					}
//				}
//			}
//			return ar;
//		}
//	}
//	public static int totalCostByBrand(Bicycle a[] , String n)
//	{
//		int i;
//		for(i=0;i<a.length;i++)
//		{
//			if(n.equals(a[i]))
//				break;
//		}
//		if(i==a.length)
//			return 0;
//		else
//			return i;
//	}
//}
