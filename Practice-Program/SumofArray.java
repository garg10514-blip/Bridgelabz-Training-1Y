import java.util.Scanner;

class SumofArray{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

 int arr[]=new int[5];
 int sum=0;
       
	    //---for loop
	    System.out.println("Array inputs are ");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
        }
       
	   for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
        }
		System.out.println("Sum of Array is : "+sum);
		sc.close();
		}
		}
		
		
		
