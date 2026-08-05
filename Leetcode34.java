import java.util.Scanner;

public class Leetcode24 {
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
    static int lastOccurrence(int[] arr,int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int first = firstoccurrence(arr, key);
        int last=lastOccurrence(arr,key);
        System.out.println("["+first+","+last+"]");
    }
}
