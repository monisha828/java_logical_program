import java.util.Scanner;
class FindAllCharOccurence
{
private static Scanner sc;
public static void main (String args[])
{
String facstr;
char ch;
int i=0;
Scanner sc = new Scanner (System.in);
System.out.println("\n enter any String = ");
facstr =sc.nextLine();
System.out.println("\n enter any character to find =");
ch=sc.next().charAt(0);
while(i<facstr.length())
{
if(facstr.charAt(i)==ch)
{
System.out.format("\n %c Found atposition %d",ch,i+1);
}
i++;
}
}
}
