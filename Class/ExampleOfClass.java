class ExampleOfClass
{
int a=10;
public static void main (String args[])
{
ExampleOfClass t1= new ExampleOfClass();
ExampleOfClass t2= new ExampleOfClass();
System.out.println(t1.a);
System.out.println(t2.a);
t1.a++;
t2.a--;
System.out.println (t1.a);
System.out.println(t2.a);
}
}
