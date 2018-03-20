class DefaultMethodOfClass
{
int a,b,c;
void show ()
{
 System.out.println(a+" "+b+" "+c);
}
public static void main (String args [])
{
 DefaultMethodOfClass t1= new DefaultMethodOfClass ();
 DefaultMethodOfClass t2= new DefaultMethodOfClass ();
t1.a=10;
t1.b=20;
t1.c=30;
t2.a=100;
t2.b=200;
t2.c=300;
t1.show();
t2.show();
}
}