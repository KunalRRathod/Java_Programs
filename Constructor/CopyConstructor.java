class CopyConstructor
 {  
   int a,b,c;
     CopyConstructor ( int x,int y, int z)
        { 
           a=x;
           b=y;
           c=z;
        }
          void show ()
             {
               System.out.println (a+" "+b+" "+c);
             }
              CopyConstructor (CopyConstructor t)
                { 
                  a=t.a;
                  b=t.b;
                  c=t.c;
                }
                   public static void main (String args [])
                     {
                       CopyConstructor t1 = new CopyConstructor (10,20,30);
                       CopyConstructor t2 = new CopyConstructor (t1);
                         t1.show ();
                         t2.show ();
                       CopyConstructor t3 = new CopyConstructor (t2);
                         t3.show ();
          }
  } 