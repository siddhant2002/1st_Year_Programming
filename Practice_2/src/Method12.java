import java.math.BigInteger;
public class Method12 {
		public static BigInteger Lfactorial(long n){
			BigInteger result= BigInteger.TWO;
			System.out.println(result);
			for(int i=1;i<=n;i++)
			result=result.multiply(new BigInteger(i+""));
			return result;
			}
			public static void main(String [] args){
			System.out.println("factorial of 40 is"+ Lfactorial(40));
			}
}
