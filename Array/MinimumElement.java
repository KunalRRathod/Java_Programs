class MinimumElement
{
 public static void main (String args[])
{ 
int a[]={30,60,9,4,57,78};
int min = a[0];
for (int i=1;i<a.length;i++)
{
 if (min > a[i])
{
min = a[i];
}
}
System.out.print(min);
}
}
