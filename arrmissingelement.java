import java.util.*;
public class arrmissingelement
{	public static void main(String args[])
{
	int a[]=new int[7];
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter a value of array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=xyz.nextInt();
	}
	for(int i=0;i<a.length;i++)
	    {
		    for(int j=i+1;j<a.length;j++)
		    {   
			    if(a[i]>a[j])
			    {
				    int temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
			    }
		    }
	    }
	    System.out.println("sorted array");
		
        for(int i=0;i<a.length;i++)
	    {
		    System.out.printf("%d\t",a[i]);
	    }
	 System.out.println();
	 System.out.printf("smallest missing element : ");
	int j=0;
	for(int i=a[0];i<a[a.length-1];i++)
	{
		if(i==a[j])
		{
			j++;
			
		}
		else
		{
			 System.out.printf("%d\t",i);
			 return;

		}
	}
	
}
}