import java.util.Scanner;
public class Maximum_number2 {
public static void main(String Args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the First number:");
int num1 = input.nextInt();
System.out.println("Enter the secend number:");
int num2 = input.nextInt();
System.out.println("Enter the third number:");
int num3 = input.nextInt();
if(num1>num2)
 System.out.println("Maximum number is"+num1);
 else if(num2>num3)
  System.out.println("Maximum number is"+num2);
  else
  System.out.println("Maximum number is"+num3);
}
}