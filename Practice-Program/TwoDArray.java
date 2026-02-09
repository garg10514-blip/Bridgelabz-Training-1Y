import java.util.Scanner;
class TwoDArray{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);


System.out.println("Enter the number of row ");
int r=sc.nextInt();

System.out.println("Enter the number of Column ");
int c =sc.nextInt();

int arr[][]=new Int[r][c];

 System.out.println("Array inputs are ");
        for (int i = 0; i < r; i++) {
		for(int j=0;j<c;j++){
		 
            arr[i][j]=sc.nextInt();
        }
		}
		System.out.println("Two D Array is : ");
		for (int i = 0; i < r; i++) {
		for(int j=0;j<c;j++){
		 
           System.out.print(arr[i][j]+" ");
        }
		System.out.println();
		}
		sc.close();
		}
		}
		
		