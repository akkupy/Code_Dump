import java.util.*;
class replace
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=obj.nextInt();
        System.out.println("Enter the array");
        int i;
        int a[]=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();

        }
        System.out.println("Enter the position to be changed");
        int c=obj.nextInt();
        System.out.println("Enter the element at the position");
        int x=obj.nextInt();
        a[c-1]=x;
        System.out.println("New array:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    }
}
