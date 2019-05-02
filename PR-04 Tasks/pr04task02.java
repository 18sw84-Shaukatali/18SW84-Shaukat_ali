import java.util.*;
class Table
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a table");
int table=s.nextInt();
System.out.println("Enter the Start of the table");
int a=s.nextInt();


System.out.println("Enter the End of the table");
int b=s.nextInt();
for(int i=a; i<=b; i++)
{
System.out.println(table+"*"+i+"="+table*i);
}}}