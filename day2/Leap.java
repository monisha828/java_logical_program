import java.util.Scanner;
class Leap
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the value of n");
n=sc.nextInt();
if(n%4==0){
System.out.println("Leap year");
}
else
{
System.out.println("not a leap year");
}
}
}