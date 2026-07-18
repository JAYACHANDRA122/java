import java.util.*;
public class SumOfDigits {
    int sumdigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=0;
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SumOfDigits obj=new SumOfDigits();
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int ans=obj.sumdigits(num);
        System.out.println("sum of digits:"+ans);
    }
}
