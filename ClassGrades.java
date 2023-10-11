package package1;

import java.util.Scanner;

public class ClassGrades 
{
  public static void main(String []args) 
  {
	 Scanner sc=new Scanner(System.in);
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println("enter name of student:");
		 String name=sc.nextLine();
		 System.out.println("enter attendance of student");
		 int attendance=sc.nextInt();
		 sc.nextLine();
	 
	switch(attendance/10)
	{
	case 9:
	case 10:
		System.out.println("grade is:A");
		break;
	case 8:
		System.out.println("grade is:B");
		break;
	case 7:
		System.out.println("grade is:c");
		break;
	case 6:
		System.out.println("grade is:d");
		break;
	case 5:
		System.out.println("grade is:e");
		break;
		default:
			System.out.println("fail");
			break;
	
	}
	 }
  }
}
