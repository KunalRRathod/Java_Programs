class This 
{
int a,b,c;
void show()
{ 
System.out.println(a+" "+b+" "+c);
}
void setData(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
public static void main (String args[])
{ 
This.t1=new This();
This.t2=new This();

t1.setData(10,20,30);
t2.setData(100,200,300);
t1.show();
t2.show();
}
}
