import java.util.Scanner;
class Number 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int num = input.nextInt();
		if(num%2==0)
			System.out.println("This Number is even:"+num);
		else
			System.out.println("This number is ood:"+num);
	}
}

  
  
