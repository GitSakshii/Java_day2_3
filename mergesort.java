import java.util.Scanner;
public class mergesort {
    static void merge(int[] arr,int s,int mid,int e)
    {

        int n1=mid-s+1;
        int n2=e-mid;

        int [] ar1=new int[n1];
        int [] ar2=new int[n2];

        for (int i = 0; i < n1; i++)
            ar1[i] = arr[s + i];
        for (int j = 0; j < n2; j++)
            ar2[j] = arr[mid + 1 + j];
        int i=0,j=0,k=s;
        while (i < n1 && j < n2)
        {
            if(ar1[i] <= ar2[j])
            {
                arr[k] = ar1[i];
                i++;
            }
            else
            {
                arr[k] = ar2[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            arr[k] = ar1[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            arr[k] = ar2[j];
            j++;
            k++;
        }

    }
    static void mergeSort(int[] arr,int s,int e)
    {
        if(s<e)
        {
            int mid=(s+e)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
