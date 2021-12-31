import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int luckBalance(int k, List<List<Integer>> c) {
        int a[]=new int[c.size()];
        int b[]=new int[c.size()];
        int i,j=0,s=0,s1=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=c.get(i).get(0);
            b[i]=c.get(i).get(1);
        }
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    s=a[j];
                    a[j]=a[j+1];
                    a[j+1]=s;
                    s=b[j];
                    b[j]=b[j+1];
                    b[j+1]=s;
                }
            }
        }
        s=0;
        j=0;
        for(i=0;i<a.length;i++)
        {
            if(b[i]==1)
            j++;
            if(b[i]==1&&j<=k)
            {
                s=s+a[i];
            }
            if(b[i]==0)
                s=s+a[i];
            if(b[i]==1&&j>k)
            {
                s1+=a[i];
                j++;
            }
        }
        return (s-s1);
    }
}

public class MultiList{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] contestsRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> contestsRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowTempItems[j]);
                contestsRowItems.add(contestsItem);
            }

            contests.add(contestsRowItems);
        }

        int result = Result.luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}