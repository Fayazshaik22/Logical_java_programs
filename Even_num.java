import java.util.Scanner;
class Even_Numbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of is : ");
		int l =input.nextInt();
		for(int s=1;s<=l;s++)
		{
			if(s%2==0)
				System.out.println(s);
		}
	}
}

