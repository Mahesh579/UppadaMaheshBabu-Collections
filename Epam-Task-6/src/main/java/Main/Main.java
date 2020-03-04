package Main;
import java.util.*;
import Linked.EpamList;	
public class Main
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        EpamList<Integer> list = new EpamList<Integer>();
        System.out.println("Enter the number of elements to added in the list:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
        	int element=sc.nextInt();
            list.add(element);	
        }
        System.out.println("The added elements in the list are:");
        System.out.println(list);
        System.out.println("Enter the number of elements to removed in the list:");
        int k=sc.nextInt();
        System.out.println("Enter the index of the elements");
        for(int i=0;i<k;i++)
        {
        	int removed=sc.nextInt();
        	list.remove(removed);
        }
        int c=n-k;
        System.out.println("The Updated List is:");
        System.out.println(list);
        System.out.println("The number of elements after updating the list:");
        System.out.println(c);
        System.out.println("The number of elements to get from the index values:");
        int u=sc.nextInt();
        System.out.println("Enter the index values:");
        for(int i=0;i<u;i++)
        {
        	int found=sc.nextInt();
        	System.out.println( list.get(found) );	
        }
        System.out.println("The Updated List Size is:");
        System.out.println(list.size());
    }
}


/*
INPUTS AND OUTPUTS:

Enter the number of elements to added in the list
5
Enter the elements:
10 20 30 40 50
The added elements in the list are:
[10,20,30,40,50]
Enter the number of elements to removed in the list:
2
Enter the index of the elements
2 3
The Updated List is:
[10,20,40]
The number of elements after updating the list:
3
The number of elements to get from the index values:
2
Enter the index values:
0 1
10
20
The Updated List Size is:
3
 */