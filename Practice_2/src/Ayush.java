import java.util.*;
public class Ayush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
      boolean first = true;

        while(true){

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

               if(first){
            	   first=false;
                    min = number;
                  max = number;
               }

                if(number > max){
                    max = number;
                }
            if(number < min){
                min = number;
            }
            }else{
               break;
            }

            scanner.nextLine();//handle input

        }
        System.out.println("min = "+min +", max = "+max);

                scanner.close();
	}

}
