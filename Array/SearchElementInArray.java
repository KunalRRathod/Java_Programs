Class SearchElementInArray
{
public static void main (String args[])
{
 int a[]={45,49,50,60,73,88};
int n=60,i,f=0;
// f= flagbit variable //
// n= no. u wanna search//
 for (i=0;i<a.length;i++)
{
if (a[i]==n)
{
 f=1;
break;
}
}
if (f==1)
 {
System.out.println("Succsess")
}
else 
{ 
System.out.println(" Not Found");
}
}
}
