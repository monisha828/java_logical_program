import java.util.Scanner;
class Alphabet
{
public static void main (String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the value:");
    char a= sc.next().charAt(0);
if (a>='a' && a<='z' || a>='A'&& a<='Z') 
{
System.out.println("alphabet");
}
else
{
System.out.println(" is not a alphabet");
}
}
}