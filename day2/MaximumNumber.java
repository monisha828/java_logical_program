import java.util.Scanner;
class MaximumNumber 
{
public static void main (String args[])
{
 Scanner sc =new Scanner(System.in);
  int num1,num2,num3;
System.out.println("enter the number1 :");
  num1=sc.nextInt();
System.out.println("enter the number2 :");
  num2=sc.nextInt();
System.out.println("enter the number3 :");
  num3=sc.nextInt();
if(num1>num2)
{
 System.out.println("mximum number is :"+num1);
}
else if(num1<num2)
{
  System.out.println("mximum number is :"+num2);
}
else
{
 System.out.println("maximum number is :"+num3);
}
}
}