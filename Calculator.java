//four function calculator using commandline
public class Calculator
{
public static void main(String[] arg)
{
int a=Integer.parseInt(arg[0]);
String op = arg[1];

int b=Integer.parseInt(arg[2]);
int z;
if(op.equals("+"))
{z=(a+b);

}
else if(op.equals("-"))
{z=(a-b);}

else if(op.equals("*"))
{z=(a*b);

}
else if(op.equals("/"))
{z=(a/b);

}
else {
throw new java.lang.Error("operator not found");

}
System.out.println(z);



}

}
