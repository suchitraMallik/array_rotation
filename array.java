import java.util.Scanner;
class Shift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n,d,p,x;
        System.out.println("Enter number of elements in array : ");
        n=sc.nextInt();
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position : ");
        p=sc.nextInt();
        System.out.println("Enter direction : ");
        d=sc.nextInt();
        int temp;
        if(d==0)
        {
            for(int j=1;j<=p;j++)
            {
                temp=arr[0];
                for(int i=0;i<n-1;i++)
                {
                    arr[i]=arr[i+1];
                }
                arr[n-1]=temp;
            }
        }
        if(d==1)
        {
            int tmp=0;
            for(int j=1;j<=p;j++)
            {
                temp=arr[n-1];
                for(int i=n-1;i>0;i--)
                {
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}