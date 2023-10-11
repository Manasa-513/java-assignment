package package1;

public class SumOfOddNumbers 
{
 public static void main(String[]args)
 {
	 int sum=0;    //Initializing  sum 
	 for(int i=7;i<=21;i++)
	 {
		 if(i%2!=0) //logic for odd numbers
		 {
			sum=sum+i; 
		 }
	 }
	 System.out.println("sum of odd numbers between 7 to 21 is:"+sum);
 }
}
