import java.util.*;
import java.io.*;
class DataOverFlowException extends IOException{
         DataOverFlowException(String msg){
	         super(msg);
	 }
}
class DataUnderFlowException extends IOException{
         DataUnderFlowException(String msg){
	         super(msg);
	 }
}
class code11{
            public static void main(String[]args) throws DataUnderFlowException ,DataOverFlowException{

		    int arr[] =new int[5];
	            Scanner sc =new Scanner(System.in);

		    System.out.println("Enter integer value");
		    System.out.println("Note : 0 <element <100 ");

		    for(int i=0;i<arr.length;i++){
		            int data=sc.nextInt();
			    if(data<0)

				    throw new DataUnderFlowException("Data is smaller than 0");
			    if(data>100)

				    throw new DataOverFlowException("Data is greater than 100");

			    arr[i] =data;
		    }
		    for(int i=0;i<arr.length;i++){
		    
		             System.out.println(arr[i] + "  " );
		    }
		}
}

