import java.util.Scanner;
  class Uppercase
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the character :");
    char n=sc.next().charAt(0);
if(n>='A' && n<='Z')
{
 System.out.println("uppercase");
}
else
{
 System.out.println("lowercase");
}
}
} 
