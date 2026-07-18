import java.util.*;
public class DivisibleBy3And5 {
    int div(int n)
    {
        if(n%3==0 && n%5==0)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DivisibleBy3And5 obj=new DivisibleBy3And5();
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int ans=obj.div(num);
        if(ans==0)
            System.out.println(+num+" is divisible by both 3 and 5 ");
        else
            System.out.println(+num+" is not divisible by both 3 and 5 ");
    }
}
