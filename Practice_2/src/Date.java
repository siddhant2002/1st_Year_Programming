import java.util.*;
public class Date {

	public static void main(String[] args) {
		Scanner sc=new 	Scanner(System.in);
		int d,m,y;
		System.out.println("Enter the date month and year");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		System.out.println(findDay(m,d,y));
	}

	public static String findDay(int month, int day, int year) {
        int k,m=0,n,d=year;
        k=year%100;
        k/=4;
        k+=day;
        if(month==1||month==10)
        m=1;
        else if(month==2||month==3||month==11)
        m=4;
        else if(month==4||month==7)
        m=0;
        else if(month==5)
        m=2;
        else if(month==6)
        m=5;
        else if(month==8)
        m=3;
        else
        m=6;
        if((month==1||month==2)&&((year%4==0&&year%100!=0)||year%400==0))
        m-=1;
        k+=m;
        n=year/100;
        while(true)
        {
            if(n==20||n==19||n==18||n==17)
                break;
            d-=400;
            n=d/100;
        }
        if(n==17)
        k+=4;
        else if(n==18)
        k+=2;
        else if(n==19)
        k+=0;
        else if(n==20)
        k+=6;
        k=k+(year%100);
        int g=k%7;
        if(g==2)
        return "MONDAY";
        else if(g==3)
        return "TUESDAY";
        else if(g==4)
        return "WEDNESDAY";
        else if(g==5)
        return "THRUSDAY";
        else if(g==6)
        return "FRIDAY";
        else if(g==7)
        return "SATURDAY";
        else if(g==1)
        return "SUNDAY";
        else 
        return "WQrong";
    }
}
