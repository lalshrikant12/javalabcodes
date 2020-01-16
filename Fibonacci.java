//fibonacci series using commandline 
public class Fibonacci
{
public static void main(String arg[])
{
int n=Integer.parseInt(arg[0]);
int a=0,b=1,c;
for(int i=2;i<n;i++)
{
c=a+b;
System.out.println("Fibinacci series "+c);
a=b;
b=c;
}

}
}
