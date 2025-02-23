import java.util.*;
class MergeArray
{   int a[],b[];
    int c[]=new int[10];
    void setArray(int a[],int b[])
    {
        this.a=a;
        this.b=b;
    }
    void getMerge()
    {
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            c[k++]=a[i];
            c[k++]=b[i];
        }
        // for(int i=0;i<b.length;i++)
        // {
        //     c[k++]=b[i];
        // }
        for(int i=0;i<c.length;i++)
        {
            System.out.printf("%d\t",c[i]);
        }
    }
}    
public class arrmergealternativebyclassfun {
    public static void main(String[] args) {
        Scanner xyz=new Scanner (System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        System.out.println("enter a first array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }
        System.out.println("enter a Second array");
        for(int i=0;i<a.length;i++)
        {
            b[i]=xyz.nextInt();
        }

        MergeArray mg=new MergeArray();
        mg.setArray(a,b);
        mg.getMerge();
    }
}

