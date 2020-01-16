//greates of three numbers using commandline
public class Three
{
public static void main(String[] arg)
{
int a=Integer.parseInt(arg[0]);
int b=Integer.parseInt(arg[1]);
int c=Integer.parseInt(arg[2]);
if(a>=b && a>=c)
{
System.out.println(a+ "a is greatest");

}
else if(b>=a && b>=c)
{
System.out.println(b+ "b is greatest ");

}
else
{
System.out.println(c +"c is greatest ");
}

}
}
