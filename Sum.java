package in.orangecounty.sajin;
/**
 * Created by sajin on 23/02/17.
 */
public class Sum
{
    public static int sumf(int[]value)
    {
        int i,total=0;
        for(i=0;i<10;i++)
        {
            total = total+value[i];
        }
        return (total);
    }
    public static void main(String[]args)
    {
        int[] nu=new int[10];
        int i;
        int sum=0;
        for(i=0;i<10;i++)
        {
            nu[i]=2;
             sum= sumf(nu);
            System.out.println("The sum is"+sum+".");
        }
    }
}