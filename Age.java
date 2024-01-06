import java.util.Scanner;
class Age
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("User! please enter the Age");
byte Age=scan.nextByte();
System.out.println("The age is = "+Age);
System.out.println("User! please enter the Marks");
short Marks=scan.nextShort();
System.out.println("The age is = "+Marks);
System.out.println("User! please enter the Population");
int Population=scan.nextInt();
System.out.println("The age is = "+Population);
System.out.println("User! please enter the Country's Population");
long CountryPopulation=scan.nextLong();
System.out.println("The age is = "+CountryPopulation);
}
}