import java.util.*;
public class ProductOfDigits {
    int productdigit(int n)
    {
        int product=1;
        while(n!=0)
        {
            int rem=n%10;
            product=(product*rem);
            n=n/10;

        }
        return product;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ProductOfDigits obj =new ProductOfDigits();
        System.out.println("enter the bumber:");
        int num=sc.nextInt();
        int ans=obj.productdigit(num);
        System.out.println("the product sum of the number :"+ans);
    }
}
