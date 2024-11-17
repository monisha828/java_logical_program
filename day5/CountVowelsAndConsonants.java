class CountVowelsAndConsonants
{
public static void main(String args[])
{
String str="Welcome To My Java Program";
System.out.println("The string lower case is:"+str.toLowerCase());
int vCount=0, cCount=0;
for(int i=0;i<str.length();i++)
{
if("aeiou".indexOf(str.charAt(i))!=-1)
{
vCount++;
}
else if(str.charAt(i)>='a' && str.charAt(i)<='z');
{
cCount++;
}
}
System.out.println("Number of vowels are:"+vCount);
System.out.println("Number of consonants are:"+cCount);
}
}