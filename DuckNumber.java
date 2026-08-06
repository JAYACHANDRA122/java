import java.util.*;

public class DuckNumber {
    static Boolean isDuckNumber(int num)
    {
        while(num>0)
        {
            int rem=num%10;
            if(rem==0) return true;
            num=num/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isDuckNumber(num))
            System.out.println(+num+"is a duck number");
        else System.out.println("not a duck number");
    }
}
