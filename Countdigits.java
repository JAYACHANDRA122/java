   import java.util.*;
        class Countdigits
        {
            int digit(int n)
            {
                int count=0;
                while(n!=0)
                {
                    n=n/10;
                    count+=1;
                }
                return count;
            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a number:");
                int num=sc.nextInt();
                Countdigits obj=new Countdigits();
                int ans=obj.digit(num);
                System.out.println("no.of digits in a num:"+ans);


            }
        }
