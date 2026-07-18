import java.util.*;
public class CheckPrime {
    int prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        CheckPrime obj=new CheckPrime();
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int ans=obj.prime(num);
        if(ans==0)
            System.out.println(+num +" is a prime number");
        else
            System.out.println(+num +" is not a prime number");
    }
}
