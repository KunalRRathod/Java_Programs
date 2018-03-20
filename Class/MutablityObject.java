class MutablityObject
{
int a=10;
public static void main (String args [])
{
MutablityObject t1 = new MutablityObject ();
MutablityObject t2 = t1;
System.out.println(t1.a);
System.out.println(t2.a);
t1.a++;
t2.a--;
System.out.print (t1.a);
System.out.println (t2.a); 
}
}
