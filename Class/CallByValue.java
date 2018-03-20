class CallByValue
{
int a,b,c;
void show ()
{
System.out.println(a+" "+b+" "+c);
}
void setData (int x,int y,int z)
{
 a=x;
 b=y;
 c=z;
}
public static void main (String args [])
{ 
 CallByValue t1= new CallByValue();
CallByValue t2 = new CallByValue();
t1.setData(10,20,30);
t2.setData(100,200,300);

t1.show();
t2.show();
}
}
