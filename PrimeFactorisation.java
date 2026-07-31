import java.util.*;
public class PrimeFactorisation {
    static void primeFactor(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            while(num%i==0)
            {
                System.out.println(i);
                num=num/i;
            }
        }
        if(num>1)                    //tc=O00(root n)
        {                            //sc=O(1)
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primeFactor(num);
    }
}
