import java.util.Scanner;
class ArrayExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
       
	    //---for loop
	    System.out.println("Array inputs are ");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
        }
		
		//---for each loop
		for(int i : arr){
			System.out.println(i);
		}
		
    }
}

		
		
