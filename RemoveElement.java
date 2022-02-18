import java.util.ArrayList;  
import java.util.Scanner;
  
class RemoveElement
{  
   	public static void main(String[] args) 
	{   
      		ArrayList<String> arr = new ArrayList<String>(5);
		String s1,s2,s3,s4,s5;
		int i=1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st element");
		s1 = sc.nextLine();
		arr.add(s1);

		System.out.println("Enter 2st element");
		s2 = sc.nextLine();
		arr.add(s2);

		System.out.println("Enter 3st element");
		s3 = sc.nextLine();
		arr.add(s3);

		System.out.println("Enter 4st element");
		s4 = sc.nextLine();
		arr.add(s4);

		System.out.println("Enter 5st element");
		s5 = sc.nextLine();
		arr.add(s5); 
 
      		System.out.println("The list of the size is: " + arr.size());  
      		for (String name : arr) 
		{  
         		System.out.println("Element"+ i +" is: " + name);
			i++;  
      		}     
      		arr.remove(1);  
      		System.out.println("\nAfter removing the element in ArrayList is : ");    
      		for (String name : arr) 
		{  
         		System.out.println("Name is: " + name);  
      		}  
   }  
}  