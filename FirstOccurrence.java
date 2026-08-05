import java.util.*;
public class FirstOccurrence {
    static int firstoccurrence(int[] arr,int key)
    {
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int key=sc.nextInt();
        int res=firstoccurrence(arr,key);
        if(res==-1)
            System.out.println("key not found");
        else
            System.out.println(key+" first occurred at index:"+res);
    }
}
