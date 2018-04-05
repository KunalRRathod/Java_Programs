class ParameterisedConstructor

{
  int a,b,c;    // Holds the copy of the values received from x,y,z .... As it will free x,y,z to recieve next values //
    ParameterisedConstructor(int x,int y, int z)     //recieves parameterised values of t1,t2,t3 from the main function //
     {
        a=x;
        b=y;
        c=z;
     }
      void show ()                               // shows the value to S.O.P. for printing //
       {
         System.out.println(a+" "+b+" "+c);
       }
        ParameterisedConstructor()                       // Constructor Creation //
          {
          }
         public static void main (String args[])                  // main method //
          {
            ParameterisedConstructor t1 = new ParameterisedConstructor (10,20,30);     // Parameterised Constructor t1 //
            ParameterisedConstructor t2 = new ParameterisedConstructor (100,200,300);   // Parameterised Constructor t2 //
              t1.show ();
              t2.show ();
           ParameterisedConstructor t3 = new ParameterisedConstructor ();              // Default Constructor //
              t3.show ();                                           // will print 0 0 0 as it doesnt holds the value //
          }
      }
