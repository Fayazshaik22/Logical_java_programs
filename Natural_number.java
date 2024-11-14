import java.util.Scanner;
class Natural_Number
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s =input.nextInt();
		System.out.print("Enter The Ending Number : ");
		int i =input.nextInt(); 
		while(s<=i)
		{
			System.out.println(s);
			s++;
		}
	}
}
