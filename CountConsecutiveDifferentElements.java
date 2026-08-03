import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t= sc.nextInt();
   while(t>0)
   {
       int n=sc.nextInt();
       int count=1;
       int prev=sc.nextInt();
       for(int i=1;i<n;i++){
           int current=sc.nextInt();
           if(current!=prev)
           {
               count++;
               
           }
           prev=current;
       }
       System.out.println(count);
       t--;
   }
        
    }
}
